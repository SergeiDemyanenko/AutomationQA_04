package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.BaseAbcPage;
import pages.browse_languages.languages.LanguageCSharp1614Page;

public class CPage extends BaseAbcPage {

    private final By CSHARP_LANGUAGE = By.linkText("C#");

    public CPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getCSharpLanguage() {

        return getDriver().findElement(CSHARP_LANGUAGE);
    }

    public LanguageCSharp1614Page clickCSharpLanguage() {
        getCSharpLanguage().click();

        return new LanguageCSharp1614Page(getDriver());
    }
}