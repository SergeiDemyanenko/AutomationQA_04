package pages.guestbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuestbookV2Page extends BaseGuestbookPage {

    private final By PAGE_2 = By.xpath("//a[@href='./guestbookv2.html?page=2']");
    private final By PAGE_LAST = By.xpath("//div[@id='main']/p/a[last()]");

    public GuestbookV2Page(WebDriver driver) {

        super(driver);
    }

    public WebElement getPage2() {

        return getDriver().findElement(PAGE_2);
    }

    public WebElement getPageLast() {

        return getDriver().findElement(PAGE_LAST);
    }

    public String getPage2Text() {

        return getText(getPage2());
    }

    public GuestbookV2Page clickPageLast(){
        getPageLast().click();

        return new GuestbookV2Page(getDriver());
    }
}
