package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;

public class MorigorProjectAllTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testVerifyTextOnMainPage() {
        String expectedResult = "one program in 1500 variations";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        Assert.assertEquals(main.getH2HeaderText(), expectedResult);
    }
}
