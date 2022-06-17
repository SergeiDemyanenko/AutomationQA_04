package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ImpressumPage;
import runner.BaseTest;

public class CheckSubmenuPrivacyTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testCheckSubmenuPrivacyIsClickable(){
        String expectedResult = "Privacy";

        getDriver().get(BASE_URL);

        ImpressumPage impressumPage = new ImpressumPage(getDriver());

        String actualResult = impressumPage.getImpressumSubmenuText();

        Assert.assertEquals(actualResult,expectedResult);
    }
}
