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

    @Test (description = "TC_700.003")
    public void testErrorMessageSubmitLanguageButton() {
        final String expectedResultErrorMessageSubmitLanguageButtonError = "Error";
        final String expectedResultErrorMessageSubmitLanguageButtonPrecondition = "Precondition";
        final String expectedResultErrorMessageSubmitLanguageButtonIncomplete = "Incomplete";
        final String expectedResultErrorMessageSubmitLanguageButtonInput = "Input";
        final String expectedResultErrorMessageSubmitLanguageButtonFailed  = "failed";
        final String expectedResultErrorMessageSubmitLanguageButton1 = ":";
        final String expectedResultErrorMessageSubmitLanguageButton2 = "-";
        final String expectedResultErrorMessageSubmitLanguageButton3 = ".";

        String actualErrorMessageSubmitLanguageButtonError =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(0,5);
        String actualErrorMessageSubmitLanguageButtonPrecondition =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(7,19);
        String actualErrorMessageSubmitLanguageButtonIncomplete =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(29,39);
        String actualErrorMessageSubmitLanguageButtonInput =
                openBaseURL().clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(40,45);
        String actualErrorMessageSubmitLanguageButtonFailed =
                openBaseURL().clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(20,26);
        String actualErrorMessageSubmitLanguageButton1 =
                openBaseURL().clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(5,6);
        String actualErrorMessageSubmitLanguageButton2 =
                openBaseURL().clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(27,28);
        String actualErrorMessageSubmitLanguageButton3 =
                openBaseURL().clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(45);

        Assert.assertEquals(actualErrorMessageSubmitLanguageButtonError,
                expectedResultErrorMessageSubmitLanguageButtonError);
        Assert.assertEquals(actualErrorMessageSubmitLanguageButtonPrecondition,
                expectedResultErrorMessageSubmitLanguageButtonPrecondition);
        Assert.assertEquals(actualErrorMessageSubmitLanguageButtonIncomplete,
                expectedResultErrorMessageSubmitLanguageButtonIncomplete);
        Assert.assertEquals(actualErrorMessageSubmitLanguageButtonInput,
                expectedResultErrorMessageSubmitLanguageButtonInput);
        Assert.assertEquals(actualErrorMessageSubmitLanguageButtonFailed,
                expectedResultErrorMessageSubmitLanguageButtonFailed);
        Assert.assertEquals(actualErrorMessageSubmitLanguageButton1,
                expectedResultErrorMessageSubmitLanguageButton1);
        Assert.assertEquals(actualErrorMessageSubmitLanguageButton2,
                expectedResultErrorMessageSubmitLanguageButton2);
        Assert.assertEquals(actualErrorMessageSubmitLanguageButton3,
                expectedResultErrorMessageSubmitLanguageButton3);
    }



}
