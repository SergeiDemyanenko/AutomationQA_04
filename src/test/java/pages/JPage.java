package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JPage {

    private WebDriver driver;

    private final By DESCRIPTION_J = By.xpath("//div[@id='main']/p[text()]");

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

        return getDriver().findElement(DESCRIPTION_J).getText();
    }
}