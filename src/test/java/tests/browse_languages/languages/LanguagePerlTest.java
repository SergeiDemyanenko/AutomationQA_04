package tests.browse_languages.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.languages.LanguagePerl737Page;
import runner.BaseTest;

public class LanguagePerlTest extends BaseTest {

    @Test
    public void testPerlLanguageFeatures() {

        final String expectedPerlLanguageDate = "06/04/05";
        final String expectedPerlLanguageAuthor = "Andrew Savige";
        final String expectedPerlLanguageComments = "76";

        openBaseURL()
                .clickSearchMenu()
                .getSearchBoxSendKey("Perl")
                .clickSubmitSearch()
                .clickPerlLanguage()
                .getPerlLanguageText();

        LanguagePerl737Page lp = new LanguagePerl737Page(getDriver());

        String actualPerlLanguageDate = lp.getPerlLanguageDataText();
        String actualPerlLanguageAuthor = lp.getAuthorAndrewSavigeText();
        String actualPerlLanguageComments = lp.getPerlLanguageNumberOfCommentsText();

        Assert.assertEquals(actualPerlLanguageDate, expectedPerlLanguageDate);
        Assert.assertEquals(actualPerlLanguageAuthor, expectedPerlLanguageAuthor);
        Assert.assertEquals(actualPerlLanguageComments, expectedPerlLanguageComments);
    }
}
