package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RPage {

    private WebDriver driver;

    private final By TR_TAGS = By.xpath("//tbody/tr[@onmouseover]");

    public RPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public List <WebElement> getTRTags() {

        return getDriver().findElements(TR_TAGS);
    }

    public int countLanguages() {

        return getTRTags().size();
    }
}
