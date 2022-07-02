package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Array;
import java.util.List;

public class TeamPage {

    private WebDriver driver;

    private final By H3_TEAM_NAME = By.xpath("//div[@id = 'main']/h3");
    private final By ALL_TEAM_IMAGES = By.xpath("//img[@src]");

    public TeamPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public List<WebElement> getListH3TeamName() {

        return getDriver().findElements(H3_TEAM_NAME);
    }

    public int getAmmountOfImages() {

        List<WebElement> getListTeamImages;
        getListTeamImages = getDriver().findElements(ALL_TEAM_IMAGES);

        int count = getListTeamImages.size();

        return count;
    }
}