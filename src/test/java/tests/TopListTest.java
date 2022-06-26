package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
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
    public void testGoToTheTopRatedRealLanguages() {
        String expectedResult = "Top Rated Real Languages";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickTopListMenu();

        TopListPage topListPage = new TopListPage(getDriver());
        topListPage.clickMenuTopListReal();

        TopListRealPage topListRealPage = new TopListRealPage(getDriver());
        String actualResult = topListRealPage.getH2TableName();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testGoToTheTopRatedEsotericLanguages() {
        String expectedResult = "Top Rated Esoteric Languages";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickTopListMenu();

        TopListPage topListPage = new TopListPage(getDriver());
        topListPage.clickMenuTopEsotericPage();

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
        topListPage.clickMenuTopListAssembly();

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
        topListPage.clickMenuTopHits();

        TopListTopHitsPage topListTopHitsPage = new TopListTopHitsPage(getDriver());
        String actualResult = topListTopHitsPage.getH2TableTopHitsName();

        Assert.assertEquals(actualResult,expectedResult);
    }
}
