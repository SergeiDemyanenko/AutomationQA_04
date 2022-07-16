package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;

public class AbcPage extends BaseAbcPage<LangPage> {

    public AbcPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected LangPage createLangPage() {
        return null;
    }
}
