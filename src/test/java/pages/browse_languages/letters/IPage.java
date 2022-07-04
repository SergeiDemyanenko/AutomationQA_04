package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IPage {

    private WebDriver driver;

    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");

    private final By TABLE_I = By.xpath("//tbody/tr[@onmouseover]");

    private final By P_TAG_TEXT = By.xpath("//div[@id='main']/p[text()]");

    public IPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }
}