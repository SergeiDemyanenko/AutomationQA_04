package tests.browse_languages.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class ShakespeareTest extends BaseTest {

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
                        .clickTopListsMenu()
                        .clickTopHitsSubmenu()
                        .getShakespeareLanguage()
                        .getAttribute("href");

        Assert.assertEquals(actualCompareShakespeareLanguageLinkFromTwoPages, expectedCompareShakespeareLanguageLinkFromTwoPages);
    }

    @Test
    public void testNumberOfComments(){
        final int expectedResult = 6;

        int actualNumberOfComments =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickSSubmenu()
                        .clickShakespeareLanguage()
                                .countComments();
        Assert.assertEquals(actualNumberOfComments, expectedResult);
    }
}
