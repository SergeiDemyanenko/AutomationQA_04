package pages.browse_languages.languages;

import org.openqa.selenium.WebDriver;

public class LanguagesPage extends BaseLanguagesPage<LanguagesPage> {

    public LanguagesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {
        return new LanguagesPage(getDriver());
    }

}
