package pages.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TeamPage extends BaseStartPage {

    private final By H3_MAIN = By.xpath("//div[@id='main']/h3");
    private final By ALL_TEAM_IMAGES = By.xpath("//div[@id='main']/p/img[@src]");

    private final String WEBSITE_LINKS_BASE_PATH = "//div[@id='main']/p/a";
    private final By OLIVER_SCHADE_WEBSITE_LINK = By.xpath(WEBSITE_LINKS_BASE_PATH + "[@href='http://www.ls-la.net/']");
    private final By GREGOR_SCHEITHAUER_WEBSITE_LINK = By.xpath(WEBSITE_LINKS_BASE_PATH + "[@href='http://www.e-taste.org']");
    private final By STEFAN_SCHELER_WEBSITE_LINK = By.xpath(WEBSITE_LINKS_BASE_PATH + "[@href='http://sts.synflood.de/']");
    private final By ALL_P_LINKS = By.xpath(WEBSITE_LINKS_BASE_PATH);

    public TeamPage(WebDriver driver) {

        super(driver);
    }

    public List<WebElement> getH3Main() {

        return getDriver().findElements(H3_MAIN);
    }

    public List<WebElement> getAllTeamImages () {

        return getDriver().findElements(ALL_TEAM_IMAGES);
    }

    public WebElement getOliverSchadeWebsiteLink() {

        return getDriver().findElement(OLIVER_SCHADE_WEBSITE_LINK);
    }

    public WebElement getGregorScheithauerWebsiteLink() {

        return getDriver().findElement(GREGOR_SCHEITHAUER_WEBSITE_LINK);
    }

    public WebElement getStefanSchelerWebsiteLink() {

        return getDriver().findElement(STEFAN_SCHELER_WEBSITE_LINK);
    }

    public List<WebElement> getAllPLinks() {

        return getDriver().findElements(ALL_P_LINKS);
    }

    public List<String> getAllLinks() {
        List<String> allLinksText = new ArrayList<>();
        for(WebElement br: getAllPLinks()) {
            allLinksText.add(br.getText());
        }

        return allLinksText;
    }

    public List<String> getTeamNames() {
        List<String> teamNames = new ArrayList<>();
        for (WebElement name : getH3Main()) {
            teamNames.add(name.getText());
        }

        return teamNames;
    }

    public int countAllImages() {

        return getAllTeamImages().size();
    }

    public void clickOliverSchadeWebsiteLink(){
        getOliverSchadeWebsiteLink().click();
    }

    public void clickGregorScheithauerWebsiteLink(){
        getGregorScheithauerWebsiteLink().click();
    }

    public void clickStefanSchelerWebsiteLink() {
        getStefanSchelerWebsiteLink().click();
    }
}