package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopListRealPage {

    private WebDriver driver;

    private final By H2_TABLE_NAME = By.xpath("//div[@id='main']/h2");

    public TopListRealPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }
    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getH2Table() {

        return getDriver().findElement(H2_TABLE_NAME);
    }

    public String getH2TableName() {

        return getH2Table().getText();
    }
}