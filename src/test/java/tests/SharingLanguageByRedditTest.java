package tests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class SharingLanguageByRedditTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/abc.html";

    @Test
    public void sharingLanguageATest(){

        String expectedResult = "Log in";
        getDriver().get(BASE_URL);
        getDriver().findElement(
                By.xpath("//ul/li/a[@href='/abc.html']")
        ).click();
        getDriver().findElement(
                By.xpath("//table[@id='category']/tbody/tr/td/a[@href='language-a+-11.html']")
        ).click();
        getDriver().findElement(
                By.xpath("//div[@id='voting']/p/a[@title='reddit']")
        ).click();

        String actualResult = getDriver().findElement(
                By.xpath("//div[@class='Step__content']/h1")
        ).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
