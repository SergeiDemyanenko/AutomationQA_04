package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.MPage;
import pages.MainPage;
import runner.BaseTest;

public class HelenVelTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testBrowseLanguagesCheckInCategoryMLanguageMacroX() {

        String expectedResult = "MacroX";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.getBrowseLanguagesMenuClick();

        AbcPage category_m = new AbcPage(getDriver());
        category_m.getCategoryMClick();

        MPage language_macroX = new MPage(getDriver());
        String actualResult = language_macroX.getlanguageMacroXVerify();

        Assert.assertEquals(actualResult, expectedResult);
    }
}