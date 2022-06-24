package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class LanguageJava3Page {

    private WebDriver driver;

    private final By ALTERNATIVE_VERSIONS = By.xpath("//table[@id='category']//td/a");
    private final By MAIN_VERSION = By.xpath("//div[@id='main']/p[text()='(object-oriented version)']");
    public final By COMMENTHEADER = By.xpath("//p[@class='commentheader']");

    public LanguageJava3Page(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public List<WebElement> getALTERNATIVE_VERSIONS() {
        return getDriver().findElements(ALTERNATIVE_VERSIONS);
    }
    public WebElement getMAIN_VERSION() {
        return getDriver().findElement(MAIN_VERSION);
    }

    public int getAmmountOfCommentheaders() {

        List<WebElement> Commentheaderslist;
        Commentheaderslist = getDriver().findElements(COMMENTHEADER);

        int count = Commentheaderslist.size();

        return count;
    }
}
