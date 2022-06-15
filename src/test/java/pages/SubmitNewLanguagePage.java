package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubmitNewLanguagePage {

    private WebDriver driver;

    private final By SPAN_IMPORTANT =By.xpath("//div[@id='main']/ul/li/span/b");

    public SubmitNewLanguagePage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getSPAN_IMPORTANT() {

        return getDriver().findElement(SPAN_IMPORTANT);
    }

    public String getSPAN_IMPORTANTSCC_Value(String value) {

        return getSPAN_IMPORTANT().getCssValue(value);
    }
}
