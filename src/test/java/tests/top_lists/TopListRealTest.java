package tests.top_lists;

import org.testng.Assert;
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
                        .clickTopListsMenu()
                        .clickTopListRealSubmenu()
                        .getH2MainText()
                        .trim();

        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void testH2HeaderColor() {
        final String expectedColor = "rgba(27, 101, 28, 1)";

        String actualColor =
                openBaseURL()
                        .clickTopListsMenu()
                        .clickTopListRealSubmenu()
                        .getH2Main()
                        .getCssValue("color");

        Assert.assertEquals(actualColor, expectedColor);
    }

    @Test
    public void testTableHeaderText() {
        final String expectedTableHeaderText = "# Language Author Date Comments Rate";

        String actualTableHeaderText =
                openBaseURL()
                        .clickTopListsMenu()
                        .clickTopListRealSubmenu()
                        .getTextStringThTags();

        Assert.assertEquals(actualTableHeaderText, expectedTableHeaderText);
    }

    @Test
    public void testFirstThreeLanguagesInTheTable() {
        final List<String> expectedLanguages = List.of(
                "1. Express Lori Smallwood 04/20/05 0",
                "2. REBOL Anonymous 04/20/05 1",
                "3. NetLogo (Some kind of logo for Multi Agent System) Antoine Cervoise 07/16/10 0"
        );

        TopListRealPage realPage =
                openBaseURL()
                        .clickTopListsMenu()
                        .clickTopListRealSubmenu();

        Assert.assertEquals(realPage.getTextOneElementFromListTrs(0), expectedLanguages.get(0));
        Assert.assertEquals(realPage.getTextOneElementFromListTrs(1), expectedLanguages.get(1));
        Assert.assertEquals(realPage.getTextOneElementFromListTrs(2), expectedLanguages.get(2));
    }

    @Test
    public void testRandomLinkInTableIsClickable() {

        String oldUrl =
                openBaseURL()
                        .clickTopListsMenu()
                        .clickTopListRealSubmenu()
                        .getDriver()
                        .getCurrentUrl();

        TopListRealPage realPage = new TopListRealPage(getDriver());

        realPage.getRandomTdLink().click();

        String newUrl = getDriver().getCurrentUrl();

        Assert.assertNotEquals(newUrl, oldUrl);
    }

    @Test
    public void testUrlSchemeLanguage() {
        final String expectedUrl = "http://www.99-bottles-of-beer.net/language-scheme-582.html";
        final String SchemeLanguage = "Scheme (original version)";

        String actualUrl =
                openBaseURL()
                        .clickTopListsMenu()
                        .clickTopListRealSubmenu()
                        .clickLanguage(SchemeLanguage)
                        .getURL();

        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test
    public void testHeaderTextSchemeLanguage() {
        final String expectedHeader = "Language Scheme";
        final String SchemeLanguage = "Scheme (original version)";

        String actualHeader =
                openBaseURL()
                        .clickTopListsMenu()
                        .clickTopListRealSubmenu()
                        .clickLanguage(SchemeLanguage)
                        .getH2MainText();

        Assert.assertEquals(actualHeader, expectedHeader);
    }
}