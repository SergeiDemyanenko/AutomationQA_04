package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
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
        MPage mp = new MPage(getDriver());

        mainP.getBrowseLanguagesMenuClick();
        mp.MLanguagesPage().click();
        mp.mathematicaPage().click();

        String actualResult = mp.BrentonBostick().getText();

        Assert.assertEquals(expectedResult, actualResult);

    }
}
