package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class GuestbookSignGuestbookMaxSymbolsForLoginIs100Test extends BaseTest {

    @Test
    public void testInput100simbolsToFieldName() {
        String expectedInputText = "111111111222222222233333333334444444444555555555568994666656656543556646665656435446543467i987654333";
        String nameField = "111111111222222222233333333334444444444555555555568994666656656543556646665656435446543467i987654333";

                openBaseURL()
                        .clickGuestbookV2Menu()
                                .clickSignV2()
                                        .setInputName(nameField);

        Assert.assertEquals(nameField, expectedInputText);
    }
}
