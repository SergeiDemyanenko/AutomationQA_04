package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguagePython808Page extends _LanguagesPage {

    private final By PYTHON_LANGUAGE_INFO_LINK = By.xpath("//a[@href='http://www.python.org/']");


    public LanguagePython808Page(WebDriver driver) {

        super(driver);
    }

    public WebElement getPythonLanguageInfoLink() {

        return getDriver().findElement(PYTHON_LANGUAGE_INFO_LINK);
    }

    public LanguagePython808Page clickPythonLanguageInfoLink() {
        getPythonLanguageInfoLink().click();

        return new LanguagePython808Page(getDriver());
    }
}
