package pages;

import org.openqa.selenium.WebDriver;

public class RPage {

    private WebDriver driver;

    public RPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }
}
