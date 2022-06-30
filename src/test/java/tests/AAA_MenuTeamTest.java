package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StartPage;
import runner.BaseTest;

public class AAA_MenuTeamTest extends BaseTest {

    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testVerifyText() {
        String expectedResult = "Team";

        getDriver().get(BASE_URL);
        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getTeamSubmenu().getText(), expectedResult);
    }

    @Test
    public void testVerifyLinkText() {
        String expectedResult = "http://www.99-bottles-of-beer.net/team.html";

        getDriver().get(BASE_URL);
        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getTeamSubmenu().getAttribute("href"), expectedResult);
    }

    @Test
    public void testVerifyNavigation() {
        String expectedResult = "99 Bottles of Beer | The Team";

        getDriver().get(BASE_URL);
        StartPage startPage = new StartPage(getDriver());
        startPage.getTeamSubmenu().click();

        Assert.assertEquals(getDriver().getTitle(), expectedResult);
    }
}