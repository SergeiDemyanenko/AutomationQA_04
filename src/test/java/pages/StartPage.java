package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage {
    
    private WebDriver driver;

    private final By INFO_MAIN = By.xpath("//a[@href='./info.html']");
    private final By LYRICS_MAIN = By.xpath("//a[@href='./lyrics.html']");
    private final By LYRICS_SUBMENU = By.linkText("Song Lyrics");
    private final By INFO_SUBMENU = By.xpath("//a[@href='info.html']");
    private final By TEAM_SUBMENU = By.xpath("//a[@href='team.html']");
    private final By LAST_P_MAIN_START = By.xpath("//div[@id='main']/p[last()]");
    private final By IMPRESSUM_SUBMENU = By.xpath("//a[@href = 'impressum.html']");

    public StartPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver(){

        return driver;
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    public WebElement getInfoMain() {

        return getDriver().findElement(INFO_MAIN);
    }

    public void clickInfoMain() {

        getInfoMain().click();
    }

    public WebElement getLyricsMain() {

        return getDriver().findElement(LYRICS_MAIN);
    }

    public void clickLyricsMain() {

        getLyricsMain().click();
    }

    public WebElement getLyricsSubmenu() {

        return getDriver().findElement(LYRICS_SUBMENU);
    }

    public void clickLyricsSubmenu() {
        getLyricsSubmenu().click();
    }

    public WebElement getInfoSubmenu(){

        return getDriver().findElement(INFO_SUBMENU);
    }

    public void clickInfoSubmenu(){

        getInfoSubmenu().click();
    }

    public WebElement getTeamSubmenu() {

        return getDriver().findElement(TEAM_SUBMENU);
    }

    public void clickTeamSubmenu() {

        getTeamSubmenu().click();
    }

    public WebElement getLastPMainStart() {

        return getDriver().findElement(LAST_P_MAIN_START);
    }

    public String getLastPMainStartText() {

        return getText(getLastPMainStart());
    }


    public WebElement getImpressumSubmenu() {

        return getDriver().findElement(IMPRESSUM_SUBMENU);
    }

    public String getImpressumSubmenuText() {

        return getText(getImpressumSubmenu());
    }

    public void clickImpressumSubmenu() {
        getImpressumSubmenu().click();
    }

    public String getSubmenuCurrentUrl(){

        return getDriver().getCurrentUrl();
    }
}
