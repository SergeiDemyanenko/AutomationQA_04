package pages;

import org.openqa.selenium.WebDriver;

public class PPage {

    private final WebDriver driver;

    public PPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }
}
