package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.LanguageMathematicaPage;
import pages.MPage;
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
        String actualResult = lm.BrentonBostick().getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}




