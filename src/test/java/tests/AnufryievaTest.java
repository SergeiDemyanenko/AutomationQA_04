package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.JPage;
import pages.MainPage;
import runner.BaseTest;

public class AnufryievaTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testIsBrowseLanguagesSubMenuJ() {
        String expectedResult = "All languages starting with the letter J are shown, sorted by Language.";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.getBrowseLanguagesMenuClick();

        AbcPage Abc = new AbcPage(getDriver());
        Abc.getCategoryJClick();

        JPage j = new JPage(getDriver());
        String actualResult = j.getDescriptionCategoryJText();


        Assert.assertEquals(actualResult, expectedResult);

    }
}
