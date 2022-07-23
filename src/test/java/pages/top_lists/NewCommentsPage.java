package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.languages.LanguagesPage;

public class NewCommentsPage extends BaseTopListPage<LanguagesPage> {

    private final By MAIN_P = By.xpath("//h2[text()='New Comments']/following-sibling::p[1]");

    public NewCommentsPage(WebDriver driver) {

        super (driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return null;
    }

    public WebElement getMainP() {

        return getDriver().findElement(MAIN_P);
    }

    public String getMainParagraphText() {

        return getText(getMainP());
    }
}