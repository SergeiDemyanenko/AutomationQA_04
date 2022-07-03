package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SPage {

    private WebDriver driver;

    private final By SHAKESPEARE_LANGUAGE = By.xpath("//a[@href='language-shakespeare-664.html']");

    public SPage(WebDriver existingDriver) {
        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {
        return driver;
    }

    public WebElement getShakespeareLanguage() {
        return getDriver().findElement(SHAKESPEARE_LANGUAGE);
    }

    public void getShakespeareLanguageClick() {
        getShakespeareLanguage().click();
    }

}
