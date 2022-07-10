package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPage extends _LettersPage {

    private final By CSHARP_LANGUAGE = By.linkText("C#");

    public CPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getCSharpLanguage() {

        return getDriver().findElement(CSHARP_LANGUAGE);
    }

    public void clickCSharpLanguage() {

        getCSharpLanguage().click();
    }
}