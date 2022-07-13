package tests.browse_languages.letters;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.letters.IPage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;

@Test
public class ITest extends BaseTest {

    public void testIPageLanguagesCount() {

        final int expectedResult = 44;

        int actualResult = openBaseURL().
                clickBrowseLanguagesMenu().
                clickISubmenu().
                getNumberOfLanguages();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSubmenuCategoryI() {
        final String expectedSubmenuCategoryI = "I";

        String actualubmenuCategoryI = openBaseURL()
                .clickBrowseLanguagesMenu()
                .getISubmenuText();

        Assert.assertEquals(actualubmenuCategoryI, expectedSubmenuCategoryI);

    }

    @Test
    public void testTitleIPage() {
        final String expectedTitleIPage = "Category I";

        String actualTitleIPage = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickISubmenu()
                .getH2HeaderText();

        Assert.assertEquals(actualTitleIPage, expectedTitleIPage);
    }

    @Test
    public void testIPagePTagDescription() {
        final String expectedISubmenuDescription =
                "All languages starting with the letter I are shown, sorted by Language.";

        String actualISubmenuDescription = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickISubmenu()
                .getPTagText();

        Assert.assertEquals(actualISubmenuDescription, expectedISubmenuDescription);
    }

    @Test
    public void testIPageTableHeaderText() {
        final String expectedIPageTableHeaderText = "Language Author Date Comments Rate";

        String actualIPageTableHeaderText = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickISubmenu()
                .getTextStringThTags();

        Assert.assertEquals(actualIPageTableHeaderText, expectedIPageTableHeaderText);
    }

    @Test
    public void testCheckAllTableLinksClickable() {
        List<String> expectedAllTableLinks = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickISubmenu()
                .getListStringTDLinks();

        IPage i = new IPage(getDriver());

        List<String> actualCheckedTableLinks = new ArrayList<>();

        for (String langName : expectedAllTableLinks) {
            getDriver().findElement(By.linkText(langName)).click();
            actualCheckedTableLinks.add(i.getH2HeaderText().substring(9));
            getDriver().navigate().back();
        }

        Assert.assertEquals(actualCheckedTableLinks, expectedAllTableLinks);
    }
}