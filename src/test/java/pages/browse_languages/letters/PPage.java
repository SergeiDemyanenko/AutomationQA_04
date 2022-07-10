package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.browse_languages.languages.LanguagePython808Page;

public class PPage extends BasePage {


    private final By PYTHON_LANGUAGE = By.xpath("//a[@href='language-python-808.html']");

    public PPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getPythonLanguage() {

        return getDriver().findElement(PYTHON_LANGUAGE);
    }

    public LanguagePython808Page clickPythonLanguage() {
        getPythonLanguage().click();

        return new LanguagePython808Page(getDriver());
    }
}
