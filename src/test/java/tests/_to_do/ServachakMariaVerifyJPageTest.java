package tests._to_do;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.browse_languages.letters.JPage;
import pages.MainPage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;


public class ServachakMariaVerifyJPageTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testLinkInTableIsClickable() {

        MainPage main = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        JPage j = new JPage(getDriver());

        getDriver().get(BASE_URL);
        main.clickBrowseLanguagesMenu();
        abc.clickJSubmenu();

        String url = getDriver().getCurrentUrl();
        j.getWebElementsTDLinks().get(j.randomLanguage() - 1).click();


        Assert.assertNotEquals(getDriver().getCurrentUrl(), url);
    }

    @Test
    public void testCheckAuthorDataCommentsForSelectedLanguage() {
        final String languageName = "Joy";

        MainPage main = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        JPage j = new JPage(getDriver());

        getDriver().get(BASE_URL);
        main.clickBrowseLanguagesMenu();
        abc.clickJSubmenu();

        Assert.assertEquals(j.getTrText(languageName), j.getExpectedResult(languageName));
    }

    @Test
    public void testVerifyRandomTrIsDisplayedIsEnabledNotEmpty() {

        MainPage main = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        JPage j = new JPage(getDriver());

        getDriver().get(BASE_URL);
        main.clickBrowseLanguagesMenu();
        abc.clickJSubmenu();

        Assert.assertTrue(j.getRandomTr().isDisplayed());
        Assert.assertTrue(j.getRandomTr().isEnabled());
        Assert.assertFalse(j.getRandomTr().getText().isEmpty());
    }
}