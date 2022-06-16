package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JPage {

    private WebDriver driver;

    private final By DESCRIPTION_J = By.xpath("//div[@id='main']/p[text()]");
    private final By H2_TITLE_J = By.xpath("//div[@id='main']/h2");

    public JPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getDescriptionCategoryJ() {

        return getDriver().findElement(DESCRIPTION_J);
    }

    public String getDescriptionCategoryJText() {

        return getDescriptionCategoryJ().getText();
    }
    public WebElement getH2PageJ() {

        return getDriver().findElement(H2_TITLE_J);
    }

    public String getH2PageJText() {

        return getH2PageJ().getText();
    }
}