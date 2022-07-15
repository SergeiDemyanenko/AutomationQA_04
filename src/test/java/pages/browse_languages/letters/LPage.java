package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LPage extends _LettersPage {

    private final By LANGUAGE_L33T = By.xpath("//tbody/tr/td/a[@href='language-l33t-963.html']");

    public WebElement getLanguageL33T() {
        return getDriver().findElement(LANGUAGE_L33T);
    }

    public LPage(WebDriver driver) {

        super(driver);
    }

    public void clickLanguageL33t() {
        getLanguageL33T().click();
    }
}