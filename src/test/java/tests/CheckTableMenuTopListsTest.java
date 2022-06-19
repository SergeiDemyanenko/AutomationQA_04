package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.TopListPage;
import pages.TopListRealPage;
import runner.BaseTest;

public class CheckTableMenuTopListsTest extends BaseTest {
    private static final String URL = "https://www.99-bottles-of-beer.net/";

    @Test
    public void testTableNameMenuTopListsSubmenuTopRatedReal(){
        String expectedResult = "Top Rated Real Languages";

        getDriver().get(URL);

        MainPage main = new MainPage(getDriver());

        main.clickTopListMenu();

        TopListPage topList = new TopListPage(getDriver());

        topList.clickMenuTopListReal();

        TopListRealPage realPage = new TopListRealPage(getDriver());

        String actualResult = realPage.getH2TableName().trim();

        Assert.assertEquals(actualResult,expectedResult);
    }
}