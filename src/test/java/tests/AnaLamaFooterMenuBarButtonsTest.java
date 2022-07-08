package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;

public class AnaLamaFooterMenuBarButtonsTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";
    private static final String BROWSE_LANGUAGE_PAGE_URL = "http://www.99-bottles-of-beer.net/abc.html";
    private static final String SEARCH_PAGE_URL = "http://www.99-bottles-of-beer.net/search.html";

    @Test
    public void testFooterMenuBarMainPage() {

        String expectedResult = "Start | Browse Languages | Search Languages | Top Lists | Guestbook | Submit new Language";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        String actualResult = main.getFooterBarText();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testFooterBrowseLanguageButton(){
        getDriver().get(BASE_URL);
        MainPage main = new MainPage(getDriver());

        main.clickFooterBrowseLanguage();

       Assert.assertEquals(getDriver().getCurrentUrl(), BROWSE_LANGUAGE_PAGE_URL);
    }

    @Test
    public void testFooterSearchButton(){
        getDriver().get(BASE_URL);
        MainPage main = new MainPage(getDriver());

        main.clickFooterSearchButton();

        Assert.assertEquals(getDriver().getCurrentUrl(), SEARCH_PAGE_URL);

    }
}
