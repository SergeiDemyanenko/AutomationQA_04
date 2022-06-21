package pages;

import org.openqa.selenium.WebDriver;

public class WPage {

    private WebDriver driver;

    public WPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }
}
