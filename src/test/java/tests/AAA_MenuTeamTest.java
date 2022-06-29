package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StartPage;
import pages.TeamPage;
import runner.BaseTest;

import java.util.List;

public class AAA_MenuTeamTest extends BaseTest {

    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testVerifyText() {
        final String textOliverSchade = "Oliver Schade works as European IT Project Manager for eBay International " +
                "AG in Berlin. Main interests lie in ancient software, ancient programming languages and computer " +
                "technology, movies, whisky and his wife & baby... Besides ancient technology Oliver uses Linux since " +
                "Nov. 1992 and loves huge IT solutions like storage with TBytes, 64-node-clusters running Linux and " +
                "VMWare ESX clusters.";
        final String textGregorScheithauer = "Gregor Scheithauer studies Business Information Systems in Bamberg " +
                "with the emphasis of the business process modelling and the mobile & distributed application systems." +
                " His interests lie in programming, especially Web-based business applications based on J2EE and " +
                "designing with HTML & CSS.";
        final String textStefanScheler = "Stefan Scheler studied Computer Science with a minor in Medical Computer " +
                "Science at the Technical University of Ilmenau, Germany. His interests are primarily focused on the " +
                "development of distributed and operating systems, especially in the context of IT security. Stefan " +
                "previously worked for SUSE Linux and is currently writing his diploma thesis on profiling in " +
                "microkernel architectures.";
        final List<String> expectedResult =
                List.of(textOliverSchade, textGregorScheithauer, textStefanScheler);

        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());
        startPage.clickTeamSubmenu();

        TeamPage teamPage = new TeamPage(getDriver());
        List<String> actualResult = teamPage.getTextFromAuthors();

        Assert.assertEquals(actualResult, expectedResult);
    }
}