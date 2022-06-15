package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignGuestbookPage {

    private WebDriver driver;

    private final By SIGN_GUESTBOOK = By.xpath("//a[@href='./signv2.html']");
    private final By SUBMIT = By.xpath("//input[@type='submit']");
    private final By ERROR_MESSAGE = By.xpath("//div[@id='main']/p");

    public SignGuestbookPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getSignGuestbookMenu() {

        return getDriver().findElement(SIGN_GUESTBOOK);
    }

    public void getSignGuestbookMenuClick() {
        getSignGuestbookMenu().click();
    }

    public WebElement getSubmitButton() {

        return getDriver().findElement(SUBMIT);
    }

    public void getSubmitButtonClick() {
        getSubmitButton().click();
    }

    public WebElement getErrorMessage() {

        return getDriver().findElement(ERROR_MESSAGE);
    }

    public String getErrorMessageText() {

        return getErrorMessage().getText();
    }
}
