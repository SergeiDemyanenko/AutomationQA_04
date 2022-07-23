package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.BaseAbcPage;
import pages.languages.Python808Page;
import pages.languages.LanguagesPage;

public class PPage extends BaseAbcPage<LanguagesPage> {

    private final By PYTHON_LANGUAGE = By.xpath("//a[@href='language-python-808.html']");

    public PPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {
        return null;
    }

    public WebElement getPythonLanguage() {

        return getDriver().findElement(PYTHON_LANGUAGE);
    }

    public Python808Page clickPythonLanguage() {
        getPythonLanguage().click();

        return new Python808Page(getDriver());
    }
}