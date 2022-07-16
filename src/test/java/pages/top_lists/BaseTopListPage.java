package pages.top_lists;

import org.openqa.selenium.WebDriver;
import pages.BaseTablePage;
import pages.MainPage;

public abstract class BaseTopListPage<LangPage> extends BaseTablePage<LangPage> {

    public BaseTopListPage(WebDriver driver) {
        super(driver);
    }
}
