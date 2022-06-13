package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;

public class AnaLamaFooterMenuBarButtonsTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testH1HeaderMainPage() {

        String expectedResult = "Start | Browse Languages | Search Languages | Top Lists | Guestbook | Submit new Language";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        String actualResult = main.getFooterMenuText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
