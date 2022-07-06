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
        getDriver().get(BASE_URL);

        MainPage mp = new MainPage(getDriver());

        mp.clickGuestbookV2Menu();

        GuestbookV2Page gb = new GuestbookV2Page(getDriver());

        gb.clickSignV2();

        SignV2Page inputField = new SignV2Page(getDriver());
        inputField.getInputName().sendKeys("QA Tests");

        SignV2Page location = new SignV2Page(getDriver());
        location.getInputLocation().sendKeys("AnyWhere in World");

        SignV2Page eMail = new SignV2Page(getDriver());
        eMail.getInputEmail().sendKeys("test@qa.com");

        SignV2Page homepage = new SignV2Page(getDriver());
        homepage.getInputHomepage().sendKeys("QAForEveryOne.com");

        SignV2Page securityCode = new SignV2Page(getDriver());
        securityCode.getInputCaptcha().sendKeys("ffddd");

        SignV2Page comment = new SignV2Page(getDriver());
        comment.getInputComment().sendKeys("Test passed if you get an error");

        SignV2Page submitButton = new SignV2Page(getDriver());
        submitButton.getButtonSubmit();
        submitButton.clickButtonSubmit();

        SignV2Page errorMessage = new SignV2Page(getDriver());
        errorMessage.getErrorMessage().isDisplayed();
    }
}
