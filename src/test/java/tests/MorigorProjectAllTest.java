package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.browse_languages.letters.XPage;
import pages.browse_languages.letters.YPage;
import pages.guestbook.GuestbookV2Page;
import pages.MainPage;
import pages.guestbook.SignV2Page;
import pages.submit_new_language.SubmitNewLanguagePage;
import runner.BaseTest;

public class MorigorProjectAllTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";
    private static final String GUESTBOOK_URL = "https://www.99-bottles-of-beer.net/guestbookv2.html";
    private static final String BROWSE_LANGUAGES_URL = BASE_URL.concat("abc.html");

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

    @Test
    public void testVerifyNumberOfYLanguages () {
        int expectedresult = 9;

        getDriver().get(BROWSE_LANGUAGES_URL);

        AbcPage abcPage = new AbcPage(getDriver());

        abcPage.clickYSubmenu();

        YPage yPage = new YPage(getDriver());

        Assert.assertEquals(yPage.getNumberOfLanguages(), expectedresult);
    }

    @Test
    public void testVerifyNumberOfXLanguages() {
        int expectedResult = 14;

        getDriver().get(BROWSE_LANGUAGES_URL);

        AbcPage abcPage = new AbcPage(getDriver());

        abcPage.clickXSubmenu();

        XPage xPage = new XPage(getDriver());

        Assert.assertEquals(xPage.getNumberOfLanguages(), expectedResult);
    }
}
