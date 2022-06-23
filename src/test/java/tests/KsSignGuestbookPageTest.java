package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignV2Page;
import runner.BaseTest;


public class KsSignGuestbookPageTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testSecurityCodeField() {
        String expectedResult = "Error: Error: Invalid security code.";

        SignV2Page signV2Page = new SignV2Page(getDriver());

        getDriver().get(BASE_URL);
        signV2Page.getGuestbookMenu().click();
        signV2Page.getSignGuestbookMenuClick();

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

        signV2Page.getSubmitButtonClick();

        String actualResult = signV2Page.getErrorMessageText();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
