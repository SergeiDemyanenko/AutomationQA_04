package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;

public class SubmitNewLanguageTest extends BaseTest {
    private static final String BASE_URL = "https://www.99-bottles-of-beer.net/";

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

    @Test
    public void testMainSubmitNewLanguageVerifyText() {

        final String expectedResult = "SUBMIT NEW LANGUAGE";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        String actualResult = main.getSubmitNewLanguageMenu().getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMainSubmitNewLanguageVerifyLinkText() {

        final String expectedResult = "https://www.99-bottles-of-beer.net/submitnewlanguage.html";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        String actualResult = main.getSubmitNewLanguageMenu().getAttribute("href");

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSubmitNewLanguageVerifyNavigation() {

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.getSubmitNewLanguageMenu().click();

        Assert.assertFalse(getDriver().getPageSource().isEmpty());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("submitnewlanguage"));
    }
}