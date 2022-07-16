package tests.start;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeamTest extends BaseTest {

    @Test
    public void testClickabilityOfTeamPageLsLaNetLink() {

        String expectedTeamPageLsLaNetLink = "Index of /";

        openBaseURL()
                .clickStartMenu()
                .clickTeamSubmenu()
                .clickOliverSchadeWebsiteLink();

                Assert.assertEquals(getExternalPageURL(), expectedTeamPageLsLaNetLink);
    }

    @Test
    public void testClickabilityOfTeamPageETasteOrgLink() {

        String expectedTeamPageETasteOrgLink = "Ce domaine a été enregistré par Youdot.io";

        openBaseURL()
                .clickStartMenu()
                .clickTeamSubmenu()
                .clickGregorScheithauerLink();

        Assert.assertEquals(getExternalPageTitle(), expectedTeamPageETasteOrgLink);
    }

    @Test
    public void testH3TeamNamesText() {
        List<String> expectedH3TeamNamesText = new ArrayList<>(
                Arrays.asList("Oliver Schade", "Gregor Scheithauer", "Stefan Scheler"));

        List<String> actualH3TeamNamesText =
                openBaseURL()
                        .clickStartMenu()
                        .clickTeamSubmenu()
                        .getTeamNames();

        Assert.assertEquals(actualH3TeamNamesText, expectedH3TeamNamesText);
    }

    @Test
    public void testClickabilityOfTeamPageStsSynfloodDeLink() {
        final String expectedTeamPageStsSynfloodDeLink = "http://sts.synflood.de/";

        openBaseURL()
                .clickStartMenu()
                .clickTeamSubmenu()
                .clickStefanSchelerLink();

        Assert.assertEquals(getExternalPageTitle(), expectedTeamPageStsSynfloodDeLink);
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
                .countAllImages(), expectedTwoImagesOfTeamMembers);
    }
}