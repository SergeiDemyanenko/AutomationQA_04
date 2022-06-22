package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HistoryPage;
import pages.StartPage;
import runner.BaseTest;

public class CheckLocalCopyLinkTest extends BaseTest {
    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testCheckLocalCopyLink() {
        String expectedResult = "http://www.99-bottles-of-beer.net/mirrors/1/";
        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());
        startPage.getHistoryMenuClick();

        HistoryPage historyPage = new HistoryPage(getDriver());
        historyPage.getLocalCopyLink().click();

        String actualResult = getDriver().getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
