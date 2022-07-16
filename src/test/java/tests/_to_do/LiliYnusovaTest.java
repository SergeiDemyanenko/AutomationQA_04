package tests._to_do;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.letters.LPage;
import pages.browse_languages.letters._LettersPage;
import runner.BaseTest;

public class LiliYnusovaTest extends BaseTest {
    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testSubmitNewLanguageCategoryL(){
        final String expectedResult = "Category L";

        String actualResult =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickLSubmenu()
                        .getH2HeaderText();

        Assert.assertEquals(actualResult,expectedResult);

    }

}
