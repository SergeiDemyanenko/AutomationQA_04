package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.languages.ALanguagesPage;
import pages.browse_languages.languages.AlphaBetaPage;

public class APage extends BaseLetterPage<ALanguagesPage> {

    private final By ALPHABETA_LINK = By.linkText("AlphaBeta");

    public APage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected ALanguagesPage createLangPage() {

        return new ALanguagesPage(getDriver());
    }

    public WebElement getAlphaBeta() {

        return getDriver().findElement(ALPHABETA_LINK);
    }

    public AlphaBetaPage clickAlphaBeta() {
        getAlphaBeta().click();

        return new AlphaBetaPage(getDriver());
    }
}