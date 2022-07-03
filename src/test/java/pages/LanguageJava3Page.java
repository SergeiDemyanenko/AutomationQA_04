package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class LanguageJava3Page {

    private WebDriver driver;

    private final By ALTERNATIVE_VERSIONS = By.xpath("//table[@id='category']//td/a");
    private final By MAIN_VERSION = By.xpath("//div[@id='main']/p[text()='(object-oriented version)']");
    private final By COMMENTS_HEADER = By.xpath("//p[@class='commentheader']");

    public LanguageJava3Page(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public List<WebElement> getAlternativeVersions() {
        
        return getDriver().findElements(ALTERNATIVE_VERSIONS);
    }

    public WebElement getMainVersion() {
        
        return getDriver().findElement(MAIN_VERSION);
    }

    public int getCountOfCommentsHeaders() {

        return getDriver().findElements(COMMENTS_HEADER).size();
    }
}