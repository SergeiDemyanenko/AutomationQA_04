package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.BaseAbcPage;
import pages.languages.L33tPage;
import pages.languages.LanguagesPage;

public class LPage extends BaseAbcPage<LanguagesPage> {

    private final By LANGUAGE_L33T = By.xpath("//tbody/tr/td/a[@href='language-l33t-963.html']");

    public WebElement getLanguageL33T() {

        return getDriver().findElement(LANGUAGE_L33T);
    }

    public LPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {
        return null;
    }

    public L33tPage clickLanguageL33t() {
        getLanguageL33T().click();

        return new L33tPage(getDriver());
    }
}