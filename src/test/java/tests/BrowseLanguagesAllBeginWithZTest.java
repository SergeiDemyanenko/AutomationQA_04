package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.browse_languages.AbcPage;
import pages.browse_languages.languages.LanguagesBeginWithZ;
import pages.browse_languages.letters.ZPage;
import runner.BaseTest;

public class BrowseLanguagesAllBeginWithZTest extends BaseTest {

    private final String BASE_URL = "http://www.99-bottles-of-beer.net/abc.html";

    protected void clickAnyLanguageBeginWithZ() {

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        ZPage languageZ = new ZPage(getDriver());

        main.clickBrowseLanguagesMenu();
        abc.clickZSubmenu();
        languageZ.getRandomNameOfZ().click();
    }

    @Test
    public void testVerifyAllHeaders() {

        final String expectedResultLanguage = "Language";
        final String expectedResultVoting = "Voting";
        final String expectedResultCategory = "Category";
        final String expectedResultBookmarking = "Bookmarking";
        final String expectedResultAlternatives = "Alternative Versions";
        final String expectedResultComments = "Comments";

        clickAnyLanguageBeginWithZ();

        LanguagesBeginWithZ anyH2 = new LanguagesBeginWithZ(getDriver());

        String actualResultLanguage = anyH2.getH2Text().substring(0, 8);
        String actualResultVoting = anyH2.getH2VotingText();
        String actualResultCategory = anyH2.getH2CategoryText();
        String actualResultBookmarking = anyH2.getH2BookmarkingText();
        String actualResultAlternatives = anyH2.getH2AlternativesText();
        String actualResultComments = anyH2.getH2CommentsText();

        Assert.assertEquals(actualResultLanguage, expectedResultLanguage);
        Assert.assertEquals(actualResultVoting, expectedResultVoting);
        Assert.assertEquals(actualResultCategory, expectedResultCategory);
        Assert.assertEquals(actualResultBookmarking, expectedResultBookmarking);
        Assert.assertEquals(actualResultAlternatives, expectedResultAlternatives);
        Assert.assertEquals(actualResultComments, expectedResultComments);
    }
}
