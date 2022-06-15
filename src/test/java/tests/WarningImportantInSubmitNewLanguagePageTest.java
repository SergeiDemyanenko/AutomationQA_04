package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SubmitNewLanguagePage;
import runner.BaseTest;

public class WarningImportantInSubmitNewLanguagePageTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testWarningImportantSubmitNewLanguagePage() {
        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.getSubmitNewLanguageMenu().click();

        SubmitNewLanguagePage submitNewLanguage = new SubmitNewLanguagePage(getDriver());
        String actualResult = submitNewLanguage.getSPAN_IMPORTANT().getText();

        Assert.assertEquals(actualResult, "IMPORTANT:");
        Assert.assertEquals(submitNewLanguage.getSPAN_IMPORTANTSCC_Value("background-color"), "rgba(0, 0, 0, 0)");
        Assert.assertEquals(submitNewLanguage.getSPAN_IMPORTANTSCC_Value("color"), "rgba(255, 255, 255, 1)");
        Assert.assertEquals(submitNewLanguage.getSPAN_IMPORTANTSCC_Value("font-weight"), "700");
    }


}
