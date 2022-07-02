package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TeamPage {

    private WebDriver driver;

    private final By H3_TEAM_NAME = By.xpath("//div[@id = 'main']/h3");

    public TeamPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public List<WebElement> getListH3TeamName() {

        return getDriver().findElements(H3_TEAM_NAME);
    }
}