package pages.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.guestbook.GuestbookV2Page;
import pages.submit_new_language.SubmitNewLanguagePage;

public class StartPage extends BaseStartPage {

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

    public WebElement getHistoricInformationLink() {

        return historicInformationLink;
    }

    public WebElement getHereLink() {

        return hereLink;
    }

    public WebElement getSubmitYourOwnPieceOfCodeLink() {

        return submitYourOwnPieceOfCodeLink;
    }

    public WebElement getGuestbookLink() {

        return guestbookLink;
    }

    public WebElement getTeamMembersLink() {

        return teamMembersLink;
    }

    public String getHistoricInformationLinkText() {

        return getHistoricInformationLink().getText();
    }

    public String getHereLinkText() {

        return getHereLink().getText();
    }

    public String getSubmitYourOwnPieceOfCodeLinkText() {

        return getSubmitYourOwnPieceOfCodeLink().getText();
    }

    public String getGuestbookLinkText() {

        return getGuestbookLink().getText();
    }

    public String getTeamMembersLinkText() {

        return getTeamMembersLink().getText();
    }

    public InfoPage clickHistoricInformationLink() {

        getHistoricInformationLink().click();

        return new InfoPage(getDriver());
    }

    public LyricsPage clickHereLink() {
        getHereLink().click();

        return new LyricsPage(getDriver());
    }

    public SubmitNewLanguagePage clickSubmitYourOwnPieceOfCodeLink() {
        getSubmitYourOwnPieceOfCodeLink().click();

        return new SubmitNewLanguagePage(getDriver());
    }

    public GuestbookV2Page clickGuestbookLink() {
        getGuestbookLink().click();

        return new GuestbookV2Page(getDriver());
    }

    public TeamPage clickTeamMembersLink() {
        getTeamMembersLink().click();

        return new TeamPage(getDriver());
    }
}