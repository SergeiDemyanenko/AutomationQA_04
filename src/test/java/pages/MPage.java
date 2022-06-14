package pages;

import org.openqa.selenium.WebDriver;

public class MPage {

    private WebDriver driver;

    public MPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }
}
