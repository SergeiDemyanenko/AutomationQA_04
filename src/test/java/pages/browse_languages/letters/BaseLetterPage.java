package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.browse_languages.BaseAbcPage;

public abstract class BaseLetterPage<LangPage> extends BaseAbcPage {

    public BaseLetterPage(WebDriver driver) {
        super(driver);
    }

    protected abstract LangPage createLangPage();

    public LangPage clickLanguage(String languageName) {
        getDriver().findElement(By.linkText(languageName)).click();

        return createLangPage();
    }
}
