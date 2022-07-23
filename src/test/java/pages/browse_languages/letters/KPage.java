package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.BaseAbcPage;
import pages.languages.LanguagesPage;

import java.util.List;

public class KPage extends BaseAbcPage<LanguagesPage> {

    private final By ALL_TR_K_LANGUAGES = By.xpath("//tr[@onmouseover]");

    public KPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return new LanguagesPage(getDriver());
    }

    public List<WebElement> getAllTrs() {

        return getDriver().findElements(ALL_TR_K_LANGUAGES);
    }

    public int getNumberOfLanguages() {

        return getAllTrs().size();
    }
}