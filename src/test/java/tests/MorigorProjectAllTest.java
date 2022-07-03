package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.guestbook.GuestbookV2Page;
import pages.MainPage;
import pages.guestbook.SignV2Page;
import pages.submit_new_language.SubmitNewLanguagePage;
import runner.BaseTest;

public class MorigorProjectAllTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";
    private static final String GUESTBOOK_URL = "https://www.99-bottles-of-beer.net/guestbookv2.html";

    @Test
    public void testVerifyTextOnMainPage() {
        String expectedResult = "one program in 1500 variations";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        Assert.assertEquals(main.getH2HeaderText(), expectedResult);
    }

    @Test
    public void testSignGuestbookErrorMessage() {
        String expectedResult = "Error: Please enter at least a message, your email address and the security code.";

        getDriver().get(GUESTBOOK_URL);

        SignV2Page signGuestbook = new SignV2Page(getDriver());
        GuestbookV2Page guestbookV2Page = new GuestbookV2Page(getDriver());

        guestbookV2Page.clickSignV2();
        signGuestbook.clickButtonSubmit();

        Assert.assertEquals(signGuestbook.getErrorMessageText(), expectedResult);
    }

    @Test
    public void testVerificationOfHomepageAttribute() {

        getDriver().get(GUESTBOOK_URL);

        SignV2Page signGuestbook = new SignV2Page(getDriver());
        GuestbookV2Page guestbookV2Page = new GuestbookV2Page(getDriver());

        guestbookV2Page.clickSignV2();

        Assert.assertEquals(signGuestbook.getInputHomepageAttribute(), "http://");
    }

    @Test
    public void testVerifySubmitNewLanguageText() {
        String expectedResult = "Submit New Language";

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());

        mainPage.clickFooterSubmitNewLanguage();

        SubmitNewLanguagePage submit = new SubmitNewLanguagePage(getDriver());

        Assert.assertEquals(submit.getTitleH2Text(), expectedResult);
    }
}
