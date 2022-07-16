package tests._to_do;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.letters.ZeroPage;
import runner.BaseTest;

public class SabinaSaadZeroPageTest extends BaseTest {
    private static final String URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testH2HeaderText(){
        String expectedResult = "Category 0-9";

        openBaseURL().clickBrowseLanguagesMenu().getZeroSubmenu().click();

        ZeroPage zeroPage = new ZeroPage(getDriver());

        String actualResult = zeroPage.getH2MainText();

        Assert.assertEquals(actualResult,expectedResult);
    }
}
