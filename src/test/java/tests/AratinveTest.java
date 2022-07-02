package tests;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import runner.BaseTest;
import pages.MainPage;
import pages.AbcPage;

@Ignore
public class AratinveTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net";

    @Test
    public void testSubmenuAbcTitle()  {
        String expectedResult = "0-9";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

//        main.getBrowseLanguagesMenuClick();

        AbcPage page = new AbcPage(getDriver());

//        String actualResult = page.getCategory09Text();

//        Assert.assertEquals(actualResult, expectedResult);
    }
}
