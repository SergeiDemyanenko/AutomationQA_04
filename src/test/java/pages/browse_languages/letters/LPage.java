package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LPage extends _LettersPage {

    private final By LANGUAGE_L33T = By.xpath("//tbody/tr/td/a[@href='language-l33t-963.html']");

    public LPage(WebDriver driver) {

        super(driver);
    }

    public void clickLanguageL33t() {
        clickWebElement(findElement(LANGUAGE_L33T));
    }
}