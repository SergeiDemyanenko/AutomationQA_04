package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.languages.AlphaBetaPage;

public class APage extends _LettersPage {

    private final By ALPHABETA_LINK = By.linkText("AlphaBeta");

    public APage(WebDriver driver) {

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