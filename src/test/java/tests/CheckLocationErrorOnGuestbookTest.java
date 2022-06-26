package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class CheckLocationErrorOnGuestbookTest extends BaseTest {
    public final String START_URL = ("http://www.99-bottles-of-beer.net/");

    @Test
    public void textInputForFieldLocationTest() {
        String expectedResult = "Error: Please enter at least a message, your email address and the security code.";

        getDriver().get(START_URL);
        getDriver().findElement(By.linkText("GUESTBOOK")).click();
        getDriver().findElement(By.linkText("Sign Guestbook")).click();

        getDriver().findElement(By.xpath("//form[@id='addentry']/p/input[2]")).sendKeys("ddd");
        getDriver().findElement(By.xpath("//input[@type='submit']")).click();

        WebElement actualResult = getDriver().findElement(By.xpath("//p[contains(text(), Error)]"));

        Assert.assertEquals(actualResult.getText(), expectedResult);
    }
}
