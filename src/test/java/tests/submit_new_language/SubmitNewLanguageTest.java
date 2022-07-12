package tests.submit_new_language;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class SubmitNewLanguageTest extends BaseTest {

    @Test
    public void testSubmitNewLanguageTextViaFooter() {
        final String expectedTextViaFooter = "Submit New Language";

        String actualTextViaFooter =
                openBaseURL()
                        .clickFooterSubmitNewLanguage()
                        .getTitleH2Text();

        Assert.assertEquals(actualTextViaFooter, expectedTextViaFooter);
    }

    @Test
    public void testErrorMessageSubmitLanguageButton() {
        final String expectedResultErrorMessageSubmitLanguageButtonError = "Error: " +
                "Precondition failed - Incomplete Input.";

        String actualErrorMessageSubmitLanguageButtonError =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText();

        Assert.assertEquals(actualErrorMessageSubmitLanguageButtonError,
                expectedResultErrorMessageSubmitLanguageButtonError);
    }
}
