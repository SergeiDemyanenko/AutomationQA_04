package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguageMathematicaPage extends _LanguagesPage {

    private final By TD_TABLE_BRENTON_BOSTICK = By.xpath("//table[@style='margin: 7px; padding: 0;;']/tbody[1]/tr[2]/td[2]");

    public LanguageMathematicaPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTdTableBrentonBostick() {

        return getDriver().findElement(TD_TABLE_BRENTON_BOSTICK);
    }
}
