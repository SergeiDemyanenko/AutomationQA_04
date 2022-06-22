package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopListEsotericPage {

    private WebDriver driver;

    private final By H2_TABLE_NAME_ESOTERIC = By.xpath("//div[@id='main']/h2");

    public TopListEsotericPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getH2TableEsoteric() {

        return getDriver().findElement(H2_TABLE_NAME_ESOTERIC);
    }

    public String getH2TableEsotericName() {

        return getH2TableEsoteric().getText();
    }
}
