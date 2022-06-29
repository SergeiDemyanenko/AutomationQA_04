package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuestbookV2Page {

    private WebDriver driver;

    private final By GUESTBOOK_V2_SUBMENU = By.xpath("//a[@href='./guestbookv2.html']");
    private final By SIGN_V2_SUBMENU =By.xpath("//a[@href='./signv2.html']");

    public GuestbookV2Page(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getGuestbookV2() {

        return getDriver().findElement(GUESTBOOK_V2_SUBMENU);
    }

    public WebElement getSignV2() {

        return getDriver().findElement(SIGN_V2_SUBMENU);
    }

    public void clickSignV2() {
        getSignV2().click();
    }
}