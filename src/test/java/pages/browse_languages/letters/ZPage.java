package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.languages.LanguagesBeginWithZ;

import java.util.List;

public class ZPage extends _LettersPage {

    public ZPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2Text() {

        return getH2Header().getText();
    }

    public List<WebElement> getPTags() {

        return getDriver().findElements(P_TAG_TEXT);
    }

    public String getPTagsText() {

        StringBuilder result = new StringBuilder();

        for (WebElement p : getPTags()) {
            result.append(p.getText());
        }

        return result.toString();
    }

    public List<WebElement> getCategoryOfTable() {

        return getDriver().findElements(MAIN_TABLE_HEADING);
    }

    public String getCategoryText() {

        StringBuilder result = new StringBuilder();

        for (WebElement th : getCategoryOfTable()) {
            result.append(" ").append(th.getText());
        }
        result.deleteCharAt(0);

        return result.toString();
    }

    public List<WebElement> getNamesOfLanguageZ() {

        return getDriver().findElements(TD_LINKS);
    }

    public String getNamesText() {
        StringBuilder result = new StringBuilder();

        for (WebElement names : getNamesOfLanguageZ()) {
            result.append(names.getText()).append("\n");
        }
        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }

    public WebElement getRandomNameOfZ() {
        int index =
                (int) (Math.random() * (getNamesOfLanguageZ().size() - 1)) + 1;

        return getDriver()
                .findElement(By.xpath(
                        "//table[@id='category']/tbody/tr[@onmouseover][" + index + "]/td/a"));
    }

    public LanguagesBeginWithZ clickRandomLanguageBeginWithZ() {

        getRandomNameOfZ().click();

        return new LanguagesBeginWithZ(getDriver());
    }
}
