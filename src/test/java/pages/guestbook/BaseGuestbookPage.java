package pages.guestbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPage;

public abstract class BaseGuestbookPage extends MainPage {

    private final By H2_MAIN = By.xpath("//div[@id='main']/h2");

    private final By SIGN_V2_SUBMENU = By.xpath("//a[@href='./signv2.html']");
    private final By GUESTBOOK_V2_SUBMENU = By.xpath("//a[@href='./guestbookv2.html']");

    public BaseGuestbookPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getH2Main() {

        return getDriver().findElement(H2_MAIN);
    }

    public WebElement getSignV2() {

        return getDriver().findElement(SIGN_V2_SUBMENU);
    }

    public WebElement getGuestbookV2() {

        return getDriver().findElement(GUESTBOOK_V2_SUBMENU);
    }

    public String getH2MainText() {

        return getText(getH2Main());
    }

    public String getH2MainColor() {

        return getH2Main().getCssValue("color");
    }
    public String getH2MainFont_Weight() {

        return getH2Main().getCssValue("font-weight");
    }

    public SignV2Page clickSignV2() {
        getSignV2().click();

        return new SignV2Page(getDriver());
    }

    public GuestbookV2Page clickGuestbookV2Page() {
        getGuestbookV2().click();

        return new GuestbookV2Page(getDriver());
    }
}
