package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.guestbook.GuestbookV2Page;
import pages.guestbook.SignV2Page;
import runner.BaseTest;

public class GuestbookSignFormTest extends BaseTest {
    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test

    public void TestGuestbookSignFormFields() {
        final String name = "QA Tests";
        final String location = "AnyWhere in World";
        final String email = "test@qa.com";
        final String homepage = "QAForEveryOne.com";
        final String capcha = "some symbols";
        final String comment = "Test passed if you get an error";


        getDriver().get(BASE_URL);

        MainPage mp = new MainPage(getDriver());

        mp.clickGuestbookV2Menu();

        GuestbookV2Page gb = new GuestbookV2Page(getDriver());

        gb.clickSignV2();

        SignV2Page sv2 = new SignV2Page(getDriver());

        sv2.getInputNameSendKey(name);
        sv2.getInputLocationSendKey(location);
        sv2.getInputEmailSendKey(email);
        sv2.getInputHomepageSendkeys(homepage);
        sv2.getInputCapchaSendkeys(capcha);
        sv2.getInputCommentSendkeys(comment);
        sv2.getButtonSubmit();
        sv2.clickButtonSubmit();

        SignV2Page errorMessage = new SignV2Page(getDriver());
        errorMessage.getErrorMessage().isDisplayed();

        Assert.assertEquals(errorMessage.getErrorMessage().getText(), "Error: Please enter at least a message, your email address and the security code.");
    }
}
