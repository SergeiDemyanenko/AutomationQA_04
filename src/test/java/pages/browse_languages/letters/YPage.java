package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.browse_languages.BaseAbcPage;
import pages.languages.LanguagesPage;

public class YPage extends BaseAbcPage<LanguagesPage> {

    public YPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return null;
    }
}