package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class MorigorProjectAllTest extends BaseTest {

    @Test
    public void testTextOnMainPage() {
        final String expectedTextOnMainPage = "one program in 1500 variations";

        String actualTextOnMainPage =
                openBaseURL()
                        .getH2HeaderText();

        Assert.assertEquals(actualTextOnMainPage, expectedTextOnMainPage);
    }

    @Test
    public void testSignGuestbookErrorMessage() {
        final String expectedSignGuestbookErrorMessage = "Error: Please enter at least a message, your email address and the security code.";

        String actualSignGuestbookErrorMessage =
                openBaseURL()
                        .clickGuestbookV2Menu()
                        .clickSignV2()
                        .clickButtonSubmit()
                        .getErrorMessageText();

        Assert.assertEquals(actualSignGuestbookErrorMessage, expectedSignGuestbookErrorMessage);
    }

    @Test
    public void testVerificationOfHomepageAttribute() {
        final String expectedVerificationOfHomepageAttribute = "http://";

        String actualVerificationOfHomepageAttribute =
                openBaseURL()
                        .clickGuestbookV2Menu()
                        .clickSignV2()
                        .getInputHomepageAttribute();

        Assert.assertEquals(actualVerificationOfHomepageAttribute, expectedVerificationOfHomepageAttribute);
    }

    @Test
    public void testSubmitNewLanguageTextViaFooter() {
        final String expectedSubmitNewLanguageTextViaFooter = "Submit New Language";

        String actualSubmitNewLanguageTextViaFooter =
                openBaseURL()
                        .clickFooterSubmitNewLanguage()
                        .getTitleH2Text();

        Assert.assertEquals(actualSubmitNewLanguageTextViaFooter, expectedSubmitNewLanguageTextViaFooter);
    }

    @Test
    public void testNumberOfYLanguages() {
        final int expectedNumberOfYLanguages = 9;

        int actualNumberOfYLanguages =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickYSubmenu()
                        .getNumberOfLanguages();

        Assert.assertEquals(actualNumberOfYLanguages, expectedNumberOfYLanguages);
    }

    @Test
    public void testNumberOfXLanguages() {
        final int expectedNumberOfXLanguages = 14;

        int actualNumberOfXLanguages =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickXSubmenu()
                        .getNumberOfLanguages();

        Assert.assertEquals(actualNumberOfXLanguages, expectedNumberOfXLanguages);
    }
}
