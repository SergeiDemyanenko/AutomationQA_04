package tests._to_do;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.letters.AbcPage;
import pages.browse_languages.letters.UPage;
import pages.browse_languages.letters._LettersPage;
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

        openBaseURL().clickTopListsMenu();

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

        startPage.clickHistorySubmenu();

        getDriver().findElement(By.xpath("//div[@id='main']/p/a/img[@src='/images/history1_small.png']")).click();

        Assert.assertEquals(getDriver().getCurrentUrl(), expectedResult);

    }

    @Test
    public void testSubMenuCategoryU() {

        String expectedResult = "U";

        String actualResult =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .getUSubmenuText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountLanguagesU() {
        int expectedResult = 25;

        int actualResult =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickUSubmenu()
                        .getCountTrTags();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTitleUPage() {
        String expectedResult = "Category U";

        String actualResult =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickUSubmenu()
                        .getH2HeaderText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testUSubmenuDescription() {
        final String expectedResult = "All languages starting with the letter U are shown, sorted by Language.";

        String actualResult =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickUSubmenu()
                        .getTextPTag();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIsTableHeader() {
        final List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Language");
        expectedResult.add("Author");
        expectedResult.add("Date");
        expectedResult.add("Comments");
        expectedResult.add("Rate");

        openBaseURL()
                .clickBrowseLanguagesMenu();

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

