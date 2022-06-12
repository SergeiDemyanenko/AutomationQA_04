package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class ShurikGSubmitNewLanguageTest extends BaseTest {

    @Test(description = "TC_700.001" )
    public void testErrorMessageSubmitLanguageButton() {
        String expectedResult = "Error: Precondition failed - Incomplete Input.";

        getDriver().get("http://www.99-bottles-of-beer.net/submitnewlanguage.html ");
        getDriver().findElement(
                By.xpath("//input[@name='submitlanguage']")).click();
        WebElement errorMessage = getDriver().findElement(
                By.xpath("//div[@id='main']/p"));

        Assert.assertEquals(errorMessage.getText(), expectedResult);
    }
}