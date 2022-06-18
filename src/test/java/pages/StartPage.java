package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage {
    private WebDriver driver;

    private final By START_MENU = By.xpath("//ul[@id='menu']/li/a[@href='/']");
    private final By HISTORIC_INFORMATION_LINK = By.xpath("//a[@href='./info.html']");
    private final By HERE_LINK = By.xpath("//a[@href='./lyrics.html']");
    private final By SONG_LYRICS_MENU = By.linkText("Song Lyrics");

    public StartPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver(){

        return driver;
    }

    public WebElement getSTART_MENU() {

        return getDriver().findElement(START_MENU);
    }

    public WebElement getHistoricInformationLink() {

        return getDriver().findElement(HISTORIC_INFORMATION_LINK);
    }

    public void getHistoricInformationLinkClick() {

        getHistoricInformationLink().click();
    }

    public WebElement getHereLink() {

        return getDriver().findElement(HERE_LINK);
    }

    public void getHereLinkClick() {

        getHereLink().click();
    }

    public WebElement getMenuSongLyrics() {

        return getDriver().findElement(SONG_LYRICS_MENU);
    }

    public void clickMenuSongLyrics() {
        getMenuSongLyrics().click();
    }
}