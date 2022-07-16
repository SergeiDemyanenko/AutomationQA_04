package tests._to_do;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.letters.JPage;
import pages.browse_languages.letters._LettersPage;
import runner.BaseTest;

public class AnufryievaTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testIsBrowseLanguagesSubMenuJ() {
        final String expectedResult = "All languages starting with the letter J are shown, sorted by Language.";

        String actualResult =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickJSubmenu()
                        .getTextPTag();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
