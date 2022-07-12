package tests._to_do;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import pages.search_languages.SearchPage;
import pages.start.StartPage;
import runner.BaseTest;
import java.util.ArrayList;
import java.util.List;

public class TatianaPTest extends BaseTest {

    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testSearchSubmitAndSearchAreDisplayed() {

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickSearchMenu();

        SearchPage searchPage = new SearchPage(getDriver());

        Assert.assertTrue(searchPage.getSearchSubmit().isDisplayed());
        Assert.assertTrue(searchPage.getSearchBox().isDisplayed());
    }

    @Test
    public void testVerifyAllSubmenuLinksAreClickable() {
        getDriver().get(BASE_URL);

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add(BASE_URL + "team.html");
        expectedResult.add(BASE_URL + "lyrics.html");
        expectedResult.add(BASE_URL + "info.html");
        expectedResult.add(BASE_URL + "impressum.html");

        StartPage startPage = new StartPage(getDriver());
        List<String> actualResult = new ArrayList<>();
        startPage.clickTeamSubmenu();
        actualResult.add(startPage.getSubmenuCurrentUrl());
        startPage.clickLyricsSubmenu();
        actualResult.add(startPage.getSubmenuCurrentUrl());
        startPage.clickInfoSubmenu();
        actualResult.add(startPage.getSubmenuCurrentUrl());
        startPage.clickImpressumSubmenu();
        actualResult.add(startPage.getSubmenuCurrentUrl());

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSubmitSearchIsClickable(){
       String expectedResult = BASE_URL + "search.html";

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickSearchMenu();

        SearchPage searchPage = new SearchPage(getDriver());
        searchPage.clickSubmitSearch();

        Assert.assertEquals(getDriver().getCurrentUrl(),expectedResult);
    }
}
