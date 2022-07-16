package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.browse_languages.BaseAbcPage;
import pages.browse_languages.languages.LanguagesPage;

public class RPage extends BaseAbcPage<LanguagesPage> {

    public RPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {
        return null;
    }
}