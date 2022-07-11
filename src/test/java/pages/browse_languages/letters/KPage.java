package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class KPage extends _LettersPage {

    private final By ALL_TR_K_LANGUAGES = By.xpath("//tr[@onmouseover]");

    public KPage(WebDriver driver) {

        super(driver);
    }

    public List<WebElement> getAllTrs() {

        return getDriver().findElements(ALL_TR_K_LANGUAGES);
    }

    public int getNumberOfLanguages() {

        return getAllTrs().size();
    }
}