package tests._to_do;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class KatyTBrowseLanguagesTest extends BaseTest {

    private static final String BrowseLanguages = "https://www.99-bottles-of-beer.net/abc.html";

    @Test
    public void testSwitchToLoginPageReddit (){

        String  expectedResult = "Log in";

        getDriver().get(BrowseLanguages);
        getDriver().findElement(By.xpath("//a[@href='k.html']")).click();
        getDriver().findElement(By.xpath("//a[@href='language-kotlin-2901.html']")).click();
        getDriver().findElement(By.xpath("//div[@id='voting']/p/a[@title='reddit']")).click();

        Assert.assertEquals(getDriver().
                findElement(By.xpath("//div[@class='Step__content']/h1")).getText(), expectedResult);
    }
}
