package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;

public class IlyaCheshkovTest extends BaseTest {

    private static final String URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testVerifyH1Text() {

        String expectedResult = "99 Bottles of Beer";

        getDriver().get(URL);
        MainPage main = new MainPage(getDriver());

        String actualResult = main.getH1HeaderText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
