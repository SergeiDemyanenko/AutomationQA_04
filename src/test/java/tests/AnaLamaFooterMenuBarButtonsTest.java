package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;

public class AnaLamaFooterMenuBarButtonsTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";
    private static final String BROWSE_LANGUAGE_PAGE_URL = "http://www.99-bottles-of-beer.net/abc.html";

    @Test
    public void testFooterMenuBarMainPage() {

        String expectedResult = "Start | Browse Languages | Search Languages | Top Lists | Guestbook | Submit new Language";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        String actualResult = main.getFooterMenuText();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testFooterBrowseLanguageButton(){
        getDriver().get(BASE_URL);
        MainPage main = new MainPage(getDriver());

        main.getBrowseLanguagesMenuClick();

       Assert.assertEquals(getDriver().getCurrentUrl(), BROWSE_LANGUAGE_PAGE_URL);
    }
}
