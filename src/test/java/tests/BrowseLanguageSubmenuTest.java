package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class BrowseLanguageSubmenuTest extends BaseTest {

    @Test
    public void testTextZeroSubmenu() {
        final String expectedTextZeroSubmenu = "0-9";

        String actualTextZeroSubmenu =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .getZeroSubmenuText();

        Assert.assertEquals(actualTextZeroSubmenu, expectedTextZeroSubmenu);
    }

    @Test
    public void testLinkTextZeroSubmenu(){
        final String expectedLinkTextZeroSubmenu = "http://www.99-bottles-of-beer.net/0.html";

        String actualLinkTextZeroSubmenu =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .getZeroSubmenu()
                        .getAttribute("href");

        Assert.assertEquals(actualLinkTextZeroSubmenu, expectedLinkTextZeroSubmenu);
    }

    @Test
    public void testHowManyCategoriesInBrowseLanguage() {
        int expectedResult = 27;

        int actualResult =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .getAllSubmenu()
                        .size();

        Assert.assertEquals(actualResult, expectedResult);
    }
}