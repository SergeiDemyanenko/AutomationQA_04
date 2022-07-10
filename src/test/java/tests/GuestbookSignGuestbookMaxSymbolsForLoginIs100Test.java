package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.guestbook.GuestbookV2Page;
import pages.guestbook.SignV2Page;
import runner.BaseTest;

public class GuestbookSignGuestbookMaxSymbolsForLoginIs100Test extends BaseTest {
    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testInput100simbolsToFieldName() {
        final String name = "111111111222222222233333333334444444444555555555568994666656656543556646665656435446543467i987654333";
        String expectedInputText = "111111111222222222233333333334444444444555555555568994666656656543556646665656435446543467i987654333";

        getDriver().get(BASE_URL);
        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickGuestbookV2Menu();
        GuestbookV2Page guestbookV2Page = new GuestbookV2Page(getDriver());
        guestbookV2Page.clickSignV2();
        SignV2Page signV2Page = new SignV2Page(getDriver());

        signV2Page.getInputName().sendKeys(name);
        String actualInputText = signV2Page.getInputName().getAttribute("value");

        Assert.assertEquals(actualInputText, expectedInputText);
    }
}
