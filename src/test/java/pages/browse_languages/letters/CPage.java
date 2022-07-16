package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.browse_languages.languages.CLanguagesPage;

public class CPage extends BaseLetterPage<CLanguagesPage> {

    public CPage(WebDriver driver) {

        super(driver);
    }

    @Override
    public CLanguagesPage createLangPage() {

        return new CLanguagesPage(getDriver());
    }
}