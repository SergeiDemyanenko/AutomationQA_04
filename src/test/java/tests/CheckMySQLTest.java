package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;


public class CheckMySQLTest extends BaseTest {
    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testBrowseLanguagesLetterM_MySQL() {
        final String expectedMySQL = "MySQL";

        getDriver().get(BASE_URL);
        getDriver().findElement(By.linkText("Browse Languages")).click();
        getDriver().findElement(By.linkText("M")).click();

        String actualMySQL = getDriver().findElement(By.linkText("MySQL")).getText();

        Assert.assertEquals(actualMySQL, expectedMySQL);
    }
}

