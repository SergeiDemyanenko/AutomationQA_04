package tests.search_languages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.search_languages.SearchPage;
import runner.BaseTest;

import java.util.List;

public class SearchLanguagesTest extends BaseTest {

    final String LANGUAGE_TO_SEARCH = "Java";

    @Test
    public void testH2HeaderText() {
        final String expectedH2HeaderText = "Search Languages";

        String actualH2HeaderText =
                openBaseURL()
                        .clickSearchLanguagesMenu()
                        .clickNewSearchSubmenu()
                        .getH2MainText();

        Assert.assertEquals(actualH2HeaderText, expectedH2HeaderText);
    }

    @Test
    public void testNumberOfLanguagesForJavaSearch() {
        final int expectedNumberOfJavaSearch = 14;

        int actualNumberOfJavaSearch = openBaseURL()
                .clickSearchLanguagesMenu()
                .clickNewSearchSubmenu()
                .enterTextSearchField(LANGUAGE_TO_SEARCH)
                .clickSubmitSearchButton()
                .getCountTrTags();

        Assert.assertEquals(actualNumberOfJavaSearch, expectedNumberOfJavaSearch);
    }

    @Test
    public void testJavaSearch() {
        SearchPage search = new SearchPage(getDriver());

        final String expectedResult = search.getExpectedResult(LANGUAGE_TO_SEARCH);

        String actualJavaSearch = openBaseURL()
                .clickSearchLanguagesMenu()
                .clickSubmitSearchButton()
                .enterTextSearchField(LANGUAGE_TO_SEARCH)
                .clickSubmitSearchButton()
                .getStringTextFromJavaSearch();

        Assert.assertEquals(actualJavaSearch, expectedResult);
    }

    @Test
    public void testSubmitSearchRefreshedWhenSubmitSearchClicked() {
        WebElement submitSearch = openBaseURL()
                .clickSearchLanguagesMenu()
                .getSubmitSearchButton();

        SearchPage search = new SearchPage(getDriver());
        WebElement secondSearchSubmit = search.getSubmitSearchButton();
        Assert.assertEquals(submitSearch, secondSearchSubmit);

        search.clickSubmitSearchButton();
        WebElement newSubmitSearch = search.getSubmitSearchButton();

        Assert.assertNotEquals(submitSearch, newSubmitSearch);
    }

    @Test
    public void testTextMenuAndFooterOfSearch() {

        final String expectedResultSearchMenu = "SEARCH LANGUAGES";
        final String expectedResultFooterSearch = "Search Languages";

        String actualResultSearchMenu = openBaseURL()
                .getSearchMenuText();
        String actualResultFooterSearch = openBaseURL()
                .getFooterSearchText();

        Assert.assertEquals(actualResultSearchMenu, expectedResultSearchMenu);
        Assert.assertEquals(actualResultFooterSearch, expectedResultFooterSearch);
    }

    @Test
    public void testLinkMenuAndFooterOfSearch() {

        final String expectedResultSearch = "http://www.99-bottles-of-beer.net/search.html";

        String actualResultHeader = openBaseURL()
                .getFullLinkSearchLanguagesMenu();
        String actualResultFooter = openBaseURL()
                .getFullLinkFooterSearchLanguages();

        Assert.assertEquals(actualResultHeader, expectedResultSearch);
        Assert.assertEquals(actualResultFooter, expectedResultSearch);
    }

    @Test
    public void test1CEnterprizeSearch() {
        final int expectedNumberOf1CEnterprize = 1;

        int actualNumberOf1CEnterprize =
                openBaseURL()
                        .clickSearchLanguagesMenu()
                        .clickNewSearchSubmenu()
                        .enterTextSearchField("1C Enterprize")
                        .clickSubmitSearchButton()
                        .getCountTrTags();

        Assert.assertEquals(actualNumberOf1CEnterprize, expectedNumberOf1CEnterprize);
    }

    @Test
    public void testEmptySearchReturnsZeroLanguages() {
        final int expectedQuantity = 0;

        int actualQuantity =
                openBaseURL()
                        .clickSearchLanguagesMenu()
                        .clickSubmitSearchButton()
                        .getCountTrTags();

        Assert.assertEquals(actualQuantity, expectedQuantity);
    }
}