package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HistoryPage;
import pages.StartPage;
import runner.BaseTest;

public class SvetlanaGTest extends BaseTest {
    private static final String BASE_URL = "https://www.99-bottles-of-beer.net/";

    @Test
    public void testVerifyHistoricInformationLink() {

        final String expectedResult = "History";
        final String expectedUrl = "https://www.99-bottles-of-beer.net/info.html";

        getDriver().get(BASE_URL);

        StartPage start = new StartPage(getDriver());
        start.getHistoricInformationLinkClick();

        HistoryPage history = new HistoryPage(getDriver());
        String actualResult = history.getH2HeaderText();

        Assert.assertEquals(actualResult, expectedResult);
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedUrl);
    }

    @Test
    public void testVerifyHereLink() {

        final String expectedUrl = "https://www.99-bottles-of-beer.net/lyrics.html";

        getDriver().get(BASE_URL);

        StartPage start = new StartPage(getDriver());
        start.getHereLinkClick();

        Assert.assertEquals(getDriver().getCurrentUrl(), expectedUrl);
    }
}