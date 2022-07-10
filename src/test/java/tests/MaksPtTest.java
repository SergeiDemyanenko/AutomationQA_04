package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import runner.BaseTest;

public class MaksPtTest extends BaseTest {

    @Test
    public void testErrorTextSignV2Page() {
        final String expectedErrorText = "Error: Error: Invalid security code.";

        String actualErrorText = openBaseURL()
                .clickGuestbookV2Menu()
                .clickSignV2()
                .inputAllFieldsAndClickButtonSubmit()
                .getErrorMessageText();

        Assert.assertEquals(actualErrorText, expectedErrorText);
    }

    @Test
    public void testFontForErrorTextSignV2Page() {
        final String expectedFontErrorText = "b";

        String actualFontErrorText = openBaseURL()
                .clickGuestbookV2Menu()
                .clickSignV2()
                .inputAllFieldsAndClickButtonSubmit()
                .getErrorMessageTagFont();

        Assert.assertEquals(actualFontErrorText, expectedFontErrorText);
    }

    @Test
    public void testBackgroundColorForErrorTextSignV2Page() {
        final String expectedStyleErrorText =
                "border: 1px solid red; background-color: rgb(255, 224, 224); padding: 5px; margin: 5px 10px;";

        String actualStyleErrorText = openBaseURL()
                .clickGuestbookV2Menu()
                .clickSignV2()
                .inputAllFieldsAndClickButtonSubmit()
                .getErrorMessageAttributeStyle();

        Assert.assertEquals(actualStyleErrorText, expectedStyleErrorText);
    }
}