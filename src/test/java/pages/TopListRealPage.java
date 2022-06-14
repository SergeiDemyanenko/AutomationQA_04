package pages;

import org.openqa.selenium.WebDriver;

public class TopListRealPage {

    private WebDriver driver;

    public TopListRealPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }
    protected WebDriver getDriver() {

        return driver;
    }
}