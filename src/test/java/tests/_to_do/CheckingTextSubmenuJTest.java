package tests._to_do;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class CheckingTextSubmenuJTest extends BaseTest {

    private final String BASE_URL = "http://www.99-bottles-of-beer.net/abc.html";

    @Test
    public void checkingTextSubmenuJTest(){

        getDriver().get(BASE_URL);
        getDriver().findElement(
                By.xpath("//ul[@id='submenu']/li/a[@href='j.html']")
        ).click();
        String actualResult = getDriver().findElement(
                By.xpath("//div[@id='main']/p")
        ).getText();

        Assert.assertEquals(
                actualResult, "All languages starting with the letter J are shown, sorted by Language."
        );
    }
}
