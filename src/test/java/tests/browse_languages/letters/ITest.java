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
                getCountTrTags();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSubmenuCategoryI() {
        final String expectedSubmenuCategoryI = "I";

        String actualSubmenuCategoryI = openBaseURL()
                .clickBrowseLanguagesMenu()
                .getISubmenuText();

        Assert.assertEquals(actualSubmenuCategoryI, expectedSubmenuCategoryI);

    }

    @Test
    public void testTitleIPage() {
        final String expectedTitleIPage = "Category I";

        String actualTitleIPage = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickISubmenu()
                .getH2MainText();

        Assert.assertEquals(actualTitleIPage, expectedTitleIPage);
    }

    @Test
    public void testIPagePTagDescription() {
        final String expectedISubmenuDescription =
                "All languages starting with the letter I are shown, sorted by Language.";

        String actualISubmenuDescription = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickISubmenu()
                .getTextPTag();

        Assert.assertEquals(actualISubmenuDescription, expectedISubmenuDescription);
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
            actualCheckedTableLinks.add(i.getH2Main().getText().substring(9));
            getDriver().navigate().back();
        }

        Assert.assertEquals(actualCheckedTableLinks, expectedAllTableLinks);
    }
}