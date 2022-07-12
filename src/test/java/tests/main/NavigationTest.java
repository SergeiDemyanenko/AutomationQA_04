package tests.main;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.start.StartPage;
import runner.BaseTest;

public class NavigationTest extends BaseTest {

    @Test
    public void testNavigationInfoSubmenu() {
        String expectedNavigationInfoSubmenu = "History";

        String actualNavigationInfoSubmenu = openBaseURL()
                .clickStartMenu()
                .clickInfoSubmenu()
                .getH2HeaderText();

        Assert.assertEquals(actualNavigationInfoSubmenu, expectedNavigationInfoSubmenu);
    }

    @Test
    public void testTextH2MainHeader() {
        String expectedTextH2MainHeader = "The Team";

        StartPage startPage = new StartPage(getDriver());

        String actualTextH2MainHeader = openBaseURL()
                .clickStartMenu()
                .clickTeamSubmenu()
                .getH2MainHeaderText();

        Assert.assertEquals(expectedTextH2MainHeader, actualTextH2MainHeader);
    }

    @Test
    public void testNavigationZeroSubmenu() {
        AbcPage abc = new AbcPage(getDriver());

        openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickZeroSubmenu();

        String currentUrl = getDriver().getCurrentUrl();

        Assert.assertTrue(abc.getZeroSubmenu().isEnabled());
        Assert.assertTrue(abc.getZeroSubmenu().isDisplayed());
        Assert.assertTrue(currentUrl.contains("0.html"));
    }
    
     @Test
     public void testMenuSubmitNewLanguageText() {
        final String expectedMenuText = "Submit new Language".toLowerCase();

        String actualMenuText =
                openBaseURL()
                        .getSubmitNewLanguageMenuText().
                        toLowerCase();

        Assert.assertEquals(actualMenuText, expectedMenuText);
    }

    @Test
    public void testMenuSubmitNewLanguageLinkText() {
        final String expectedLinkText = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";

        String actualLinkText =
                openBaseURL()
                        .getSubmitNewLanguageMenu()
                        .getAttribute("href");

        Assert.assertEquals(actualLinkText, expectedLinkText);
    }

    @Test
    public void testMenuSubmitNewLanguageNavigation() {
        openBaseURL()
                .clickSubmitNewLanguageMenu();

        Assert.assertFalse(getDriver().getPageSource().isEmpty());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("submitnewlanguage"));
   }
   
   @Test
    public void testMenuStartText() {
        final String expectedMenuStartText = "Start";

        String actualMenuStartText =
                openBaseURL()
                        .getStartMenu()
                        .getText();

        Assert.assertEquals(actualMenuStartText, expectedMenuStartText.toUpperCase());
    }

    @Test
    public void testMenuStartLinkText() {
        final String expectedMenuStartLinkText = "http://www.99-bottles-of-beer.net/";

        String actualMenuStartLinkText =
                openBaseURL()
                        .getStartMenu()
                        .getAttribute("href");

        Assert.assertEquals(actualMenuStartLinkText, expectedMenuStartLinkText);
    }
}
