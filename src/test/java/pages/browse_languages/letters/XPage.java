package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import pages.BaseTablePage;

public class XPage extends BaseLetterPage {

    public XPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected BaseLetterPage createLangPage() {
        return null;
    }
}