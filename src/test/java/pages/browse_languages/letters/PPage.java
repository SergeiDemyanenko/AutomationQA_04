package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseTablePage;
import pages.browse_languages.languages.Python808Page;

public class PPage extends BaseLetterPage {

    private final By PYTHON_LANGUAGE = By.xpath("//a[@href='language-python-808.html']");

    public PPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected BaseLetterPage createLangPage() {
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