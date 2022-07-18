package tests.browse_languages.letters;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.util.List;

public class UTest extends BaseTest {

    @Test
    public void testSubMenuCategoryU() {
        final String expectedSubMenuCategoryU = "U";

        String actualSubMenuCategoryU = openBaseURL()
                .clickBrowseLanguagesMenu()
                .getUSubmenuText();

        Assert.assertEquals(actualSubMenuCategoryU, expectedSubMenuCategoryU);
    }

    @Test
    public void testNumberLanguagesU() {
        final int expectedNumberLanguagesU = 25;

        int actualNumberLanguagesU = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickUSubmenu()
                .getCountTrTags();

        Assert.assertEquals(actualNumberLanguagesU, expectedNumberLanguagesU);
    }

    @Test
    public void testTitleUPage() {
        final String expectedTitleUPage = "Category U";

        String actualTitleUPage = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickUSubmenu()
                .getH2MainText();

        Assert.assertEquals(actualTitleUPage, expectedTitleUPage);
    }

    @Test
    public void testUSubmenuDescription() {

        final String expectedUSubmenuDescription =
                "All languages starting with the letter U are shown, sorted by Language.";
        String actualUSubmenuDescription = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickUSubmenu()
                .getTextPTag();

        Assert.assertEquals(actualUSubmenuDescription, expectedUSubmenuDescription);
    }

    @Test
    public void testTableHeader() {
        final List<String> expectedTableHeader = List.of(
                "Language",
                "Author",
                "Date",
                "Comments",
                "Rate"
        );

        List<String> actualTableHeader =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickUSubmenu()
                        .getTextListThTags();

        Assert.assertEquals(actualTableHeader, expectedTableHeader);
    }
}