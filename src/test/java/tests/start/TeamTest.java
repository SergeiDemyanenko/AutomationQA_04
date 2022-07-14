package tests.start;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static pages.start.TeamPage.*;

public class TeamTest extends BaseTest {

    @Test
    public void testClickabilityOfTeamPageLsLaNetLink() {

        String expectedTeamPageLsLaNetLink = getTeamPageLsLaNetLinkTitle();

        String actualTeamPageLsLaNetLink = openBaseURL()
                .clickStartMenu()
                .clickTeamSubmenu()
                .clickOliverSchadeLink()
                .getDriver().getTitle();

        Assert.assertEquals(actualTeamPageLsLaNetLink, expectedTeamPageLsLaNetLink);
    }

    @Test
    public void testClickabilityOfTeamPageETasteOrgLink() {

        String expectedTeamPageETasteOrgLink = getTeamPageETasteOrgLinkTitle();

        String actualTeamPageETasteOrgLink = openBaseURL()
                .clickStartMenu()
                .clickTeamSubmenu()
                .clickGregorScheithauerLink()
                .getDriver()
                .getTitle();

        Assert.assertEquals(actualTeamPageETasteOrgLink, expectedTeamPageETasteOrgLink);
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

    @Test
    public void testClickabilityOfTeamPageStsSynfloodDeLink() {
        final String expectedTeamPageStsSynfloodDeLink = "http://sts.synflood.de/";

        String actualTeamPageStsSynfloodDeLink = openBaseURL()
                .clickStartMenu()
                .clickTeamSubmenu()
                .clickStefanSchelerLink()
                .getDriver().getCurrentUrl();

        Assert.assertEquals(actualTeamPageStsSynfloodDeLink, expectedTeamPageStsSynfloodDeLink);
    }

    @Test
    public void testAllLinksTeamPage() {

        List<String> expectedAllLinks = new ArrayList<>();
        expectedAllLinks.add("ls-la.net");
        expectedAllLinks.add("E-Taste.org");
        expectedAllLinks.add("sts.synflood.de");

        List<String> actualAllLinks =
                openBaseURL()
                        .clickStartMenu()
                        .clickTeamSubmenu()
                        .getAllLinks();

        Assert.assertEquals(actualAllLinks, expectedAllLinks);
    }

    @Test
    public void testTwoImagesOfTeamMembers() {
        int expectedTwoImagesOfTeamMembers = 2;

        Assert.assertEquals(openBaseURL()
                .clickStartMenu()
                .clickTeamSubmenu()
                .getAmmountOfImages(), expectedTwoImagesOfTeamMembers);
    }
}