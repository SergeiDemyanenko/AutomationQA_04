package tests.main;

import org.testng.Assert;
import org.testng.annotations.Test;
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
}
