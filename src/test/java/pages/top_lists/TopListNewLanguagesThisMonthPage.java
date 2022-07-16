package pages.top_lists;

import org.openqa.selenium.WebDriver;
import pages.browse_languages.languages.LanguagesPage;

public class TopListNewLanguagesThisMonthPage extends _TopPage<LanguagesPage> {

    public TopListNewLanguagesThisMonthPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {
        return null;
    }
}
