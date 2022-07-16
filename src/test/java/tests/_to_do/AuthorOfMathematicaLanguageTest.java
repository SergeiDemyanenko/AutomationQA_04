package tests._to_do;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.languages.LanguageMathematicaPage;
import pages.browse_languages.letters.MPage;
import pages.browse_languages.letters._LettersPage;
import runner.BaseTest;

public class AuthorOfMathematicaLanguageTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/abc.html";

    @Test
    public void checkAuthorOfMathematicaLanguageTest (){
        final String expectedResult = "Brenton Bostick";

        String actualResult =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickMSubmenu()
                        .clickMathematicaPage()
                        .getTdTableBrentonBostick()
                        .getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}




