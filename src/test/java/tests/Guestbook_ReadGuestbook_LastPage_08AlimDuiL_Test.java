package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GuestbookV2Page;
import pages.MainPage;
import runner.BaseTest;

public class Guestbook_ReadGuestbook_LastPage_08AlimDuiL_Test extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testReadGuestbookLastPage() {

        final String expectedResult = "Guestbook";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickGuestbookV2Menu();

        GuestbookV2Page readGuestbookV2Page = new GuestbookV2Page(getDriver());
        readGuestbookV2Page.getReadGuestbook().click();

        WebDriverWait wait = new WebDriverWait(getDriver(), 50);
        WebElement lastPage = wait
                .until(ExpectedConditions
                        .visibilityOfElementLocated(
                                By.xpath("//div[@id='main']/p/a[last()]")));
        lastPage.click();

        WebElement Guest = getDriver()
                .findElement(By.xpath("//div[@id='main']//h2"));

        String h2 = Guest.getCssValue("color");
        String h2_same = Guest.getCssValue("font-weight");
        String actualResult = Guest.getText();

        if (h2.equals("rgba(27, 101, 28, 1)") && h2_same.equals("700")) {

            Assert.assertEquals(actualResult, expectedResult);
        }
    }
}
