package pages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MathematicaPage extends LanguagesPage {

    private final By TD_TABLE_BRENTON_BOSTICK = By.xpath("//table[@style='margin: 7px; padding: 0;;']/tbody[1]/tr[2]/td[2]");
    private final By TD_TABLE_DATE = By.xpath("//table[@style='margin: 7px; padding: 0;;']/tbody/tr[1]/td[last()]");
    private final By TD_TABLE_COMMENT = By.xpath("//table[@style='margin: 7px; padding: 0;;']/tbody/tr[4]/td[last()]");

    public MathematicaPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTdTableBrentonBostick() {

        return getDriver().findElement(TD_TABLE_BRENTON_BOSTICK);
    }

    public WebElement getTDTableDate () {

        return getDriver().findElement(TD_TABLE_DATE);
    }

    public WebElement getTDTableComment() {

        return getDriver().findElement(TD_TABLE_COMMENT);
    }

    public String getBrentonBostickText () {

        return getText(getTdTableBrentonBostick());
    }
  
    public String textOfAuthor() {

        return getText(getTdTableBrentonBostick());
    }

    public String getDateOfLanguage() {

        return getText(getTDTableDate());
    }

    public String getNumberOfComments() {

        return getText(getTDTableComment());
    }
}
