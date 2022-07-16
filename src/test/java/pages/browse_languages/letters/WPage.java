package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.BaseTablePage;

public class WPage extends BaseLetterPage {

    public WPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected BaseLetterPage createLangPage() {
        return null;
    }
}