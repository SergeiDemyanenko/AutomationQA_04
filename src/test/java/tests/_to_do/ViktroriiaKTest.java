package tests._to_do;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import pages.browse_languages.AbcPage;
import pages.browse_languages.letters.UPage;
import pages.start.StartPage;
import pages.top_lists.TopListPage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class ViktroriiaKTest extends BaseTest {

    private static final String BASE_URL = "https://www.99-bottles-of-beer.net/";

    @Test
    public void testCheckStartMenuHeader2() {

        String expectedResult = "Welcome to 99 Bottles of Beer";

        getDriver().get(BASE_URL);
        getDriver().findElement(By.xpath("//div[@id='main']/h2")).getText();

        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='main']/h2")).getText(), expectedResult);
    }

    @Test
    public void testCheckTopListMenuTopHits() {

        String expectedResult = "Top Hits";

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());

        mainPage.clickTopListsMenu();

        TopListPage hits = new TopListPage(getDriver());
        hits.clickTopHitsSubmenu();

        String actualResult = hits.getTextTopHitsSubmenu();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMenuStartMenuHistory() {

        String expectedResult = "https://www.99-bottles-of-beer.net/images/history1_full.png";

        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());

        startPage.clickInfoSubmenu();

        getDriver().findElement(By.xpath("//div[@id='main']/p/a/img[@src='/images/history1_small.png']")).click();

        Assert.assertEquals(getDriver().getCurrentUrl(), expectedResult);

    }

    @Test
    public void testSubMenuCategoryU() {

        getDriver().get(BASE_URL);

        String expectedResult = "U";

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickBrowseLanguagesMenu();

        AbcPage abcPage = new AbcPage(getDriver());
        String actualResult = abcPage.getUSubmenuText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountLanguagesU() {

        int expectedResult = 25;
        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickBrowseLanguagesMenu();

        AbcPage abcPage = new AbcPage(getDriver());
        abcPage.clickUSubmenu();

        UPage uPage = new UPage(getDriver());

        Assert.assertEquals(uPage.getCountTrTags(),expectedResult);
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

        String actualResult= title.getH2HeaderText();

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
        String actualResult = description.getTextPTag();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIsTableHeader() {
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Language");
        expectedResult.add("Author");
        expectedResult.add("Date");
        expectedResult.add("Comments");
        expectedResult.add("Rate");

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickBrowseLanguagesMenu();

        AbcPage abcPage = new AbcPage(getDriver());
        abcPage.clickUSubmenu();

        List<WebElement> tableHeader = getDriver().findElements(By.xpath("//tbody/tr[1]/th"));

        List<String> actualResult = new ArrayList<>();

        for (WebElement name : tableHeader) {
            actualResult.add(name.getText());
        }

        Assert.assertEquals(actualResult, expectedResult);
    }
}

