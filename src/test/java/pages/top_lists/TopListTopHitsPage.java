package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.languages.LanguagesPage;

public class TopListTopHitsPage extends _TopPage<LanguagesPage> {

    private final By SHAKESPEARE_LANGUAGE = By.xpath("//a[@href='language-shakespeare-664.html']");

    public TopListTopHitsPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return null;
    }

    public WebElement getShakespeareLanguage() {

        return getDriver().findElement(SHAKESPEARE_LANGUAGE);
    }
}
