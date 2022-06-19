package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.TopListTopHitsPage;
import runner.BaseTest;

public class ViktroriiaKTest extends BaseTest {

    private static final String BASE_URL = "https://www.99-bottles-of-beer.net/";

    @Test
    public void CheckStartMenuHeader2() {

        String expectedResult = "Welcome to 99 Bottles of Beer";

        getDriver().get(BASE_URL);
        getDriver().findElement(By.xpath("//div[@id='main']/h2")).getText();

        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='main']/h2")).getText(), expectedResult);
    }

    @Test
    public void checkTopListMenuTopHits() {

        String expectedResult = "Top Hits";

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());

        mainPage.clickTopListMenu();

        TopListTopHitsPage hits = new TopListTopHitsPage(getDriver());
        hits.getTopHitsClick();

        String actualResult = hits.getTopHitsText();

        Assert.assertEquals(actualResult, expectedResult);
    }

}

