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
    public void testTableTitles() {
        String expectedTableTitles = "Language, Author, Date, Comments, Rate";

        String actualTableTitles =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .getTitlesTable();

        Assert.assertEquals(actualTableTitles, expectedTableTitles);
    }

    @Test
    public void testAllNamesOfSubmenu() {

        final String expectedResultAllNamesOfSubmenu = "0-9ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String actualResultAllNamesOfSubmenu = openBaseURL()
                .clickBrowseLanguagesMenu()
                .getAllNamesOfSubmenu();

        Assert.assertEquals(
                actualResultAllNamesOfSubmenu, expectedResultAllNamesOfSubmenu);
    }

    @Test
    public void testSubmitNewLanguageCategoryL() {
        final String expectedResult = "Category L";

        String actualResult =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickLSubmenu()
                        .getH2MainText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}