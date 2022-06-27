package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class APage {

    private WebDriver driver;

    private final By LANGUAGE_ALGOL_60 = By.xpath("//a[@href='language-algol60-1367.html']");

    public APage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getLANGUAGEALGOL60(){

        return getDriver().findElement(LANGUAGE_ALGOL_60);
    }

    public void clickLANGUAGEALGOL60(){

        getLANGUAGEALGOL60().click();
    }
}
