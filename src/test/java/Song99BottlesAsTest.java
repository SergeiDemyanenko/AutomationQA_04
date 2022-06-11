import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.util.List;

public class Song99BottlesAsTest extends BaseTest {

    private static final String URL = "http://www.99-bottles-of-beer.net/lyrics.html";

    @Test
    public void testHW_12_8_ShakespeareIncludeTopHits() {

        getDriver().get(URL);
        getDriver().findElement(By.xpath("//ul[@id='menu']/li/a[@href='/toplist.html']")).click();
        getDriver().findElement(By.xpath("//ul[@id='submenu']/li/a[@href='./tophits.html']")).click();

        List<WebElement> textFindShakespeare = getDriver().findElements(By.xpath("//table[@id='category']/tbody/tr"));
        for (WebElement tr : textFindShakespeare) {
            if (tr.getText().contains("Shakespeare")) {
                int numberShakespeare = Integer.parseInt(tr.getText().substring(0, 1));

                Assert.assertFalse(tr.getText().isEmpty());
                Assert.assertTrue(numberShakespeare <= 6);
            }
        }
    }

    @Test
    public void testHW_12_8_ShakespeareNotIncludeTopRatedReal() {

        getDriver().get(URL);
        getDriver().findElement(By.xpath("//ul[@id='menu']/li/a[@href='/toplist.html']")).click();
        getDriver().findElement(By.xpath("//ul[@id='submenu']/li/a[@href='./toplist_real.html']")).click();

        List<WebElement> textFindShakespeare = getDriver().findElements(By.xpath("//table[@id='category']/tbody/tr"));
        for (WebElement tr : textFindShakespeare) {

            Assert.assertFalse(tr.getText().isEmpty());
            Assert.assertFalse(tr.getText().contains("Shakespeare"));
        }
    }

    @Test
    public void HW_12_9JavaSixVersion() {

        getDriver().get(URL);
        getDriver().findElement(By.linkText("Search Languages")).click();
        getDriver().findElement(By.xpath("//input[@ name='search']")).sendKeys("Java");
        getDriver().findElement(By.xpath("//input[@ type='submit']")).click();

        StringBuilder getTextJava = new StringBuilder();
        int actualyResaltCountJava = 0;
        List<WebElement> getText = getDriver().findElements(By.xpath("//table/tbody/tr"));
        for (WebElement p : getText) {
            getTextJava.append(p.getText().contains("Java"));
            actualyResaltCountJava++;
        }
        if (actualyResaltCountJava >= 6) {
            Assert.assertTrue(true);
        }
    }

}
