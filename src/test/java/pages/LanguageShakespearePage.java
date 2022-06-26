package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguageShakespearePage {

    private WebDriver driver;

    private final By LINK_SHAKESPEARE_LANGUAGE_SITE =
            By.xpath("//a[@href='http://shakespearelang.sourceforge.net/']");

    public LanguageShakespearePage(WebDriver existingDriver) {
        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {
        return driver;
    }

    public WebElement getShakespeareLanguageSite() {
        return getDriver().findElement(LINK_SHAKESPEARE_LANGUAGE_SITE);
    }

    public void getShakespeareLanguageSiteClick() {
        getShakespeareLanguageSite().click();
    }
}
