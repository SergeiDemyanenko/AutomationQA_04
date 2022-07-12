package tests.search_languages;

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
                        .clickSearchMenu()
                        .clickSearchSubmenu()
                        .getH2MainText();

        Assert.assertEquals(actualH2HeaderText, expectedH2HeaderText);
    }

    @Test
    public void testNumberOfLanguagesForJavaSearch() {
        final int expectedNumberOfJavaSearch = 14;

        int actualNumberOfJavaSearch = openBaseURL()
                .clickSearchMenu()
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
                .clickSearchMenu()
                .clickSubmitSearch()
                .sendKeyToSearchBox(LANGUAGE_TO_SEARCH)
                .clickSubmitSearch()
                .getStringTextFromJavaSearch();

        Assert.assertEquals(actualJavaSearch, expectedResult);
    }


}
