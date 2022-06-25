package pages;

import org.openqa.selenium.WebDriver;

public class UPage {

    private WebDriver driver;

    public UPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }
}
