package tests.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.languages.MathematicaPage;
import runner.BaseTest;

public class MathematicaTest extends BaseTest {

    @Test
    public void testLanguageData() {
        final String expectedAuthorName = "Brenton Bostick";
        final String expectedDate = "03/16/06";
        final String expectedNumberOfComments = "1";

        openBaseURL().
                clickBrowseLanguagesMenu().
                clickMSubmenu().
                clickMathematicaPage();

        MathematicaPage mathematica = new MathematicaPage(getDriver());

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
