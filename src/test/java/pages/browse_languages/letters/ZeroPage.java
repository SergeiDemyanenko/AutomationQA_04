package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;

public class ZeroPage {

    private WebDriver driver;

    public ZeroPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }
}