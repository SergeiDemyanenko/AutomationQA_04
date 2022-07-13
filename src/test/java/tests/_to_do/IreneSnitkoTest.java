package tests._to_do;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import pages.guestbook.GuestbookV2Page;
import pages.guestbook.SignV2Page;
import runner.BaseTest;

public class IreneSnitkoTest extends BaseTest {

    private static final String BASE_URL = "https://www.99-bottles-of-beer.net/";

    @Test
    public void testCheckingTheDisplayOfCaptchaOnSignV2Page() {

        getDriver().get(BASE_URL);

        MainPage mp = new MainPage(getDriver());

        mp.clickGuestbookV2Menu();

        GuestbookV2Page gb = new GuestbookV2Page(getDriver());

        gb.clickSignV2();

        SignV2Page sv2 = new SignV2Page(getDriver());

        Assert.assertTrue(sv2.getImgCaptcha().isDisplayed());
    }
}
