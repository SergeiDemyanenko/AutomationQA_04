package pages.top_lists;

import org.openqa.selenium.WebDriver;
import pages.browse_languages.languages.LanguagesPage;

public class TopListAssemblyPage extends _TopPage<LanguagesPage> {

    public TopListAssemblyPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return null;
    }
}