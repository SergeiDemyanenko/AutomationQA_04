package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.browse_languages.languages.AbcLanguagesPage;

public class AbcPage extends BaseLetterPage<AbcLanguagesPage> {

    public AbcPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected AbcLanguagesPage createLangPage() {

        return new AbcLanguagesPage(getDriver());
    }
}
