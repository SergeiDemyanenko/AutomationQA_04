package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbcPage {

    private WebDriver driver;

    private final By CATEGORY_J = By.xpath("//a[@href='j.html']");

    public AbcPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getCategoryJ() {

        return getDriver().findElement(CATEGORY_J);
    }

    public void getCategoryJClick() {

        getDriver().findElement(CATEGORY_J).click();
    }
}