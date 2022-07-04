package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import pages.browse_languages.AbcPage;
import pages.browse_languages.letters.UPage;
import pages.start.StartPage;
import pages.top_lists.TopListPage;
import runner.BaseTest;

public class ViktroriiaKTest extends BaseTest {

    private static final String BASE_URL = "https://www.99-bottles-of-beer.net/";

    @Test
    public void CheckStartMenuHeader2() {

        String expectedResult = "Welcome to 99 Bottles of Beer";

        getDriver().get(BASE_URL);
        getDriver().findElement(By.xpath("//div[@id='main']/h2")).getText();

        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='main']/h2")).getText(), expectedResult);
    }

    @Test
    public void checkTopListMenuTopHits() {

        String expectedResult = "Top Hits";

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());

        mainPage.clickTopListMenu();

        TopListPage hits = new TopListPage(getDriver());
        hits.clickTopHitsSubmenu();

        String actualResult = hits.getTextTopHitsSubmenu();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void menuStartMenuHistory() {

        String expectedResult = "https://www.99-bottles-of-beer.net/images/history1_full.png";

        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());

        startPage.clickInfoSubmenu();

        getDriver().findElement(By.xpath("//div[@id='main']/p/a/img[@src='/images/history1_small.png']")).click();

        Assert.assertEquals(getDriver().getCurrentUrl(), expectedResult);

    }

    @Test
    public void clickUPage() {

        getDriver().get(BASE_URL);

        String expectedResult = "U";

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickBrowseLanguagesMenu();

        AbcPage abcPage = new AbcPage(getDriver());
        String actualResult = abcPage.getUSubmenuText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void countLanguagesU() {

        int expectedResult = 25;
        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickBrowseLanguagesMenu();

        AbcPage abcPage = new AbcPage(getDriver());
        abcPage.clickUSubmenu();

        UPage uPage = new UPage(getDriver());

        Assert.assertEquals(uPage.countLanguagesU(),expectedResult);
    }

    @Test
    public void testTitleUPage(){
        String expectedResult = "Category U";
        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickBrowseLanguagesMenu();

        AbcPage abcPage = new AbcPage(getDriver());
        abcPage.clickUSubmenu();

        UPage title = new UPage(getDriver());

        String actualResult= title.getH2PageUText();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testUSubmenuDescription() {

        String expectedResult = "All languages starting with the letter U are shown, sorted by Language.";
        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickBrowseLanguagesMenu();

        AbcPage abcPage = new AbcPage(getDriver());
        abcPage.clickUSubmenu();

        UPage description = new UPage(getDriver());
        String actualResult = description.getPTagText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}

