package pages.top_lists;

import org.openqa.selenium.WebDriver;
import pages.browse_languages.languages.LanguagesPage;

public class TopListEsotericPage extends _TopPage<LanguagesPage> {

    public TopListEsotericPage(WebDriver driver) {

       super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {
        return null;
    }
}
