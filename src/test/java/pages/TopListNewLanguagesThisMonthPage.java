package pages;

import org.openqa.selenium.WebDriver;

public class TopListNewLanguagesThisMonthPage {

    private WebDriver driver;

    public TopListNewLanguagesThisMonthPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }
    protected WebDriver getDriver() {

        return driver;
    }

}
