package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.JPage;
import pages.MainPage;
import runner.BaseTest;


public class TitleAndDescriptionJPageTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testTitleJPage(){
        String expectedResult = "Category J";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.getBrowseLanguagesMenuClick();

        AbcPage j = new AbcPage(getDriver());
        j.getCategoryJClick();

        JPage title = new JPage(getDriver());

        String actualResult = title.getH2PageJText();

        Assert.assertEquals(actualResult, expectedResult);
    }

}