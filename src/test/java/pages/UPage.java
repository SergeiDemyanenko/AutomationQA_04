package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UPage {

    private WebDriver driver;

    private final By TABLE_U = By.xpath("//tbody/tr[@onmouseover]");

    public UPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public List<WebElement> getTableU() {

        return getDriver().findElements(TABLE_U);
    }

    public int countLanguagesU() {

        return getTableU().size();
    }
}
