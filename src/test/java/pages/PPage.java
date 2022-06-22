package pages;

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
    public WebElement getPythonLanguageButton() {

        return getDriver().findElement(PYTHON_LANGUAGE);
    }

    public void getPythonLanguageClick() {

        getDriver().findElement(PYTHON_LANGUAGE).click();
    }
}
