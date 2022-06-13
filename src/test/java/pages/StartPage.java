package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {

    private final By START = By.xpath("//ul[@id='menu']/li/a[@href='/']");

    private WebDriver driver;

    public StartPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }
}