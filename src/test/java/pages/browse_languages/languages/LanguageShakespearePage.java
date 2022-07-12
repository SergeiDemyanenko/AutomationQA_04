package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguageShakespearePage extends _LanguagesPage {

private final By LINK_SHAKESPEARE_LANGUAGE_SITE =
            By.xpath("//a[@href='http://shakespearelang.sourceforge.net/']");

    public LanguageShakespearePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getShakespeareLanguageSite() {

        return getDriver().findElement(LINK_SHAKESPEARE_LANGUAGE_SITE);
    }

    public void clickShakespeareLanguageSite() {
        getShakespeareLanguageSite().click();
    }
}
