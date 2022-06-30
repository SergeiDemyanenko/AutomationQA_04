package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguagePerl737Page {

    private WebDriver driver;

    private final By PERL_LANGUAGE = By.xpath("//div[@id='main']/h2");
    private final By DATE = By.xpath("//tbody/tr/td[text()='06/04/05']");
    private final By AUTHOR = By.xpath("//tbody/tr/td[text()='Andrew Savige']");
    private final By COMMENTS = By.xpath("//tbody/tr/td[text()='76']");

    public LanguagePerl737Page(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getPerlLanguage() {

        return getDriver().findElement(PERL_LANGUAGE);
    }

    public String getPerlLanguageText() {

        return getPerlLanguage().getText();
    }

    public WebElement getPerlLanguageDate() {

        return getDriver().findElement(DATE);
    }

    public String getPerlLanguageDataText() {

        return getPerlLanguageDate().getText();
    }

    public WebElement getAuthorAndrewSavige() {

        return getDriver().findElement(AUTHOR);
    }

    public String getAuthorAndrewSavigeText() {

        return getAuthorAndrewSavige().getText();
    }

    public WebElement getPerlLanguageComments() {

        return getDriver().findElement(COMMENTS);
    }

    public String getPerlLanguageCommentsNumberText() {

        return getPerlLanguageComments().getText();
    }
}
