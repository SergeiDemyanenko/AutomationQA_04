package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SearchPage;
import pages.StartPage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;

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
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Java (object-oriented version)");
        expectedResult.add("Java");
        expectedResult.add("Java (exception oriented)");
        expectedResult.add("Java (bytecode-version with loader)");
        expectedResult.add("Java (Java 5.0 object-oriented version)");
        expectedResult.add("Java (Singing with Java Speech API)");

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());

        mainPage.getSearchMenu().click();

        SearchPage searchPage = new SearchPage(getDriver());

        searchPage.getSearchBoxSendKey("Java");
        searchPage.clickSubmitSearch();

        Assert.assertEquals(searchPage.getOnlyJavaLanguages(), expectedResult);
    }

    @Test
    public void testVerifyNumberOfLanguagesForJavaSearch(){
        getDriver().get(BASE_URL);
        int expectedResult = 14;

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickSearchMenu();

        SearchPage searchPage = new SearchPage(getDriver());
        searchPage.getSearchBoxSendKey("Java");
        searchPage.clickSubmitSearch();

        Assert.assertEquals(searchPage.countLanguagesJavaSearch(), expectedResult);
    }
}
