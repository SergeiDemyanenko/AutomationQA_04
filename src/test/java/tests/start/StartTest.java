package tests.start;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class StartTest extends BaseTest {

    @Test
    public void testInfoSubmenuText() {
        String expectedInfoSubmenuText = "History";

        String actualInfoSubmenuText = openBaseURL()
                .getText(openBaseURL()
                        .clickStartMenu()
                        .getInfoSubmenu());

        Assert.assertEquals(actualInfoSubmenuText, expectedInfoSubmenuText);
    }

    @Test
    public void testInfoSubmenuLinkText() {
        String expectedInfoSubmenuLinkText = "http://www.99-bottles-of-beer.net/info.html";

        String actualInfoSubmenuLinkText = openBaseURL()
                .clickStartMenu()
                .getInfoSubmenu()
                .getAttribute("href");

        Assert.assertEquals(actualInfoSubmenuLinkText, expectedInfoSubmenuLinkText);
    }

    @Test
    public void testH2Header() {

        String expectedH2Header = "Welcome to 99 Bottles of Beer";

        String actualH2Header = openBaseURL()
                .clickStartMenu()
                .getH2HeaderMainText();

        Assert.assertEquals(actualH2Header, expectedH2Header);
    }

    @Test
    public void testHistoricInformationLinkText() {
        String expectedHistoricInformationLinkText = "historic information";

        String actualHistoricInformationLinkText =
                openBaseURL()
                        .clickStartMenu()
                        .getHistoricInformationLinkText();

        Assert.assertEquals(actualHistoricInformationLinkText, expectedHistoricInformationLinkText);
    }

    @Test
    public void testHistoricInformationLink() {
        String expectedHistoricInformationLinkTitle = "99 Bottles of Beer | Background and historic information";

        String actualHistoricInformationLinkTitl =
                openBaseURL()
                        .clickStartMenu()
                        .clickHistoricInformationLink()
                        .getTitle();

        Assert.assertEquals(actualHistoricInformationLinkTitl, expectedHistoricInformationLinkTitle);
    }

    @Test
    public void testHereLinkText() {
        String expectedHereLinkText = "here";

        String actualHereLinkTextText =
                openBaseURL()
                        .clickStartMenu()
                        .getHereLinkText();

        Assert.assertEquals(actualHereLinkTextText, expectedHereLinkText);
    }

    @Test
    public void testHereLink() {
        String expectedHereLinkTitle = "99 Bottles of Beer | The lyrics to the song 99 Bottles of Beer";

        String actualHereLinkTitle =
                openBaseURL()
                        .clickStartMenu()
                        .clickHereLink()
                        .getTitle();

        Assert.assertEquals(actualHereLinkTitle, expectedHereLinkTitle);
    }

    @Test
    public void testSubmitYourOwnPieceOfCodeLinkText() {
        String expectedSubmitYourOwnPieceOfCodeLinkText = "submit your own piece of code";

        String actualSubmitYourOwnPieceOfCodeLinkText =
                openBaseURL()
                        .clickStartMenu()
                        .getSubmitYourOwnPieceOfCodeLinkText();

        Assert.assertEquals(actualSubmitYourOwnPieceOfCodeLinkText, expectedSubmitYourOwnPieceOfCodeLinkText);
    }

    @Test
    public void testSubmitYourOwnPieceOfCodeLink() {
        String expectedSubmitYourOwnPieceOfCodeLinkTitle = "99 Bottles of Beer | Submit new Language";

        String actualSubmitYourOwnPieceOfCodeLinkTitle =
                openBaseURL()
                        .clickStartMenu()
                        .clickSubmitYourOwnPieceOfCodeLink()
                        .getTitle();

        Assert.assertEquals(actualSubmitYourOwnPieceOfCodeLinkTitle, expectedSubmitYourOwnPieceOfCodeLinkTitle);
    }

    @Test
    public void testGuestbookLinkText() {
        String expectedGuestbookLinkText = "guestbook";

        String actualGuestbookLinkText =
                openBaseURL()
                        .clickStartMenu()
                        .getGuestbookLinkText();

        Assert.assertEquals(actualGuestbookLinkText, expectedGuestbookLinkText);
    }

    @Test
    public void testGuestbookLink() {
        String expectedGuestbookLinkTitle = "99 Bottles of Beer | Guestbook";

        String actualGuestbookLinkTitle =
                openBaseURL()
                        .clickStartMenu()
                        .clickGuestbookLink()
                        .getTitle();

        Assert.assertEquals(actualGuestbookLinkTitle, expectedGuestbookLinkTitle);
    }

    @Test
    public void testTeamMembersLinkText() {
        String expectedTeamMembersLinkText = "team members";

        String actualTeamMembersLinkText =
                openBaseURL()
                        .clickStartMenu()
                        .getTeamMembersLinkText();

        Assert.assertEquals(actualTeamMembersLinkText, expectedTeamMembersLinkText);
    }

    @Test
    public void testTeamMembersLink() {
        String expectedTeamMembersLinkTitle = "99 Bottles of Beer | The Team";

        String actualTeamMembersLinkTitle =
                openBaseURL()
                        .clickStartMenu()
                        .clickTeamMembersLink()
                        .getTitle();

        Assert.assertEquals(actualTeamMembersLinkTitle, expectedTeamMembersLinkTitle);
    }
}