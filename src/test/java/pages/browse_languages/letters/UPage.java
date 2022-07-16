package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.BaseTablePage;

public class UPage extends BaseLetterPage {

    public UPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected BaseLetterPage createLangPage() {
        return null;
    }
}