package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KPage {
    private final WebDriver driver;

    private final By H2_TITLE_K = By.xpath("//div[@id='main']/h2");

    public KPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getH2PageK() {

        return getDriver().findElement(H2_TITLE_K);
    }

    public String getH2PageKText() {

        return getH2PageK().getText();
    }
}