package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.browse_languages.languages.LanguagePython808Page;

public class PPage extends _LettersPage {

    private final By PYTHON_LANGUAGE = By.xpath("//a[@href='language-python-808.html']");

    public PPage(WebDriver driver) {

        super(driver);
    }

    public LanguagePython808Page clickPythonLanguage() {
        clickWebElement(findElement(PYTHON_LANGUAGE));

        return new LanguagePython808Page(getDriver());
    }
}