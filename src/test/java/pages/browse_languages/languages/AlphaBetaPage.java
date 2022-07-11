package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlphaBetaPage extends _LanguagesPage {

    private final By ALPHABETA_LINK = By.linkText("AlphaBeta");

    public AlphaBetaPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAlphaBeta() {

        return getDriver().findElement(ALPHABETA_LINK);
    }

    public AlphaBetaPage clickAlphaBeta() {
        getAlphaBeta().click();

        return new AlphaBetaPage(getDriver());
    }
}
