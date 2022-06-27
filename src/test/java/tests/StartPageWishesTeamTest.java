package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.StartPage;
import runner.BaseTest;

public class StartPageWishesTeamTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testWishesFromTeamStartPage() {

        final String expectedResult = "Have a lot of fun,\n" +
                "Oliver, Gregor and Stefan";

        getDriver().get(BASE_URL);

        MainPage startButton = new MainPage(getDriver());
        startButton.clickStartMenu();

        StartPage start = new StartPage(getDriver());
        String actualResult = start.getTeamWishesStartPageText();

        Assert.assertEquals(actualResult, expectedResult);
    }

}
