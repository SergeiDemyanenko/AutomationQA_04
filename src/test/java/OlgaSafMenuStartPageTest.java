import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class OlgaSafMenuStartPageTest extends BaseTest {
    private static final String URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testMenuStartPage() {
       getDriver().get(URL);

        String expectedResult = "Welcome to 99 Bottles of Beer";

        getDriver().get(URL);

        WebElement menuStart = getDriver().findElement(
                By.xpath("(//a[@href='/'])[1]"));
        menuStart.click();

        String actualResult = getDriver().findElement(By.xpath("//div[@id='main']/h2")).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
