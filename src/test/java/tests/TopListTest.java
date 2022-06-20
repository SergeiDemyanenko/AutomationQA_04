package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.TopListPage;
import pages.TopRatedRealPage;
import runner.BaseTest;

public class TopListTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testGoToTheTopRated() {
        String expectedResult = "Top Rated";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickTopListMenu();

        String actualResult = getDriver().findElement(By.xpath("//div[@id='main']/h2")).getText();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testGoToTheTopRatedRealLanguages() {
        String expectedResult = "Top Rated Real Languages";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickTopListMenu();

        TopRatedRealPage topRatedRealPage = new TopRatedRealPage(getDriver());
        topRatedRealPage.clickTopRatedRealPageClick();

        String actualResult = getDriver().findElement(By.xpath("//div[@id='main']/h2")).getText();
        Assert.assertEquals(actualResult,expectedResult);
    }
}
