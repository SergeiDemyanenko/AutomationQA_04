package pages;

import org.openqa.selenium.WebDriver;

public class TopListTopHitsPage {
    private WebDriver driver;

    public TopListTopHitsPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }
}