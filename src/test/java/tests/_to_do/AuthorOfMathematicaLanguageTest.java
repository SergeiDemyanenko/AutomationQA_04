package tests._to_do;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.browse_languages.languages.LanguageMathematicaPage;
import pages.browse_languages.letters.MPage;
import runner.BaseTest;

public class AuthorOfMathematicaLanguageTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/abc.html";

    @Test
    public void checkAuthorOfMathematicaLanguageTest (){

        String expectedResult = "Brenton Bostick";
        getDriver().get(BASE_URL);
        MPage mp = new MPage(getDriver());
        LanguageMathematicaPage lm = new LanguageMathematicaPage(getDriver());
        AbcPage ab = new AbcPage(getDriver());

        ab.clickMSubmenu();
        mp.mathematicaPage().click();
        String actualResult = lm.getTdTableBrentonBostick().getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}




