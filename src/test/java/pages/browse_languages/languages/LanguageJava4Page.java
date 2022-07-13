package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguageJava4Page extends _LanguagesPage {

    private final By REDDIT_ICON = By.xpath("//a[@title='reddit']");

    public LanguageJava4Page(WebDriver driver) {

        super(driver);
    }

    public void clickRedditIcon() {
        clickWebElement(findElement(REDDIT_ICON));
    }

    public WebElement getRedditIcon() {

        return getDriver().findElement(REDDIT_ICON);
    }

    public String getRedditIconURL() {

        return getRedditIcon().getAttribute("href");
    }
}
