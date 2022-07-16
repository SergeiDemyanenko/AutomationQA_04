package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguageJavascript1948Page extends BaseLanguagesPage {

    private final By WIKI_JAVA_SCRIPT_LINK = By.linkText("http://en.wikipedia.org/wiki/Javascript");

    public LanguageJavascript1948Page(WebDriver driver) {

        super(driver);
    }

    public WebElement getWikiJavaScriptLink() {

        return getDriver().findElement(WIKI_JAVA_SCRIPT_LINK);
    }

    protected String getTextWikiLink() {

        return getText(getWikiJavaScriptLink());
    }

    public void clickWikiLink() {

        getWikiJavaScriptLink().click();
    }
}
