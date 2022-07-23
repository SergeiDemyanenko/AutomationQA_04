package pages.top_lists;

import org.openqa.selenium.WebDriver;
import pages.languages.LanguagesPage;

public class TopListNewLanguagesThisMonthPage extends BaseTopListPage<LanguagesPage> {

    public TopListNewLanguagesThisMonthPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return null;
    }
}
