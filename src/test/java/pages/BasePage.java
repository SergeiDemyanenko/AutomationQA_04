package pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {

        return driver;
    }
}
