package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.browse_languages.languages.BaseLanguagePage;

public class DPage extends BaseLetterPage {

    public DPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected BaseLanguagePage createLangPage() {
        return null;
    }
}