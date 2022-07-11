package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.languages.LanguageShakespearePage;

public class SPage extends _LettersPage {

    private final By SHAKESPEARE_LANGUAGE = By.xpath("//a[@href='language-shakespeare-664.html']");

    public SPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getShakespeareLanguage() {

        return findElement(SHAKESPEARE_LANGUAGE);
    }

    public LanguageShakespearePage clickShakespeareLanguage() {
        getShakespeareLanguage().click();

        return new LanguageShakespearePage(getDriver());
    }
}