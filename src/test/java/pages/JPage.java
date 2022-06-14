package pages;

import org.openqa.selenium.WebDriver;

public class JPage {

    private WebDriver driver;

    public JPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }
}