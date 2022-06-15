package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HistoryPage {

    private WebDriver driver;

    private final By HISTORY_START = By.xpath("//ul[@id='submenu']/li/a[@href='info.html']");

    public HistoryPage(WebDriver existingDriver){

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getHISTORY_START() {

        return getDriver().findElement(HISTORY_START);
    }
}
