package tests._to_do;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;

public class H2TextVerifyOnMainPageKarinaKTest extends BaseTest {
    public final String START_URL = ("http://www.99-bottles-of-beer.net/");

    @Test
    public void h2TextVerifyOnMainPageTest() {

        getDriver().get(START_URL);
        MainPage main = new MainPage(getDriver());

        String expectedResult = "one program in 1500 variations";

        getDriver().findElement(By.xpath("//ul[@id='menu']/li/a[@href='/']")).click();

        Assert.assertEquals(main.getH2HeaderText(), expectedResult);
    }
}