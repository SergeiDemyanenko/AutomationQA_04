package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguageAlgol60Page extends BaseLanguagesPage {

    private final By LINK_ALGOL_60_LANGUAGE_SITE = By.xpath("//a[@href='language-algol60-1367.html']");

    public LanguageAlgol60Page(WebDriver driver) {

        super(driver);
    }

    public WebElement getLanguageAlgol60Website() {

        return getDriver().findElement(LINK_ALGOL_60_LANGUAGE_SITE);
    }

    public void clickLanguageAlgol60Website() {

        getLanguageAlgol60Website().click();
    }
}
