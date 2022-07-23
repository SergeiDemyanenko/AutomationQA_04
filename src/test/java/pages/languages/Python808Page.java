package pages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Python808Page extends LanguagesPage {

    private final By PYTHON_LANGUAGE_INFO_LINK = By.xpath("//a[@href='http://www.python.org/']");

    public Python808Page(WebDriver driver) {

        super(driver);
    }

    public WebElement getPythonLanguageInfoLink() {

        return getDriver().findElement(PYTHON_LANGUAGE_INFO_LINK);
    }

    public void clickPythonLanguageInfoLink() {
        getPythonLanguageInfoLink().click();
    }
}
