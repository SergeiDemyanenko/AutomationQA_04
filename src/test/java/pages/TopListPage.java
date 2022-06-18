package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopListPage {

    private WebDriver driver;

    private final By TOP_LIST_REAL_MENU = By.linkText("Top Rated Real");

    public TopListPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }
    protected WebDriver getDriver() {

        return driver;
    }
    public WebElement getMenuTopListReal() {

        return getDriver().findElement(TOP_LIST_REAL_MENU);
    }

    public void clickMenuTopListReal() {

        getMenuTopListReal().click();
    }
}