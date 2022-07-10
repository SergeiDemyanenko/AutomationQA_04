package tests._to_do;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import pages.browse_languages.AbcPage;
import pages.browse_languages.languages.LanguageJavascript1948Page;
import pages.browse_languages.letters.JPage;
import pages.guestbook.GuestbookV2Page;
import pages.guestbook.SignV2Page;
import pages.start.InfoPage;
import pages.start.StartPage;
import pages.submit_new_language.SubmitNewLanguagePage;
import runner.BaseTest;

public class IreneSnitkoTest extends BaseTest {

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

    @Test
    public void testVerifyAttributeSrcCaptchaOnSubmitNewLanguagePage() {

        getDriver().get(BASE_URL);

        MainPage mp = new MainPage(getDriver());

        mp.clickSubmitNewLanguageMenu();

        SubmitNewLanguagePage snl = new SubmitNewLanguagePage(getDriver());

        Assert.assertEquals(snl.getAttributeSrcOfCaptcha(), "/captcha.php");
    }

    @Test
    public void testCheckingTheDisplayOfCaptchaOnSignV2Page() {

        getDriver().get(BASE_URL);

        MainPage mp = new MainPage(getDriver());

        mp.clickGuestbookV2Menu();

        GuestbookV2Page gb = new GuestbookV2Page(getDriver());

        gb.clickSignV2();

        SignV2Page sv2 = new SignV2Page(getDriver());

        Assert.assertTrue(sv2.getImgCaptcha().isDisplayed());
    }
}
