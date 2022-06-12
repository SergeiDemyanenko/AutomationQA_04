package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class FirstTest extends BaseTest {

    @Test
    public void testSimple() {
        getDriver().get("http://www.99-bottles-of-beer.net/");

        getDriver().findElement(By.xpath("//*[@id='submenu']/li[2]/a")).click();

        Assert.assertEquals(
                getDriver().findElement(By.xpath("//*[@id='main']/h2")).getText(),
                "Lyrics of the song 99 Bottles of Beer");
    }
}
