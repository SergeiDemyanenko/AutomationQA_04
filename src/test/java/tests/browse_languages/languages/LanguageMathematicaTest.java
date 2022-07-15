package tests.browse_languages.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.languages.LanguageMathematicaPage;
import runner.BaseTest;

public class LanguageMathematicaTest extends BaseTest {

    @Test
    public void testLanguageData() {
        final String expectedAuthorName = "Brenton Bostick";
        final String expectedDate = "03/16/06";
        final String expectedNumberOfComments = "1";

        openBaseURL().
                clickBrowseLanguagesMenu().
                clickMSubmenu().
                clickMathematicaPage();

        LanguageMathematicaPage mathematica = new LanguageMathematicaPage(getDriver());

        String actualAuthorName = mathematica.textOfAuthor();
        String actualDate = mathematica.getDateOfLanguage();
        String actualNumberOfComments = mathematica.getNumberOfComments();

        Assert.assertEquals(actualAuthorName, expectedAuthorName);
        Assert.assertEquals(actualDate, expectedDate);
        Assert.assertEquals(actualNumberOfComments, expectedNumberOfComments);
    }

    @Test
    public void testTheNameOfMathematicaLanguageAuthor() {

        String expectedTheNameOfMathematicaLanguageAuthor = "Brenton Bostick";

        String actualTheNameOfMathematicaLanguageAuthor = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickMSubmenu()
                .clickMathematicaPage()
                .getBrentonBostickText();

        Assert.assertEquals(expectedTheNameOfMathematicaLanguageAuthor, actualTheNameOfMathematicaLanguageAuthor);
    }
}
