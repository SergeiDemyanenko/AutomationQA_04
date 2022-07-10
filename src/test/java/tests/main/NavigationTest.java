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

        String newUrl = getDriver().getCurrentUrl();

        Assert.assertTrue(abc.getZeroSubmenu().isEnabled());
        Assert.assertTrue(abc.getZeroSubmenu().isDisplayed());
        Assert.assertTrue(newUrl.contains("0.html"));
    }
}