package tests.submit_new_language;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;
import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testIncludesNewLanguageCategory() {

        final List<String> expectedIncludesNewLanguageCategory = new ArrayList<>();
        expectedIncludesNewLanguageCategory.add("real language");
        expectedIncludesNewLanguageCategory.add("esoteric language");
        expectedIncludesNewLanguageCategory.add("assembly language");

        List<String> actualIncludesNewLanguageCategory =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .clickCategoryName()
                        .getCategoryText();

        Assert.assertEquals(actualIncludesNewLanguageCategory, expectedIncludesNewLanguageCategory);
    }

    @Test
    public void testErrorMessageInvalidSecCode() {

        final String expectedErrorMessageInvalidSecCode = "Error: Invalid security code.";

        String actuallyErrorMessageInvalidSecCode =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .fillAuthorName()
                        .fillLanguageName()
                        .fillEmailName()
                        .clickCategoryName()
                        .clickCategoryAssemblyLanguage()
                        .fillSecurityCode()
                        .fillCodeName()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageInvalidSecCodeText();

        Assert.assertEquals(actuallyErrorMessageInvalidSecCode, expectedErrorMessageInvalidSecCode);
    }

    @Test
    public void testAttributeSrcCaptcha() {

        final String expectedAttributeSrcCaptcha = "http://www.99-bottles-of-beer.net/captcha.php";

        String actualAttributeSrcCaptcha =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .getAttributeSrcOfCaptcha();

        Assert.assertEquals(actualAttributeSrcCaptcha, expectedAttributeSrcCaptcha);
    }

    @Test
    public void testTextImportant() {
        final String actualText =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .getSpanImportant()
                        .getText();

        Assert.assertEquals(actualText, "IMPORTANT:");
    }

    @Test
    public void testImportantTextBackgroundColor() {
        final String actualBackgroundColor =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .getSpanImportant()
                        .getCssValue("background-color");

        Assert.assertEquals(actualBackgroundColor, "rgba(0, 0, 0, 0)");
    }

    @Test
    public void testImportantTextColor() {
        final String actualTextColor =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .getSpanImportant()
                        .getCssValue("color");

        Assert.assertEquals(actualTextColor, "rgba(255, 255, 255, 1)");
    }

    @Test
    public void testImportantTextFont() {
        final String actualTextFont =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .getSpanImportant()
                        .getCssValue("font-weight");

        Assert.assertEquals(actualTextFont, "700");
    }

    @Test
    public void testSearchCategorySubmit() {

        String expectedSearchCategorySubmit =
                "real language" + "\n" + "esoteric language" + "\n" + "assembly language";

        String actualSearchCategorySubmit =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .getCategoryName()
                        .getText();

        System.out.println(actualSearchCategorySubmit);

        Assert.assertEquals(actualSearchCategorySubmit, expectedSearchCategorySubmit);
    }

    @Test
    public void testErrorBlankFields() {

        String expectedErrorBlankFields = "Error: Precondition failed - Incomplete Input.";

        String actualErrorBlankFields = openBaseURL()
                .clickSubmitNewLanguageMenu()
                .clickButtonSubmitLanguage()
                .getErrorMessage()
                .getText();

        Assert.assertEquals(actualErrorBlankFields, expectedErrorBlankFields);
    }

    @Test
    public void testTextH3Header() {

        String expectedTextH3Header = "Please note:";

        String actualTextH3Header = openBaseURL()
                .clickSubmitNewLanguageMenu()
                .getTitleH3Text();

        Assert.assertEquals(expectedTextH3Header, actualTextH3Header);
    }
}