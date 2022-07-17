package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
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

    public StartPage openBaseURL() {
        getDriver().get(BASE_URL);

        return new StartPage(getDriver());
    }

    public String getExternalPageTitle() {

        return getDriver().getTitle();
    }

    public String getExternalPageURL() {

        return getDriver().getCurrentUrl();
    }
}
