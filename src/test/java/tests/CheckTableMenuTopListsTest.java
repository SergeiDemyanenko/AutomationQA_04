package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class CheckTableMenuTopListsTest extends BaseTest {

    @Test
    public void testTableNameMenuTopListsSubmenuTopRatedReal(){
        final String URL = "https://www.99-bottles-of-beer.net/";

        String expectedResult = "Top Rated Real Languages";

        getDriver().get(URL);
        getDriver().findElement(By.linkText("Top Lists")).click();
        getDriver().findElement(By.linkText("Top Rated Real")).click();

        String actualResult = getDriver().findElement(
                By.xpath("//div[@id='main']/h2")).getText();

        Assert.assertEquals(actualResult,expectedResult);
    }
}
