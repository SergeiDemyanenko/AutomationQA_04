package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LPage {

    private WebDriver driver;

    private final By H2_TITLE_L = By.xpath("//div[@id = 'main']/h2");

    public LPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement  getH2PageL(){
        return getDriver().findElement(H2_TITLE_L);
    }

    public String getH2PageLText(){
        return getH2PageL().getText();
    }
}
