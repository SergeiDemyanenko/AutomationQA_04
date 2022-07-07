package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import pages.MainPage;
import pages.browse_languages.AbcPage;
import pages.browse_languages.letters.ZeroPage;
import runner.BaseTest;

public class SabinaSaadZeroPageTest extends BaseTest {
    private static final String URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testH2HeaderText(){
        String expectedResult = "Category 0-9";

        getDriver().get(URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickBrowseLanguagesMenu();

        AbcPage abcPage = new AbcPage(getDriver());
        abcPage.getZeroSubmenu().click();

        ZeroPage zeroPage = new ZeroPage(getDriver());

        String actualResult = zeroPage.getH2HeaderText();

        Assert.assertEquals(actualResult,expectedResult);
    }
}
