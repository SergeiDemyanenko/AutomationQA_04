package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import pages.top_lists.*;
import runner.BaseTest;

public class TopListTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testGoToTheTopRated() {
        String expectedResult = "Top Rated";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickTopListMenu();

        String actualResult = getDriver().findElement(By.xpath("//div[@id='main']/h2")).getText();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountOfLanguagesInTopRated() {
        int expectedResult = 25;

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickTopListMenu();

        TopListPage topListPage = new TopListPage(getDriver());
        int actualResult = topListPage.getCountTableLinks();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testGoToTheTopRatedRealLanguages() {
        String expectedResult = "Top Rated Real Languages";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickTopListMenu();

        TopListPage topListPage = new TopListPage(getDriver());
        topListPage.clickTopListRealSubmenu();

        TopListRealPage topListRealPage = new TopListRealPage(getDriver());
        String actualResult = topListRealPage.getTextH2Header();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testGoToTheTopRatedEsotericLanguages() {
        String expectedResult = "Top Rated Esoteric Languages";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickTopListMenu();

        TopListPage topListPage = new TopListPage(getDriver());
        topListPage.clickTopListEsotericSubmenu();

        TopListEsotericPage topListEsotericPage = new TopListEsotericPage(getDriver());
        String actualResult = topListEsotericPage.getH2TableEsotericName();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testGoToTheTopRatedAssemblyLanguages() {
        String expectedResult = "Top Rated Assembly Languages";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickTopListMenu();

        TopListPage topListPage = new TopListPage(getDriver());
        topListPage.clickTopListAssemblySubmenu();

        TopListAssemblyPage topListAssemblyPage = new TopListAssemblyPage(getDriver());
        String actualResult = topListAssemblyPage.getH2TableAssemblyName();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testGoToTheTopHits() {
        String expectedResult = "Top Hits";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickTopListMenu();

        TopListPage topListPage = new TopListPage(getDriver());
        topListPage.clickTopHitsSubmenu();

        TopListTopHitsPage topListTopHitsPage = new TopListTopHitsPage(getDriver());
        String actualResult = topListTopHitsPage.getH2TableTopHitsName();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testGoToTheNewLanguagesThisMonth() {
        String expectedResult = "New Languages this month";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickTopListMenu();

        TopListPage topListPage = new TopListPage(getDriver());
        topListPage.clickNewLanguagesThisMonthSubmenu();

        TopListNewLanguagesThisMonthPage topListNewLanguagesThisMonthPage =
                new TopListNewLanguagesThisMonthPage(getDriver());
        String actualResult = topListNewLanguagesThisMonthPage.getH2TableNewLanguagesName();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testGoToTheNewcomments() {
        String expectedResult = "New Comments";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickTopListMenu();

        TopListPage topListPage = new TopListPage(getDriver());
        topListPage.clickNewCommentsSubmenu();

        NewCommentsPage newCommentsPage = new NewCommentsPage(getDriver());
        String actualResult = newCommentsPage.getTextH2Main();

        Assert.assertEquals(actualResult,expectedResult);
    }
}
