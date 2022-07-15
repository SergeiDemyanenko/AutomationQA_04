package tests.guestbook;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import static runner.TestUtils.createAttributesSrcOfImg;
import static runner.TestUtils.createTextFromPromptsUsingAlgorithm;

public class SignV2Test extends BaseTest {

    @Test
    public void testHomepageFieldDefaultValue() {
        final String expectedDefaultValue = "http://";

        String actualDefaultValue =
                openBaseURL()
                        .clickGuestbookMenu()
                        .clickSignV2()
                        .getInputHomepageAttribute();

        Assert.assertEquals(actualDefaultValue, expectedDefaultValue);
    }

    @Test
    public void testInvalidSecurityCodeError() {
        final String expectedErrorText = "Error: Error: Invalid security code.";

        String actualErrorText = openBaseURL()
                .clickGuestbookMenu()
                .clickSignV2()
                .fillAllFields()
                .clickButtonSubmit()
                .getErrorMessageText();

        Assert.assertEquals(actualErrorText, expectedErrorText);
    }

    @Test
    public void testEmptyFormError() {
        final String expectedErrorText = "Error: Please enter at least a message, your email address and the security code.";

        String actualErrorText =
                openBaseURL()
                        .clickGuestbookMenu()
                        .clickSignV2()
                        .clickButtonSubmit()
                        .getErrorMessageText();

        Assert.assertEquals(actualErrorText, expectedErrorText);
    }

    @Test
    public void testErrorTextFont() {
        final String expectedFont = "b";

        String actualFont = openBaseURL()
                .clickGuestbookMenu()
                .clickSignV2()
                .fillAllFields()
                .clickButtonSubmit()
                .getErrorMessageTagFont();

        Assert.assertEquals(actualFont, expectedFont);
    }

    @Test
    public void testErrorTextBackgroundColor() {
        final String expectedStyle =
                "border: 1px solid red; background-color: rgb(255, 224, 224); padding: 5px; margin: 5px 10px;";

        String actualStyle = openBaseURL()
                .clickGuestbookMenu()
                .clickSignV2()
                .fillAllFields()
                .clickButtonSubmit()
                .getErrorMessageAttributeStyle();

        Assert.assertEquals(actualStyle, expectedStyle);
    }

    @Test
    public void testAttributesSrcOfMessageIcons() {

        String expectedAttributesSrcOfMessageIcons = createAttributesSrcOfImg();

        String actualAttributesSrcOfMessageIcons =
                openBaseURL()
                        .clickGuestbookMenu()
                        .clickSignV2()
                        .getAttributesSrcOfImg();

        Assert.assertEquals(expectedAttributesSrcOfMessageIcons, actualAttributesSrcOfMessageIcons);
    }
    @Test
    public void testInputFieldNameWithMaxSymbolsAndGetErrorMessage() {
        String expectectedErrorMessage = "Error: Please enter at least a message, your email address and the security code.";
        String guestbookComment = "QA tests";
        String nameField = RandomStringUtils.randomAlphanumeric(100);

        String actualErrorMessage = openBaseURL()
                        .clickGuestbookMenu()
                        .clickSignV2()
                        .setInputName(nameField)
                        .clickButtonSubmit()
                        .setInputComment(guestbookComment)
                        .getErrorMessageText();

        Assert.assertEquals(actualErrorMessage, expectectedErrorMessage);
    }

    @Test
    public void testTextFromPrompts() {

        final String expectedTextFromPrompts =
                createTextFromPromptsUsingAlgorithm();

        String actualTextFromPrompts =
                openBaseURL()
                        .clickGuestbookMenu()
                        .clickSignV2()
                        .getTextFromPrompts();

        Assert.assertEquals(actualTextFromPrompts, expectedTextFromPrompts);
    }
}
