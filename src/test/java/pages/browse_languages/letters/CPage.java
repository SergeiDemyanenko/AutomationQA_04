package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.browse_languages.BaseAbcPage;

import pages.languages.LanguagesPage;

public class CPage extends BaseAbcPage<LanguagesPage> {

    public CPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return new LanguagesPage(getDriver());
    }
}