package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MPage;
import runner.BaseTest;

public class AuthorOfMathematicaLanguageTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/abc.html";

    @Test
    public void checkAuthorOfMathematicaLanguageTest (){

        String expectedResult = "Brenton Bostick";
        getDriver().get(BASE_URL);

        MPage mp = new MPage(getDriver());

        mp.MLanguagesPage().click();
        mp.mathematicaPage().click();
        String actualResult = mp.BrentonBostick().getText();

        Assert.assertEquals(actualResult, expectedResult);



    }



}




