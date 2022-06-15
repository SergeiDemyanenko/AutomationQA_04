package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.JPage;
import pages.MainPage;
import runner.BaseTest;

public class HelenVelTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testBrowseLanguagesCheckInCategoryALanguageAbstrasu() {

        String expectedResult = "MacroX";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.getBrowseLanguagesMenuClick();

        AbcPage category_m = new AbcPage(getDriver());
        category_m.getCategoryMClick();

        AbcPage language_macroX = new AbcPage(getDriver());
        String actualResult = language_macroX.getlanguageMacroXVerify();

        Assert.assertEquals(actualResult,expectedResult);

    }
}
