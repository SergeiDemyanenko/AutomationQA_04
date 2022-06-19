package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class CheckMenuStartHeader2Test extends BaseTest {

    @Test
    public void CheckStartMenuHeader2(){

        String expectedResult = "Welcome to 99 Bottles of Beer";

        getDriver().get("http://www.99-bottles-of-beer.net/");
        getDriver().findElement(By.xpath("//div[@id='main']/h2")).getText();

        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='main']/h2")).getText(),expectedResult);
    }
}
