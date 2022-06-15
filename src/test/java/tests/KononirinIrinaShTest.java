package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;

public class KononirinIrinaShTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testLastItemMenuIsSubmitNewLanguage() {

        String expectedResult = "Submit new Language";
        expectedResult = expectedResult.toLowerCase();

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        String actualResult = main.getSubmitNewLanguageMenuText().toLowerCase();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
