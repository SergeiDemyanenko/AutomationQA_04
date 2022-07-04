package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PPage {

    private final WebDriver driver;

    private final By PYTHON_LANGUAGE = By.xpath("//a[@href='language-python-808.html']");

    public PPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }
    public WebElement getPythonLanguage() {

        return getDriver().findElement(PYTHON_LANGUAGE);
    }

    public void clickPythonLanguage() {

        getPythonLanguage().click();
    }
}
