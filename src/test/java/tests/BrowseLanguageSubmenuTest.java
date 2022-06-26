package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.MainPage;
import runner.BaseTest;

public class BrowseLanguageSubmenuTest extends BaseTest {

    private static final String BASE_URL = "https://www.99-bottles-of-beer.net/";

    @Test
    public void testFirstSubmenuIs09() {
        String expectedResult = "0-9";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());

        String actualResult = abc.getZeroSubmenuText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testHowManyCategoriesInBrowseLanguage() {
        int expectedResult = 27;

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());

        int actualResult = abc.getAllSubmenu().size();

        Assert.assertEquals(actualResult, expectedResult);
    }
}