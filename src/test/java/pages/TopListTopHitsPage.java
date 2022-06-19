package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopListTopHitsPage {
    private WebDriver driver;

    private final By TOP_HITS = By.xpath("//ul[@id='submenu']/li/a[@href='./tophits.html']");

    public TopListTopHitsPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {
        return driver;
    }

    public WebElement getTopHits() {
        return getDriver().findElement(TOP_HITS);
    }

    public String getTopHitsText() {
        return getTopHits().getText();
    }

    public void getTopHitsClick(){
        getTopHits().click();
    }
}