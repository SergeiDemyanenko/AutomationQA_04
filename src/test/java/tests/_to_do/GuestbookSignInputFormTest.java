package tests._to_do;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.guestbook.GuestbookV2Page;
import pages.guestbook.SignV2Page;
import runner.BaseTest;

public class GuestbookSignInputFormTest extends BaseTest {
    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test

    public void TestGuestbookSignFormFields() {
        final String name = "QA Tests";
        final String location = "AnyWhere in World";
        final String email = "test@qa.com";
        final String homepage = "QAForEveryOne.com";
        final String capcha = "some symbols";
        final String comment = "Test passed if you get an error";


        openBaseURL().clickGuestbookMenu();

        GuestbookV2Page gb = new GuestbookV2Page(getDriver());

        gb.clickSignV2();

        SignV2Page sv2 = new SignV2Page(getDriver());

        sv2.setInputName(name);
        sv2.setInputLocation(location);
        sv2.setInputEmail(email);
        sv2.setInputHomepage(homepage);
        sv2.setInputCapcha(capcha);
        sv2.getButtonSubmit();
        sv2.clickButtonSubmit();

        SignV2Page errorMessage = new SignV2Page(getDriver());
        errorMessage.getErrorMessage().isDisplayed();

        Assert.assertEquals(errorMessage.getErrorMessage().getText(), "Error: Please enter at least a message, your email address and the security code.");
    }
}
