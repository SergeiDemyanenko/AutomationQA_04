package pages.top_lists;

import org.openqa.selenium.WebDriver;
import pages.languages.LanguagesPage;

public class TopListAssemblyPage extends BaseTopListPage<LanguagesPage> {

    public TopListAssemblyPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return null;
    }
}