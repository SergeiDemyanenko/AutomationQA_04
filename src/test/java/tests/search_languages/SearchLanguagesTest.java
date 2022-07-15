package tests.search_languages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.search_languages.SearchPage;
import runner.BaseTest;

public class SearchLanguagesTest extends BaseTest {

    final String LANGUAGE_TO_SEARCH = "Java";

    @Test
    public void testH2HeaderText() {
        final String expectedH2HeaderText = "Search Languages";

        String actualH2HeaderText =
                openBaseURL()
                        .clickSearchLanguagesMenu()
                        .clickSearchSubmenu()
                        .getH2MainText();

        Assert.assertEquals(actualH2HeaderText, expectedH2HeaderText);
    }

    @Test
    public void testNumberOfLanguagesForJavaSearch() {
        final int expectedNumberOfJavaSearch = 14;

        int actualNumberOfJavaSearch = openBaseURL()
                .clickSearchLanguagesMenu()
                .clickSearchSubmenu()
                .sendKeyToSearchBox(LANGUAGE_TO_SEARCH)
                .clickSubmitSearch()
                .countLanguagesJavaSearch();

        Assert.assertEquals(actualNumberOfJavaSearch, expectedNumberOfJavaSearch);
    }

    @Test
    public void testJavaSearch() {
        SearchPage search = new SearchPage(getDriver());

        final String expectedResult = search.getExpectedResult(LANGUAGE_TO_SEARCH);

        String actualJavaSearch = openBaseURL()
                .clickSearchLanguagesMenu()
                .clickSubmitSearch()
                .sendKeyToSearchBox(LANGUAGE_TO_SEARCH)
                .clickSubmitSearch()
                .getStringTextFromJavaSearch();

        Assert.assertEquals(actualJavaSearch, expectedResult);
    }

    @Test
    public void testSubmitSearchRefreshedWhenSubmitSearchClicked() {
        WebElement submitSearch = openBaseURL()
                .clickSearchLanguagesMenu()
                .getSubmitSearch();

        SearchPage search = new SearchPage(getDriver());
        WebElement secondSearchSubmit = search.getSubmitSearch();
        Assert.assertEquals(submitSearch, secondSearchSubmit);

        search.clickSubmitSearch();
        WebElement newSubmitSearch = search.getSubmitSearch();

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
}
