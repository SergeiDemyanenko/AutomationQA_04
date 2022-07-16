package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.BaseAbcPage;
import pages.browse_languages.languages.ShakespearePage;
import pages.browse_languages.languages.LanguagesPage;

public class SPage extends BaseAbcPage<LanguagesPage> {

    private final By SHAKESPEARE_LANGUAGE = By.xpath("//a[@href='language-shakespeare-664.html']");

    public SPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {
        return null;
    }

    public WebElement getShakespeareLanguage() {

        return getDriver().findElement(SHAKESPEARE_LANGUAGE);
    }

    public ShakespearePage clickShakespeareLanguage() {
        getShakespeareLanguage().click();

        return new ShakespearePage(getDriver());
    }
}