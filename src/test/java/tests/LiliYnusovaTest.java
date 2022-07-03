package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.LPage;
import pages.MainPage;
import runner.BaseTest;

public class LiliYnusovaTest extends BaseTest {
    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testSubmitNewLanguageCategoryL(){
        final String expectedResult = "Category L";

        getDriver().get(BASE_URL);
        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());
        abc.clickLSubmenu();

        LPage l = new LPage(getDriver());
        String actualResult = l.getText(l.getH2Header());

        Assert.assertEquals(actualResult,expectedResult);

    }

}
