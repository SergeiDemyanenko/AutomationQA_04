package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.browse_languages.BaseAbcPage;
import pages.browse_languages.languages.LanguagesPage;

public class BPage extends BaseAbcPage<LanguagesPage> {

    protected BPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return new LanguagesPage(getDriver());
    }
}
