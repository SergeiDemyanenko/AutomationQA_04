package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;

public class LessonsTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testH1HeaderMainPage() {
        String expectedResult = "99 Bottles of Beer";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        String actualResult = main.getH1HeaderText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
