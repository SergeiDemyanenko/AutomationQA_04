package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.BaseTablePage;

public class ZeroPage extends BaseLetterPage {

    public ZeroPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected BaseLetterPage createLangPage() {
        return null;
    }
}