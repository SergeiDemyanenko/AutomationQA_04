package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.languages.LanguagesPage;

public class NewCommentsPage extends _TopPage {

    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");
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

    public String getTextMainP() {

        return getText(getMainP());
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2HeaderText() {

        return getText(getH2Header());
    }
}
