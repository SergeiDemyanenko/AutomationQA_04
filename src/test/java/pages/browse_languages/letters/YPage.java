package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.BaseTablePage;

public class YPage extends BaseLetterPage {

    public YPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected BaseLetterPage createLangPage() {
        return null;
    }
}