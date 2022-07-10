package tests.browse_languages.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class LanguageShakespeareTest extends BaseTest {

    @Test
    public void testAndCompareShakespeareLanguageLinkFromTwoPages() {
        String expectedCompareShakespeareLanguageLinkFromTwoPages =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickSSubmenu()
                        .getShakespeareLanguage()
                        .getAttribute("href");

        String actualCompareShakespeareLanguageLinkFromTwoPages =
                openBaseURL()
                        .clickTopListMenu()
                        .clickTopHitsSubmenu()
                        .getShakespeareLanguage()
                        .getAttribute("href");

        Assert.assertEquals(actualCompareShakespeareLanguageLinkFromTwoPages, expectedCompareShakespeareLanguageLinkFromTwoPages);
    }
}
