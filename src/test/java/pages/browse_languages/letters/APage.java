package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.BaseAbcPage;
import pages.languages.AlphaBetaPage;
import pages.languages.LanguagesPage;

public class APage extends BaseAbcPage<LanguagesPage> {

    private final By ALPHABETA_LINK = By.linkText("AlphaBeta");

    public APage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {
        return null;
    }

    public WebElement getAlphaBeta() {

        return getDriver().findElement(ALPHABETA_LINK);
    }
    public AlphaBetaPage clickAlphaBeta() {
        getAlphaBeta().click();

        return new AlphaBetaPage(getDriver());
    }
}