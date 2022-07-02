package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Array;
import java.util.List;

public class TeamPage {

    private WebDriver driver;

    private final By H3_TEAM_NAME = By.xpath("//div[@id = 'main']/h3");
    private final By GREGOR_SCHEITHAUER_STEFAN_SCHELER_IMAGES = By.xpath("//img[@src]");

    public TeamPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public List<WebElement> getListH3TeamName() {

        return getDriver().findElements(H3_TEAM_NAME);
    }

    public List<WebElement> getListTeamImages() {

        return getDriver().findElements(GREGOR_SCHEITHAUER_STEFAN_SCHELER_IMAGES);
    }

    public int getAmmountOfImages() {

        List<WebElement> Commentheaderslist;
        Commentheaderslist = getDriver().findElements(GREGOR_SCHEITHAUER_STEFAN_SCHELER_IMAGES);

        int count = Commentheaderslist.size();

        return count;
    }
}