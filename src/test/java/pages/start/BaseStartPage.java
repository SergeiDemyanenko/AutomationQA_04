package pages.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPage;

import java.util.List;

public abstract class BaseStartPage extends MainPage {

    private final String SUBMENU_BASE_PATH = "//ul[@id='submenu']/li/a[@href=";
    private final By TEAM_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'team.html']");
    private final By LYRICS_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'lyrics.html']");
    private final By INFO_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'info.html']");
    private final By IMPRESSUM_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'impressum.html']");

    private final By H2_MAIN = By.xpath("//div[@id='main']/h2");
    private final By P_TAGS = By.xpath("//div[@id='main']/p");
    private final By LAST_P_MAIN = By.xpath("//div[@id='main']/p[last()]");

    public BaseStartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTeamSubmenu() {

        return getDriver().findElement(TEAM_SUBMENU);
    }

    public WebElement getLyricsSubmenu() {

        return getDriver().findElement(LYRICS_SUBMENU);
    }

    public WebElement getInfoSubmenu(){

        return getDriver().findElement(INFO_SUBMENU);
    }

    public WebElement getImpressumSubmenu() {

        return getDriver().findElement(IMPRESSUM_SUBMENU);
    }

    public WebElement getH2Main() {

        return getDriver().findElement(H2_MAIN);
    }

    public List<WebElement> getPTags() {

        return getDriver().findElements(P_TAGS);
    }

    public WebElement getLastPMain() {

        return getDriver().findElement(LAST_P_MAIN);
    }

    public String getPrivacySubmenuText() {

        return getText(getImpressumSubmenu());
    }

    public String getSongLyricsSubmenuText() {

        return getText(getLyricsSubmenu());
    }

    public String getH2MainText() {

        return getText(getH2Main());
    }

    public String getLastParagraphText() {

        return getText(getLastPMain());
    }

    public TeamPage clickTeamSubmenu() {
        getTeamSubmenu().click();

        return new TeamPage(getDriver());
    }

    public LyricsPage clickSongLyricsSubmenu() {
        getLyricsSubmenu().click();

        return new LyricsPage(getDriver());
    }

    public InfoPage clickHistorySubmenu(){

        getInfoSubmenu().click();
        return new InfoPage(getDriver());
    }

    public ImpressumPage clickPrivacySubmenu() {
        getImpressumSubmenu().click();

        return new ImpressumPage(getDriver());
    }
}
