package tests._to_do;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.start.StartPage;
import runner.BaseTest;

public class StartPageWishesTeamTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testWishesFromTeamStartPage() {

        final String expectedResult = "Have a lot of fun,\n" +
                "Oliver, Gregor and Stefan";

        openBaseURL().clickStartMenu();

        StartPage start = new StartPage(getDriver());
        String actualResult = start.getLastParagraphText();

        Assert.assertEquals(actualResult, expectedResult);
    }

}
