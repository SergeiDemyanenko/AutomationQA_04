package tests._to_do;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import pages.search_languages.SearchPage;
import pages.start.InfoPage;
import pages.start.StartPage;
import pages.top_lists.NewCommentsPage;
import pages.top_lists.TopListPage;
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
    public void testVerifyNumberOfLanguagesForJavaSearch() {
        int expectedResult = 14;

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickSearchMenu();

        SearchPage searchPage = new SearchPage(getDriver());
        searchPage.getSearchBoxSendKey("Java");
        searchPage.clickSubmitSearch();

        Assert.assertEquals(searchPage.countLanguagesJavaSearch(), expectedResult);
    }

    @Test
    public void testVerifyH2HeaderOnInfoPage() {
        String expectedResult = "History";

        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());
        startPage.clickInfoSubmenu();

        InfoPage infoPage = new InfoPage(getDriver());

        Assert.assertEquals(infoPage.getH2HeaderText(), expectedResult);
    }

    @Test
    public void testSearchSubmitAndSearchAreDisplayed() {
        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickSearchMenu();

        SearchPage searchPage = new SearchPage(getDriver());

        Assert.assertTrue(searchPage.getSearchSubmit().isDisplayed());
        Assert.assertTrue(searchPage.getSearchBox().isDisplayed());
    }

    @Test
    public void testVerifyNoNewComments() {
        String expectedResult = "";

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickTopListMenu();

        TopListPage topListPage = new TopListPage(getDriver());
        topListPage.clickNewCommentsSubmenu();

        NewCommentsPage newCommentsPage = new NewCommentsPage(getDriver());

        Assert.assertEquals(newCommentsPage.getTextMainP(), expectedResult);
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
    public void testNewCommentsPageVerifyHeaderH2() {
        String expectedResult = "New Comments";

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickTopListMenu();

        TopListPage topListPage = new TopListPage(getDriver());
        topListPage.clickNewCommentsSubmenu();

        NewCommentsPage newCommentsPage = new NewCommentsPage(getDriver());

        Assert.assertEquals(newCommentsPage.getTextH2Main(), expectedResult);
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
