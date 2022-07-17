package tests._to_do;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.submit_new_language.SubmitNewLanguagePage;
import runner.BaseTest;

public class WarningImportantInSubmitNewLanguagePageTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testWarningImportantSubmitNewLanguagePage() {
        String actualResult =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .getSpanImportant()
                        .getText();

        SubmitNewLanguagePage submitNewLanguage = new SubmitNewLanguagePage(getDriver());

        Assert.assertEquals(actualResult, "IMPORTANT:");
        Assert.assertEquals(submitNewLanguage.getSpanImportantSCCValue("background-color"), "rgba(0, 0, 0, 0)");
        Assert.assertEquals(submitNewLanguage.getSpanImportantSCCValue("color"), "rgba(255, 255, 255, 1)");
        Assert.assertEquals(submitNewLanguage.getSpanImportantSCCValue("font-weight"), "700");
    }
}