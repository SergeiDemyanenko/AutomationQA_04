package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TopListRealPage;
import runner.BaseTest;

public class CheckTableMenuTopListsTest extends BaseTest {
    private static final String URL = "https://www.99-bottles-of-beer.net/toplist.html";

    @Test
    public void testTableNameMenuTopListsSubmenuTopRatedReal(){
        String expectedResult = "Top Rated Real Languages";

        getDriver().get(URL);
        getDriver().findElement(By.linkText("Top Rated Real")).click();

        TopListRealPage realPage = new TopListRealPage(getDriver());

        String actualResult = realPage.getH2TableName().trim();

        Assert.assertEquals(actualResult,expectedResult);
    }
}
