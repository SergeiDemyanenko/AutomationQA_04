package pages.top_lists;

import org.openqa.selenium.WebDriver;
import pages.languages.LanguagesPage;

public class TopListRealPage extends BaseTopListPage<LanguagesPage> {

    public TopListRealPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return new LanguagesPage(getDriver());
    }
}