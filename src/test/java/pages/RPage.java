package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RPage {

    private WebDriver driver;

    private final By TR_TAGS = By.xpath("//tbody/tr[@onmouseover]");
    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");
    private final By P_TAG_TEXT = By.xpath("//div[@id='main']/p[1]");

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

    public String getText(WebElement element) {

        return element.getText();
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2HeaderText() {

        return getText(getH2Header());
    }

    public  WebElement getPTag() {

        return getDriver().findElement(P_TAG_TEXT);
    }

    public String getPTagText() {

        return getText(getPTag());
    }
}
