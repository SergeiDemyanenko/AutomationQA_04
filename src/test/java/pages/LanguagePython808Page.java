package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguagePython808Page {

    private WebDriver driver;

    private final By PYTHON_LANGUAGE_INFO_LINK = By.xpath("//a[@href='http://www.python.org/']");

    public LanguagePython808Page(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getPythonLanguageInfoLink() {

        return getDriver().findElement(PYTHON_LANGUAGE_INFO_LINK);
    }

    public void clickPythonLanguageInfoLink() {

       getPythonLanguageInfoLink().click();
    }
}
