package tests._to_do;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.guestbook.GuestbookV2Page;
import pages.MainPage;
import pages.guestbook.SignV2Page;
import runner.BaseTest;


public class KsSignGuestbookPageTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testSecurityCodeField() {
        String expectedResult = "Error: Error: Invalid security code.";

        SignV2Page signV2Page = new SignV2Page(getDriver());

        GuestbookV2Page guestbookV2Page = new GuestbookV2Page(getDriver());

        openBaseURL().clickGuestbookMenu();
        guestbookV2Page.clickSignV2();

        getDriver().findElement(By.xpath
                ("//form/p/input[@name='name']")).sendKeys("Ksenia");
        getDriver().findElement(By.xpath
                ("//form/p/input[@name='location']")).sendKeys("Sankt-Peterburg");
        getDriver().findElement(By.xpath
                ("//form/p/input[@name='email']")).sendKeys("ksunchik123@yandex.ru");
        getDriver().findElement(By.xpath
                ("//form/p/input[@name='homepage']")).sendKeys("https://www.google.com/");
        getDriver().findElement(By.xpath("//form/p/input[@name='captcha']")).sendKeys
                (Integer.toString((int) (Math.random() * 1000 + 100)));
        getDriver().findElement(By.xpath("//textarea[@name='comment']")).sendKeys
                ("Test");

        signV2Page.clickButtonSubmit();

        String actualResult = signV2Page.getErrorMessageText();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
