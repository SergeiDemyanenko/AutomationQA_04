package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuestbookV2Page {

    private WebDriver driver;

    private final By READ_GUESTBOOK = By.xpath("//ul[@id='submenu']//a[@href='./guestbookv2.html']");

    public GuestbookV2Page(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getReadGuestbook() {

        return getDriver().findElement(READ_GUESTBOOK);
    }
}
