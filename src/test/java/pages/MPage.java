package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MPage {

    private final By LAST_LANGUAGE = By.xpath("//table[@id='category']/tbody/tr[last()]/td/a");

    private WebDriver driver;

    public MPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getLastLanguageInM() {

        return getDriver().findElement(LAST_LANGUAGE);
    }

    public String getLastLanguageInMText() {

        return getLastLanguageInM().getText();
    }
}