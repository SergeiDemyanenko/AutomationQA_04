package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {

        return driver;
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    public void clickWebElement(WebElement element) {
        element.click();
    }

    public WebElement findElement(By element) {

        return getDriver().findElement(element);
    }

    public List<WebElement> findElements(By element) {

        return getDriver().findElements(element);
    }

    public String getTitle() {

        return getDriver().getTitle();
    }
}
