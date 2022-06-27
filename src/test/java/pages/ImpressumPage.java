package pages;

import org.openqa.selenium.WebDriver;

public class ImpressumPage {

    private WebDriver driver;

    public ImpressumPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }
}
