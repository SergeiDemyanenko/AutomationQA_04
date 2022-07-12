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
    public void testIncludesNewLanguageCategory(){

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("real language");
        expectedResult.add("esoteric language");
        expectedResult.add("assembly language");

      List <String> actualIncludesNewLanguageCategory =
                       openBaseURL()
                      .clickSubmitNewLanguageMenu()
                      .clickCategoryName()
                      .getCategoryText();

        Assert.assertEquals(actualIncludesNewLanguageCategory,expectedResult);
    }

    @Test
    public void testErrorMessageInvalidSecCode() throws InterruptedException{

        String expectedResult = "Error: Invalid security code.";

        String actuallyErrorMessageInvalidSecCode =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .fillAutorName()
                        .fillLunguageName()
                        .fillEmailName()
                        .clickCategoryName()
                        .clickCategoryAssemblyLanguage()
                        .fillSecutityCode()
                        .fillCodeName()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageInvalidSecCodeText();

        Assert.assertEquals(actuallyErrorMessageInvalidSecCode,expectedResult);
    }

    @Test
    public void testAttributeSrcCaptcha() {

        String expectedAttributeSrcCaptcha = "/captcha.php";

        String actualAttributeSrcCaptcha =
                openBaseURL().clickSubmitNewLanguageMenu().getAttributeSrcOfCaptcha();

        Assert.assertEquals(actualAttributeSrcCaptcha, expectedAttributeSrcCaptcha);
    }
}
