package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignGuestbookPage;
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

        SignGuestbookPage signGuestbook = new SignGuestbookPage(getDriver());

        signGuestbook.getSignGuestbookMenuClick();
        signGuestbook.getSubmitButtonClick();

        Assert.assertEquals(signGuestbook.getErrorMessageText(), expectedResult);
    }
}
