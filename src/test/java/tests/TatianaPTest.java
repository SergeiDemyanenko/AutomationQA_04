package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SearchPage;
import pages.StartPage;
import runner.BaseTest;

public class TatianaPTest extends BaseTest {

    private static final String BASE_URL = "https://www.99-bottles-of-beer.net/";

    @Test
    public void testMainPageHeader() {
        String expectedResult = "99 Bottles of Beer ".trim();

        getDriver().get(BASE_URL);
        String actualResult = getDriver().findElement(By.xpath("//div[@id='header']/h1")).getText().trim();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStartPageContainsHistoryMenu() {
        String expectedResult = "History";
        getDriver().get(BASE_URL);

        StartPage start = new StartPage(getDriver());

        Assert.assertEquals(start.getInfoSubmenu().getText(), expectedResult);
    }

    @Test
    public void testSearchFunction() {
        String expectedResult = "Java (object-oriented version)";

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());

        mainPage.getSearchMenu().click();

        SearchPage searchPage = new SearchPage(getDriver());

        searchPage.getSearchBoxSendKey("Java");
        searchPage.getSearchSubmit().click();

        WebElement findJava = getDriver().findElement(By.linkText("Java (object-oriented version)"));

        String actualResult = findJava.getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
