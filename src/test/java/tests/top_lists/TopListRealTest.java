package tests.top_lists;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.top_lists.TopListRealPage;
import runner.BaseTest;

import java.util.List;

public class TopListRealTest extends BaseTest {

    @Test
    public void testH2HeaderText() {
        final String expectedText = "Top Rated Real Languages";

        String actualText =
                openBaseURL()
                        .clickTopListMenu()
                        .clickTopListRealSubmenu()
                        .getTextH2Header()
                        .trim();

        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void testH2HeaderColor() {
        final String expectedColor = "rgba(27, 101, 28, 1)";

        String actualColor =
                openBaseURL()
                        .clickTopListMenu()
                        .clickTopListRealSubmenu()
                        .getH2Header()
                        .getCssValue("color");

        Assert.assertEquals(actualColor, expectedColor);
    }

    @Test
    public void testTableHeaderText(){
        final String expectedTableHeaderText = "# Language Author Date Comments Rate";

        String actualTableHeaderText =
                openBaseURL()
                        .clickTopListMenu()
                        .clickTopListRealSubmenu()
                        .getTextStringThTags();

        Assert.assertEquals(actualTableHeaderText, expectedTableHeaderText);
    }

    @Test
    public void testFirstThreeLanguagesInTheTable(){
        final List<String> expectedLanguages = List.of(
                "1. Express Lori Smallwood 04/20/05 0",
                "2. REBOL Anonymous 04/20/05 1",
                "3. NetLogo (Some kind of logo for Multi Agent System) Antoine Cervoise 07/16/10 0"
        );

        TopListRealPage realPage =
                openBaseURL()
                        .clickTopListMenu()
                        .clickTopListRealSubmenu();

        Assert.assertEquals(realPage.getTextOneElementFromListTrs(0), expectedLanguages.get(0));
        Assert.assertEquals(realPage.getTextOneElementFromListTrs(1), expectedLanguages.get(1));
        Assert.assertEquals(realPage.getTextOneElementFromListTrs(2), expectedLanguages.get(2));
    }

    @Test
    public void testRandomLinkInTableIsClickable() {

        String oldUrl =
                openBaseURL()
                        .clickTopListMenu()
                        .clickTopListRealSubmenu()
                        .getDriver()
                        .getCurrentUrl();

        TopListRealPage realPage = new TopListRealPage(getDriver());

        realPage.getRandomTdLink().click();

        String newUrl = getDriver().getCurrentUrl();

        Assert.assertNotEquals(newUrl, oldUrl);
    }
}