package tests._to_do;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class TitleOfTableBLanguageTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testTitleOfTable() {

        String expectedResult = "Language Author Date Comments Rate";

        getDriver().get(BASE_URL);

        getDriver().findElement(By.xpath("//body/div[@id='wrap']/div[@id='navigation']" +
                "/ul[@id='menu']/li/a[@href='/abc.html']")).click();


        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='main']/table//tr"))
                .getText(), expectedResult);
    }
}
