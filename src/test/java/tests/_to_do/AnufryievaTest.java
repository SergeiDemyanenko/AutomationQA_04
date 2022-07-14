package tests._to_do;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.browse_languages.letters.JPage;
import pages.MainPage;
import runner.BaseTest;

public class AnufryievaTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testIsBrowseLanguagesSubMenuJ() {
        String expectedResult = "All languages starting with the letter J are shown, sorted by Language.";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage Abc = new AbcPage(getDriver());
        Abc.clickJSubmenu();

        JPage j = new JPage(getDriver());
        String actualResult = j.getTextPTag();


        Assert.assertEquals(actualResult, expectedResult);

    }
}
