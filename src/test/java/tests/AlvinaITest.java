package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class AlvinaITest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testH1HeaderMainPage() {
        String expectedResult = "99 Bottles of Beer";

    getDriver().get(BASE_URL);

    String actualResult = getDriver().findElement(By.xpath("//div[@id='header']/h1")).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
