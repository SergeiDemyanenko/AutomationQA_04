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

        String expectedResult = "one program in 1500 variations";

        String actualResult = openBaseURL().clickStartMenu().getH2HeaderText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}