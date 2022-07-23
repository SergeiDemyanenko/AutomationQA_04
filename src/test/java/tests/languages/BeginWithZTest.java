package tests.languages;

import org.testng.annotations.Test;
import runner.BaseTest;

public class BeginWithZTest extends BaseTest {

    @Test
    public void testVerifyAllHeaders() {

        final String expectedResultLanguage = "Language";
        final String expectedResultVoting = "Voting";
        final String expectedResultCategory = "Category";
        final String expectedResultBookmarking = "Bookmarking";
        final String expectedResultAlternatives = "Alternative Versions";
        final String expectedResultComments = "Comments";

//        openBaseURL()
//                .clickBrowseLanguagesMenu()
//                .clickZSubmenu()
//                .clickRandomNameOfZ();
//
//        LanguagesBeginWithZPage anyH2 = new LanguagesBeginWithZPage(getDriver());
//
//        String actualResultLanguage = anyH2.getH2Text().substring(0, 8);
//        String actualResultVoting = anyH2.getH2VotingText();
//        String actualResultCategory = anyH2.getH2CategoryText();
//        String actualResultBookmarking = anyH2.getH2BookmarkingText();
//        String actualResultAlternatives = anyH2.getH2AlternativesText();
//        String actualResultComments = anyH2.getH2CommentsText();
//
//        Assert.assertEquals(actualResultLanguage, expectedResultLanguage);
//        Assert.assertEquals(actualResultVoting, expectedResultVoting);
//        Assert.assertEquals(actualResultCategory, expectedResultCategory);
//        Assert.assertEquals(actualResultBookmarking, expectedResultBookmarking);
//        Assert.assertEquals(actualResultAlternatives, expectedResultAlternatives);
//        Assert.assertEquals(actualResultComments, expectedResultComments);
    }
}
