package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.browse_languages.BaseAbcPage;
import pages.browse_languages.languages.LanguagesPage;


public class DPage extends BaseAbcPage<LanguagesPage> {

    public DPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {
        return null;
    }
}