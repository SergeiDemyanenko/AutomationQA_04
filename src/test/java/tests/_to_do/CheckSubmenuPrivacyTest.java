package tests._to_do;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.start.StartPage;
import runner.BaseTest;

public class CheckSubmenuPrivacyTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testCheckSubmenuPrivacyIsClickable(){
        String expectedResult = "Privacy";

        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());

        String actualResult = startPage.getPrivacySubmenuText();

        Assert.assertEquals(actualResult,expectedResult);
    }
}
