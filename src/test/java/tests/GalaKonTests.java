package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
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

    @Test
    public void confirmObjectOrientedVersionHasTheLargestNumberOfComments() {
        int expectedResult = 33;

        getDriver().get(BASE_URL);

        MainPage mainP = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        JPage jp = new JPage(getDriver());
        LanguageJava3Page ljp = new LanguageJava3Page(getDriver());

        mainP.getBrowseLanguagesMenuClick();
        abc.getCategoryJ().click();
        jp.getJavaLanguage().click();

        Assert.assertEquals(expectedResult, ljp.getAmmountOfCommentheaders());
    }
}
