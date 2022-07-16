package tests.main;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.letters.APage;
import pages.browse_languages.letters._LettersPage;
import pages.MainPage;
import pages.browse_languages.AbcPage;
import pages.start.StartPage;
import runner.BaseTest;

public class NavigationTest extends BaseTest {

    @Test
    public void testNavigationInfoSubmenu() {
        String expectedNavigationInfoSubmenu = "History";

        String actualNavigationInfoSubmenu = openBaseURL()
                .clickStartMenu()
                .clickHistorySubmenu()
                .getH2HeaderText();

        Assert.assertEquals(actualNavigationInfoSubmenu, expectedNavigationInfoSubmenu);
    }

    @Test
    public void testTextH2MainHeader() {
        String expectedTextH2MainHeader = "The Team";

        String actualTextH2MainHeader = openBaseURL()
                .clickStartMenu()
                .clickTeamSubmenu()
                .getH2MainText();

        Assert.assertEquals(expectedTextH2MainHeader, actualTextH2MainHeader);
    }

    @Test
    public void testNavigationZeroSubmenu() {
        final String text = "0.html";

        String currentUrl =
                openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickZeroSubmenu()
                .getURL();

        APage a = new APage(getDriver());

        Assert.assertTrue(a.getZeroSubmenu().isEnabled());
        Assert.assertTrue(a.getZeroSubmenu().isDisplayed());
        Assert.assertTrue(currentUrl.contains(text));
    }
    
     @Test
     public void testMenuSubmitNewLanguageText() {
        final String expectedMenuText = "Submit new Language".toLowerCase();

        String actualMenuText =
                openBaseURL()
                        .getSubmitNewLanguageMenuText().
                        toLowerCase();

        Assert.assertEquals(actualMenuText, expectedMenuText);
    }

    @Test
    public void testMenuSubmitNewLanguageLinkText() {
        final String expectedLinkText = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";

        String actualLinkText =
                openBaseURL()
                        .getSubmitNewLanguageMenu()
                        .getAttribute("href");

        Assert.assertEquals(actualLinkText, expectedLinkText);
    }

