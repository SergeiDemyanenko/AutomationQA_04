package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class APage {

    private WebDriver driver;

    private final By LANGUAGE_ALGOL_60 = By.xpath("//a[@href='language-algol60-1367.html']");
    private final By H2_TITLE_A = By.xpath("//div[@id='main']/h2");

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

    public WebElement getH2PageA() {

        return getDriver().findElement(H2_TITLE_A);
    }

    public String getH2Text() {

        return getH2PageA().getText();
    }
}
