package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImpressumPage {
    private final By IMPRESSUM_SUBMENU = By.xpath("//a[@href = 'impressum.html']");

    private WebDriver driver;

    public ImpressumPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {
        return driver;
    }

    public WebElement getImpressumSubmenu() {

        return getDriver().findElement(IMPRESSUM_SUBMENU);
    }

    public String getImpressumSubmenuText() {

        return getImpressumSubmenu().getText();
    }


}
