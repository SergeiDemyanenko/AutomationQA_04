package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IPage {

    private WebDriver driver;

    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");

    private final By TABLE_I = By.xpath("//tbody/tr[@onmouseover]");

    private final By P_TAG_TEXT = By.xpath("//div[@id='main']/p[text()]");

    private final By TR_TAGS = By.xpath("//div[@id='main']/table[@id='category']/tbody/tr[@onmouseover]");

    public IPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public List<WebElement> getTrTags() {
        return getDriver().findElements(TR_TAGS);
    }
}