package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KPage {
    private final WebDriver driver;

    private final By H2_TITLE_K = By.xpath("//div[@id='main']/h2");

    private final By DESCRIPTION_K = By.xpath("//div[@id='main']/p[text()]");


    public KPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getDescriptionCategoryK() {

        return getDriver().findElement(DESCRIPTION_K);
    }

    public String getDescriptionCategoryKText() {

        return getDescriptionCategoryK().getText();
    }

    public WebElement getH2PageK() {

        return getDriver().findElement(H2_TITLE_K);
    }

    public String getH2PageCText() {

        return getH2PageK().getText();
    }
}