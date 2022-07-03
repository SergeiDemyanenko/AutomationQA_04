package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LPage {

    private WebDriver driver;

    private final By H2_HEADER = By.xpath("//div[@id = 'main']/h2");

    private final By L_SUBMENU = By.xpath("//a[@href='l.html']");

    private final By LANGUAGE_L33T = By.xpath("//tbody/tr/td/a[@href='language-l33t-963.html']");

    public LPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getText(WebElement element) {

        return element.getText();
    }
    public void clickLSubmenu() {
        getDriver().findElement(L_SUBMENU).click();
    }

    public void clickLanguageL33t() {
        getDriver().findElement(LANGUAGE_L33T).click();
    }
}
