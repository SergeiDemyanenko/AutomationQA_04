package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopListTopHitsPage {

    private final By H2_TABLE_NAME_TOP_HITS = By.xpath("//div[@id='main']/h2");

    private WebDriver driver;

    public TopListTopHitsPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getH2TableTopHits() {

        return getDriver().findElement(H2_TABLE_NAME_TOP_HITS);
    }

    public String getH2TableTopHitsName() {

        return getH2TableTopHits().getText();
    }
}
