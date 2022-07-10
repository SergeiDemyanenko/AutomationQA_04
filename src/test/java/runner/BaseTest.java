package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.MainPage;
import pages.start.StartPage;

public abstract class BaseTest {

    private WebDriver driver;

    private final String BASE_URL = "http://www.99-bottles-of-beer.net";

    @BeforeMethod
    protected void beforeMethod() {
        driver = BaseUtils.createDriver();
    }

    @AfterMethod
    protected void afterMethod() {
        driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;
    }

    public MainPage openBaseURL() {
        getDriver().get(BASE_URL);

        return new MainPage(getDriver());
    }
}
