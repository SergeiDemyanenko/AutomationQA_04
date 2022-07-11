package pages.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.MainPage;

import java.util.ArrayList;
import java.util.List;

public class TeamPage extends BasePage {

    private final By H3_HEADER = By.xpath("//div[@id = 'main']/h3");
    private final By ALL_TEAM_IMAGES = By.xpath("//img[@src]");
    private final By H2_MAIN_HEADER = By.xpath("//div[@id='main']/h2");
    private final By OLIVER_SCHADE_LINK = By.xpath("//a[@href='http://www.ls-la.net/']");
    private final By ALL_TEAM_LINKS = By.xpath("//div[@id='main']/p/a");
    private final By GREGOR_SCHEITHAUER_LINK = By.xpath("//a[@href='http://www.e-taste.org']");
    private final By STEFAN_SCHELER_LINK = By.xpath("//a[@href='http://sts.synflood.de/']");

    public TeamPage(WebDriver driver) {

        super(driver);
    }

    public List<WebElement> getListH3Header() {

        return getDriver().findElements(H3_HEADER);
    }

    public List<String> getListH3TeamName() {

        List<String> h3TeamName = new ArrayList<>();
        for (WebElement name : getListH3Header()) {
            h3TeamName.add(name.getText());
        }

        return h3TeamName;
    }

    public int getAmmountOfImages() {

        List<WebElement> getListTeamImages;
        getListTeamImages = getDriver().findElements(ALL_TEAM_IMAGES);

        int count = getListTeamImages.size();

        return count;
    }

    public WebElement getH2MainHeader() {

        return getDriver().findElement(H2_MAIN_HEADER);
    }

    public String getH2MainHeaderText() {

        return getH2MainHeader().getText();
    }

    public WebElement getOliverSchadeLink() {

        return getDriver().findElement(OLIVER_SCHADE_LINK);
    }

    public TeamPage clickOliverSchadeLink(){
        getOliverSchadeLink().click();

        return new TeamPage(getDriver());
    }

    public List<String> getAllLinks() {
        List<String> actualResult = new ArrayList<>();
        for(WebElement br: getDriver().findElements(ALL_TEAM_LINKS)) {
            actualResult.add(br.getText());
        }

        return actualResult;
    }

    public WebElement getGregorScheithauerLink() {

        return getDriver().findElement(GREGOR_SCHEITHAUER_LINK);
    }

    public TeamPage clickGregorScheithauerLink(){
        getGregorScheithauerLink().click();

        return new TeamPage(getDriver());
    }

    public static String getTeamPageLsLaNetLinkTitle() {
        String TeamPageLsLaNetLinkTitle = "Index of /";

        return TeamPageLsLaNetLinkTitle;
    }

    public static String getTeamPageETasteOrgLinkTitle() {
        String TeamPageETasteOrgLinkTitle = "Ce domaine a été enregistré par Youdot.io";

        return TeamPageETasteOrgLinkTitle;
    }

    public WebElement getStefanSchelerLink() {

        return getDriver().findElement(STEFAN_SCHELER_LINK);
    }

    public TeamPage clickStefanSchelerLink() {

        getStefanSchelerLink().click();

        return new TeamPage(getDriver());
    }

    public static String getTeamPageStsSynfloodDeLinkTitle() {
        String TeamPageStsSynfloodDeLinkTitle = "sts.synflood.de";

        return TeamPageStsSynfloodDeLinkTitle;
    }
}