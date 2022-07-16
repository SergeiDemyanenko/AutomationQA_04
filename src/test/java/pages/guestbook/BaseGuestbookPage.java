package pages.guestbook;

import org.openqa.selenium.WebDriver;
import pages.MainPage;

public abstract class BaseGuestbookPage extends MainPage {

    public BaseGuestbookPage(WebDriver driver) {

        super(driver);
    }
}
