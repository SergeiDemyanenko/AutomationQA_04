package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.top_lists.TopListPage;
import pages.top_lists.TopListRealPage;
import runner.BaseTest;

public class ServachakMariaTopListRealTest extends BaseTest {
    private static final String URL = "https://www.99-bottles-of-beer.net/";

    @Test
    public void testVerifyTextH2Header(){
        String expectedResult = "Top Rated Real Languages";

        MainPage main = new MainPage(getDriver());
        TopListPage topList = new TopListPage(getDriver());
        TopListRealPage realPage = new TopListRealPage(getDriver());

        getDriver().get(URL);
        main.clickTopListMenu();
        topList.clickTopListRealSubmenu();

        String actualResult = realPage.getTextH2Header().trim();

        Assert.assertEquals(actualResult,expectedResult);
    }
}