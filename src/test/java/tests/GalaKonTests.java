package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.LanguageMathematicaPage;
import pages.MPage;
import pages.MainPage;
import runner.BaseTest;

public class GalaKonTests extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void checkTheNameOfMathematicaLanguageAuthor() {

        String expectedResult = "Brenton Bostick";

        getDriver().get(BASE_URL);

        MainPage mainP = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        MPage mp = new MPage(getDriver());
        LanguageMathematicaPage lmp = new LanguageMathematicaPage(getDriver());

        mainP.getBrowseLanguagesMenuClick();
        abc.getCategoryM().click();
        mp.mathematicaPage().click();
        lmp.BrentonBostick();

        String actualResult = lmp.BrentonBostick().getText();

        Assert.assertEquals(expectedResult, actualResult);
    }
}
