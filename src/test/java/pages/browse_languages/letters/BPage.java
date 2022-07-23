package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.browse_languages.BaseAbcPage;
import pages.languages.LanguagesPage;

public class BPage extends BaseAbcPage<LanguagesPage> {

    public BPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {
    
        return null;
    }
}
