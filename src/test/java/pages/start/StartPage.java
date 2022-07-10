package pages.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class StartPage extends BasePage {

    private final By INFO_MAIN = By.xpath("//a[@href='./info.html']");
    private final By LYRICS_MAIN = By.xpath("//a[@href='./lyrics.html']");
    private final By LYRICS_SUBMENU = By.linkText("Song Lyrics");
    private final By INFO_SUBMENU = By.xpath("//a[@href='info.html']");
    private final By TEAM_SUBMENU = By.xpath("//a[@href='team.html']");
    private final By LAST_P_MAIN_START = By.xpath("//div[@id='main']/p[last()]");
    private final By IMPRESSUM_SUBMENU = By.xpath("//a[@href = 'impressum.html']");
    private final By H2_HEADER = By.xpath("//div[@id='header']/h2");

    @FindBy(xpath = "//a[@href='./info.html']")
    private WebElement historicInformationLink;

    @FindBy(xpath = "//a[@href='./lyrics.html']")
    private WebElement hereLink;

    @FindBy(xpath = "//a[@href='./submitnewlanguage.html']")
    private WebElement  submitYourOwnPieceOfCodeLink;

    @FindBy(xpath = "//a[@href='./guestbookv2.html']")
    private WebElement  guestbookLink;

    @FindBy(xpath = "//a[@href='./team.html']")
    private WebElement  teamMembersLink;

    public StartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(), this);
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

    public LyricsPage clickLyricsSubmenu() {
        getLyricsSubmenu().click();

        return new LyricsPage(getDriver());
    }

    public WebElement getInfoSubmenu(){

        return getDriver().findElement(INFO_SUBMENU);
    }

    public InfoPage clickInfoSubmenu(){

        getInfoSubmenu().click();
        return new InfoPage(getDriver());
    }

    public WebElement getTeamSubmenu() {

        return getDriver().findElement(TEAM_SUBMENU);
    }

    public TeamPage clickTeamSubmenu() {

        getTeamSubmenu().click();

        return new TeamPage(getDriver());
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

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2HeaderText() {

        return getText(getH2Header());
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

    public WebElement getHistoricInformationLink() {

        return historicInformationLink;
    }

    public String getHistoricInformationLinkText() {

        return getHistoricInformationLink().getText();
    }

    public void clickHistoricInformationLink() {

        historicInformationLink.click();
    }

    public WebElement getHereLink() {

        return hereLink;
    }

    public String getHereLinkText() {

        return getHereLink().getText();
    }

    public void clickHereLink() {

        hereLink.click();
    }

    public WebElement getSubmitYourOwnPieceOfCodeLink() {

        return submitYourOwnPieceOfCodeLink;
    }

    public String getSubmitYourOwnPieceOfCodeLinkText() {

        return getSubmitYourOwnPieceOfCodeLink().getText();
    }

    public void clickSubmitYourOwnPieceOfCodeLink() {

        submitYourOwnPieceOfCodeLink.click();
    }

    public WebElement getGuestbookLink() {

        return guestbookLink;
    }

    public String getGuestbookLinkText() {

        return getGuestbookLink().getText();
    }

    public void clickGuestbookLink() {

        guestbookLink.click();
    }

    public WebElement getTeamMembersLink() {

        return teamMembersLink;
    }

    public String getTeamMembersLinkText() {

        return getTeamMembersLink().getText();
    }

    public void clickTeamMembersLink() {

        teamMembersLink.click();
    }
}