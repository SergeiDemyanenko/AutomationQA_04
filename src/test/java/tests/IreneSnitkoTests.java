package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import runner.BaseTest;

public class IreneSnitkoTests extends BaseTest {

    private static final String BASE_URL = "https://www.99-bottles-of-beer.net/";

    @Test
    public void testCodeOfBasicOnHistoryPage() {

        getDriver().get(BASE_URL);

        StartPage start = new StartPage(getDriver());

        start.clickInfoSubmenu();

        InfoPage history = new InfoPage(getDriver());

        Assert.assertEquals(history.getCodeOfLanguageBasic(), history.createBasicCode());
    }

    @Test
    public void testCountNumberOfProgrammingLanguagesOnJPage() {

        int expectedResult = 22;

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());

        abc.clickJSubmenu();

        JPage j = new JPage(getDriver());

        Assert.assertEquals(j.getQuantityALinks(), expectedResult);
    }

    @Test
    public void testVerifyLinkToWikipediaFromJavascriptPage1() {

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());

        abc.clickJSubmenu();

        JPage j = new JPage(getDriver());

        j.clickLanguageJavascript1948();

        LanguageJavascript1948Page js1948
                = new LanguageJavascript1948Page(getDriver());

        js1948.clickWikiLink();

        Assert.assertTrue(getDriver().findElement(By.xpath("//div[@id='content']/h1")).isDisplayed());
    }

    @Test
    public void testVerifyAttributesSrcOfMessageIcons () {

        getDriver().get(BASE_URL);

        MainPage mp = new MainPage(getDriver());

        mp.clickGuestbookV2Menu();

        GuestbookV2Page gb = new GuestbookV2Page(getDriver());

        gb.clickSignV2();

        SignV2Page sv2 = new SignV2Page(getDriver());

        Assert.assertEquals(sv2.getAttributesSrcOfImg(), sv2.createAttributesSrcOfImg());
    }
}
