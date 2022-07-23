package tests.main;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.browse_languages.letters.APage;
import pages.start.StartPage;
import runner.BaseTest;
import tests.TestData;

public class NavigationTest extends BaseTest {

    @Test(
            priority = 2,
            dataProviderClass = TestData.class,
            dataProvider = "MainPageTestData"
    )
    public void testFootersNavigationToUrlAndReturnBackFromBaseURL(
            int index, String footerName, String footerLink, String footerTitle
    ){
        MainPage main = openBaseURL();
        String baseLink = getDriver().getCurrentUrl();
        String baseTitle = getDriver().getTitle();

        main.clickLink(index);
        String newLink = getDriver().getCurrentUrl();
        String newTitle = getDriver().getTitle();

        if(baseTitle.equals(newTitle)) {
            Assert.assertEquals(newLink, baseLink);
        } else {
            Assert.assertNotEquals(newLink, baseLink, ">>>New URL equals previous URL, probably, we are clicking on the same menu<<<");
        }
        Assert.assertEquals(newLink, footerLink);

        getDriver().navigate().back();
        String goBackLink = getDriver().getCurrentUrl();

        Assert.assertNotEquals(newLink, goBackLink);
        if(baseTitle.equals(newTitle)) {
            Assert.assertNotEquals(goBackLink, baseLink);
        } else {
            Assert.assertEquals(goBackLink, baseLink);
        }
    }

    @Test
    public void testMenuStartNavigation() {
        StartPage start = new StartPage(getDriver());

        WebElement oldStartMenu = openBaseURL().getStartMenu();
        WebElement sameStartMenu = start.getStartMenu();

        Assert.assertEquals(oldStartMenu, sameStartMenu);

        String oldCurrentUrl = getDriver().getCurrentUrl();
        start.clickStartMenu();
        String newCurrentUrl = getDriver().getCurrentUrl();

        Assert.assertEquals(newCurrentUrl, oldCurrentUrl);

        WebElement newStartMenuAfterClick = start.getStartMenu();

        Assert.assertNotEquals(oldStartMenu, newStartMenuAfterClick);
    }

    @Test
    public void testNavigationInfoSubmenu() {
        String expectedNavigationInfoSubmenu = "History";

        String actualNavigationInfoSubmenu = openBaseURL()
                .clickStartMenu()
                .clickHistorySubmenu()
                .getH2MainText();

        Assert.assertEquals(actualNavigationInfoSubmenu, expectedNavigationInfoSubmenu);
    }

    @Test
    public void testH2TextForTeamSubmenu() {
        String expectedTextH2MainHeader = "The Team";

        String actualTextH2MainHeader = openBaseURL()
                .clickStartMenu()
                .clickTeamSubmenu()
                .getH2MainText();

        Assert.assertEquals(expectedTextH2MainHeader, actualTextH2MainHeader);
    }

    @Test
    public void testTextZeroSubmenu() {
        final String expectedTextZeroSubmenu = "0-9";

        String actualTextZeroSubmenu =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .getZeroSubmenuText();

        Assert.assertEquals(actualTextZeroSubmenu, expectedTextZeroSubmenu);
    }

    @Test
    public void testLinkTextZeroSubmenu() {
        final String expectedLinkTextZeroSubmenu = "http://www.99-bottles-of-beer.net/0.html";

        String actualLinkTextZeroSubmenu =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .getZeroSubmenu()
                        .getAttribute("href");

        Assert.assertEquals(actualLinkTextZeroSubmenu, expectedLinkTextZeroSubmenu);
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

        openBaseURL().clickGuestbookV2Menu();

        Assert.assertTrue(getDriver()
                .getCurrentUrl()
                .contains(expectedMenuGuestbookV2Navigation));
    }
}