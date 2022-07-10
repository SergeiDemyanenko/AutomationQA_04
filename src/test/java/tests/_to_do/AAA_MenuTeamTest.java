package tests._to_do;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.start.StartPage;
import runner.BaseTest;

public class AAA_MenuTeamTest extends BaseTest {

    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testVerifyText() {
        getDriver().get(BASE_URL);
        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getTeamSubmenu().getText(), "Team");
    }

    @Test
    public void testVerifyLinkText() {
        getDriver().get(BASE_URL);
        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getTeamSubmenu().getAttribute("href"),
                "http://www.99-bottles-of-beer.net/team.html");
    }

    @Test
    public void testVerifyNavigation() {
        getDriver().get(BASE_URL);
        StartPage startPage = new StartPage(getDriver());
        startPage.getTeamSubmenu().click();

        Assert.assertEquals(getDriver().getTitle(), "99 Bottles of Beer | The Team");
    }
}