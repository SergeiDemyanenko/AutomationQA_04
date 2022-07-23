package pages.top_lists;

import org.openqa.selenium.WebDriver;

import pages.languages.LanguagesPage;

public class TopListPage extends BaseTopListPage<LanguagesPage> {

    public TopListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return null;
    }
}