    @Test
    public void testMenuSubmitNewLanguageNavigation() {
        openBaseURL()
                .clickSubmitNewLanguageMenu();

        Assert.assertFalse(getDriver().getPageSource().isEmpty());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("submitnewlanguage"));
   }
   
   @Test
    public void testMenuStartText() {
        final String expectedMenuStartText = "Start";

        String actualMenuStartText =
                openBaseURL()
                        .getStartMenu()
                        .getText();

        Assert.assertEquals(actualMenuStartText, expectedMenuStartText.toUpperCase());
    }

    @Test
    public void testMenuStartLinkText() {
        final String expectedMenuStartLinkText = "http://www.99-bottles-of-beer.net/";

        String actualMenuStartLinkText =
                openBaseURL()
                        .getStartMenu()
                        .getAttribute("href");

        Assert.assertEquals(actualMenuStartLinkText, expectedMenuStartLinkText);
    }
    
    @Test
    public void testMenuStartNavigation() {
        MainPage main = new MainPage(getDriver());

        WebElement oldStartMenu = openBaseURL().getStartMenu();
        WebElement sameStartMenu = main.getStartMenu();

        Assert.assertEquals(oldStartMenu, sameStartMenu);

        String oldCurrentUrl = getDriver().getCurrentUrl();
        main.clickStartMenu();
        String newCurrentUrl = getDriver().getCurrentUrl();

        Assert.assertEquals(newCurrentUrl, oldCurrentUrl);

        WebElement newStartMenuAfterClick = main.getStartMenu();

        Assert.assertNotEquals(oldStartMenu, newStartMenuAfterClick);
    }

    @Test
    public void testMenuAbcText() {
        final String expectedMenuAbcText = "Browse Languages".toUpperCase();

        String actualMenuAbcText =
                openBaseURL()
                        .getABCMenu()
                        .getText();

        Assert.assertEquals(actualMenuAbcText, expectedMenuAbcText);
    }

    @Test
    public void testMenuAbcLinkText() {
        final String expectedMenuAbcLinkText = "http://www.99-bottles-of-beer.net/abc.html";

        String actualMenuAbcLinkText =
                openBaseURL()
                        .getABCMenu()
                        .getAttribute("href");

        Assert.assertEquals(actualMenuAbcLinkText, expectedMenuAbcLinkText);
    }

    @Test
    public void testMenuAbcNavigation() {
        final String expectedMenuAbcNavigation = "http://www.99-bottles-of-beer.net/abc.html";

        openBaseURL()
                .clickBrowseLanguagesMenu();

        String actualMenuAbcNavigation = getDriver().getCurrentUrl();

        Assert.assertFalse(getDriver().getPageSource().isEmpty());
        Assert.assertEquals(actualMenuAbcNavigation, expectedMenuAbcNavigation);
    }

    @Test
    public void testMenuSearchText() {
        final String expectedMenuSearchText = "Search Languages".toUpperCase();

        String actualMenuSearchText =
                openBaseURL()
                        .getSearchMenu()
                        .getText();

        Assert.assertEquals(actualMenuSearchText, expectedMenuSearchText);
    }

    @Test
    public void testMenuSearchLinkText() {
        final String expectedMenuSearchLinkText = "http://www.99-bottles-of-beer.net/search.html";

        String actualMenuSearchLinkText =
                openBaseURL()
                        .getSearchMenu()
                        .getAttribute("href");

        Assert.assertEquals(actualMenuSearchLinkText, expectedMenuSearchLinkText);
    }

    @Test
    public void testMenuSearchNavigation() {
        final String expectedMenuSearchNavigation = "http://www.99-bottles-of-beer.net/search.html";

        openBaseURL()
                .clickSearchLanguagesMenu();

        String actualMenuSearchNavigation = getDriver().getCurrentUrl();

        Assert.assertFalse(getDriver().getPageSource().isEmpty());
        Assert.assertEquals(actualMenuSearchNavigation, expectedMenuSearchNavigation);
    }

    @Test
    public void testMenuTopListText() {
        final String expectedMenuTopListText = "Top Lists".toUpperCase();

        String actualMenuTopListText =
                openBaseURL()
                        .getTopListMenu()
                        .getText();

        Assert.assertEquals(actualMenuTopListText, expectedMenuTopListText);
    }

    @Test
    public void testMenuTopListLinkText() {
        final String expectedMenuTopListLinkText = "http://www.99-bottles-of-beer.net/toplist.html";

        String actualMenuTopListLinkText =
                openBaseURL()
                        .getTopListMenu()
                        .getAttribute("href");

        Assert.assertEquals(actualMenuTopListLinkText, expectedMenuTopListLinkText);
    }

    @Test
    public void testMenuTopListNavigation() {
        final String expectedMenuTopListNavigation = "http://www.99-bottles-of-beer.net/toplist.html";

        openBaseURL()
                .clickTopListsMenu();

        String actualMenuTopListNavigation = getDriver().getCurrentUrl();

        Assert.assertFalse(getDriver().getPageSource().isEmpty());
        Assert.assertEquals(actualMenuTopListNavigation, expectedMenuTopListNavigation);
    }

    @Test
    public void testMenuGuestbookV2Text() {
        final String expectedMenuGuestbookV2Text = "Guestbook".toUpperCase();

        String actualMenuGuestbookV2Text = openBaseURL()
                .getGuestbookV2Menu()
                .getText();

        Assert.assertEquals(actualMenuGuestbookV2Text, expectedMenuGuestbookV2Text);
    }

    @Test
    public void testMenuGuestbookV2LinkText() {
        final String expectedMenuGuestbookV2LinkText = "http://www.99-bottles-of-beer.net/guestbookv2.html";

        String actualMenuGuestbookV2LinkText = openBaseURL()
                .getGuestbookV2Menu()
                .getAttribute("href");

        Assert.assertEquals(actualMenuGuestbookV2LinkText, expectedMenuGuestbookV2LinkText);
    }

    @Test
    public void testMenuGuestbookV2Navigation() {
        final String expectedMenuGuestbookV2Navigation = "guestbookv2.html";

        openBaseURL().clickGuestbookMenu();

        Assert.assertTrue(getDriver()
                .getCurrentUrl()
                .contains(expectedMenuGuestbookV2Navigation));
    }
}