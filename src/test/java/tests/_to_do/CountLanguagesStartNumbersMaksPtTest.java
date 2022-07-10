package tests._to_do;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.util.List;

public class CountLanguagesStartNumbersMaksPtTest extends BaseTest {

    @Test
    public void testNamesStartNumbersLanguages() {
        getDriver().get("http://www.99-bottles-of-beer.net/");

        getDriver().findElement(By.xpath("//ul[@id='menu']/li/a[@href='/abc.html']")).click();
        getDriver().findElement(By.xpath("//a[@href='0.html']")).click();

        List<WebElement> actualNumbers = getDriver().findElements(By.xpath("//table[@id='category']/tbody/tr[@onmouseover]"));

        Assert.assertEquals(actualNumbers.size(), 10);
    }
}