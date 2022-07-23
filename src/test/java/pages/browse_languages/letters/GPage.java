package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.browse_languages.BaseAbcPage;
import pages.languages.LanguagesPage;

public class GPage extends BaseAbcPage<LanguagesPage> {

    public GPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return null;
    }

}
