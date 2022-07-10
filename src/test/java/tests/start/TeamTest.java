package tests.start;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static pages.start.TeamPage.getTeamPageWebsitesLinksTitles;

public class TeamTest extends BaseTest {

    @Test
    public void testClickabilityOfWebsiteLinks() {

        String expectedTeamPageWebsitesLinksTitles = getTeamPageWebsitesLinksTitles();

        String actualTeamPageWebsitesLinksTitles = openBaseURL()
                .clickStartMenu()
                .clickTeamSubmenu()
                .clickOliverSchadeLink()
                .getDriver().getTitle()
                + openBaseURL()
                .clickStartMenu()
                .clickTeamSubmenu()
                .clickGregorScheithauerLink()
                .getDriver()
                .getTitle();

        Assert.assertEquals(actualTeamPageWebsitesLinksTitles, expectedTeamPageWebsitesLinksTitles);
    }

    @Test
    public void testH3TeamNamesText() {
        List<String> expectedH3TeamNamesText = new ArrayList<>(
                Arrays.asList("Oliver Schade", "Gregor Scheithauer", "Stefan Scheler"));

        List<String> actualH3TeamNamesText =
                openBaseURL()
                        .clickStartMenu()
                        .clickTeamSubmenu()
                        .getListH3TeamName();

        Assert.assertEquals(actualH3TeamNamesText, expectedH3TeamNamesText);
    }
}
