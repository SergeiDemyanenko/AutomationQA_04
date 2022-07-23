package tests.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.languages.Perl737Page;
import runner.BaseTest;

public class PerlTest extends BaseTest {

    @Test
    public void testPerlLanguageFeatures() {

        final String expectedPerlLanguageDate = "06/04/05";
        final String expectedPerlLanguageAuthor = "Andrew Savige";
        final String expectedPerlLanguageComments = "76";

        openBaseURL()
                .clickSearchLanguagesMenu()
                .enterTextSearchField("Perl")
                .clickSubmitSearchButton()
                .clickPerlLanguage()
                .getPerlLanguageText();

        Perl737Page lp = new Perl737Page(getDriver());

        String actualPerlLanguageDate = lp.getPerlLanguageDataText();
        String actualPerlLanguageAuthor = lp.getAuthorAndrewSavigeText();
        String actualPerlLanguageComments = lp.getPerlLanguageNumberOfCommentsText();

        Assert.assertEquals(actualPerlLanguageDate, expectedPerlLanguageDate);
        Assert.assertEquals(actualPerlLanguageAuthor, expectedPerlLanguageAuthor);
        Assert.assertEquals(actualPerlLanguageComments, expectedPerlLanguageComments);
    }
}
