package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guestbook {

    private WebDriver driver;

    private final By READ_GUESTBOOK = By.xpath("//ul[@id='submenu']//a[@href='./guestbookv2.html']");

    public Guestbook(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getReadGuestbook() {

        return getDriver().findElement(READ_GUESTBOOK);
    }
}
