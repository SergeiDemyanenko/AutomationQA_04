package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private WebDriver driver;

    private final By H1_HEADER = By.xpath("//div[@id='header']/h1");

    public MainPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getH1Header() {

        return getDriver().findElement(H1_HEADER);
    }

    public String getH1HeaderText() {

        return getH1Header().getText();
    }
}
