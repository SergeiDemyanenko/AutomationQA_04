package pages;

import org.openqa.selenium.WebDriver;

public class LanguageJava3Page {

    private WebDriver driver;

    public LanguageJava3Page(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }
}
