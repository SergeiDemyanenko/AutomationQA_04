package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.JPage;
import pages.MPage;
import pages.MainPage;
import runner.BaseTest;

public class MaksPtTest extends BaseTest {

    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testDescriptionLanguagesJ() {
        final String expectedResult = "All languages starting with the letter J are shown, sorted by Language.";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.getBrowseLanguagesMenuClick();

        AbcPage abc = new AbcPage(getDriver());
        abc.getCategoryJClick();

        JPage j = new JPage(getDriver());
        String actualResult = j.getDescriptionCategoryJText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLastLanguageInM() {
        final String expectedResult = "MySQL";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.getBrowseLanguagesMenuClick();

        AbcPage abc = new AbcPage(getDriver());
        abc.getCategoryMClick();

        MPage m = new MPage(getDriver());
        String actualResult = m.getLastLanguageInMText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}