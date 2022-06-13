package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import runner.BaseTest;

public class StartPage extends BaseTest {

    private final By START = By.xpath("//ul[@id='menu']/li/a[@href='/']");

    private WebDriver driver;

    public StartPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    public WebElement getSTART() {

        return getDriver().findElement(START);
    }
}