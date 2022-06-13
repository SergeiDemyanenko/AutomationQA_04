package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class TatianaPTest extends BaseTest {

    private static final String BASE_URL = "https://www.99-bottles-of-beer.net/";

    @Test
    public void testMainPageHeader(){
        String expectedResult = "99 Bottles of Beer ".trim();

        getDriver().get(BASE_URL);
        String actualResult = getDriver().findElement(By.xpath("//div[@id='header']/h1")).getText().trim();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
