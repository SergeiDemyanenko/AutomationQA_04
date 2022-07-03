package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.start.InfoPage;
import pages.start.StartPage;
import runner.BaseTest;

public class CheckLocalCopyLinkTest extends BaseTest {
    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testCheckLocalCopyLink() {
        String expectedResult = "http://www.99-bottles-of-beer.net/mirrors/1/";
        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());
        startPage.clickInfoSubmenu();

        InfoPage infoPage = new InfoPage(getDriver());
        infoPage.getLinkMirrors1().click();

        String actualResult = getDriver().getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
