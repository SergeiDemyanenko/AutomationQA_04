package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguagePythonPage {

    private WebDriver driver;

    private final By PYTHON_WEBSITE = By.xpath("//a[@href='http://www.python.org/']");

    public LanguagePythonPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getPythonWebsiteButton() {

        return getDriver().findElement(PYTHON_WEBSITE);
    }

    public void getPythonWebsiteClick() {

        getDriver().findElement(PYTHON_WEBSITE).click();
    }
}
