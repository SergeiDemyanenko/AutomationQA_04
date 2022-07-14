package tests.browse_languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class AbcTest extends BaseTest {

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
    public void testTableTitles() {
        String expectedTableTitles = "Language, Author, Date, Comments, Rate" ;

        String actualTableTitles =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .getTitlesTable();

        Assert.assertEquals(actualTableTitles, expectedTableTitles);
    }

    @Test
    public void testBrowseLanguagesSubmenuText() {

        String expectedBrowseLanguagesSubmenuText = "0-9ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Assert.assertEquals(expectedBrowseLanguagesSubmenuText, openBaseURL()
                .clickBrowseLanguagesMenu()
                .getSubmenu()
                .getText());
    }
}
