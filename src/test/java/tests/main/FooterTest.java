package tests.main;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;

import java.util.List;

public class FooterTest extends BaseTest {

    @DataProvider(name = "FooterTestData")
    public Object[][] footerDataProvider() {

        return new Object[][]{
            {0, "Start", "http://www.99-bottles-of-beer.net/"},
            {1, "Browse Languages", "http://www.99-bottles-of-beer.net/abc.html"},
            {2, "Search Languages", "http://www.99-bottles-of-beer.net/search.html"},
            {3, "Top Lists", "http://www.99-bottles-of-beer.net/toplist.html"},
            {4, "Guestbook", "http://www.99-bottles-of-beer.net/guestbookv2.html"},
            {5, "Submit new Language", "http://www.99-bottles-of-beer.net/submitnewlanguage.html"}
        };
    }

    @Test(
            priority = 1
    )
    public void testFootersCount() {
        int expectedFooterCount = 6;

        int actualFooterCount = openBaseURL().getFooterAll().size();

        Assert.assertEquals(actualFooterCount, expectedFooterCount, ">>>Expected Footer Count = 6, but getting failure<<<");
    }

    @Test(
            priority = 2,
            dependsOnMethods = "testFootersCount",
            dataProvider = "FooterTestData"
    )
    public void testFootersTextsAndLinks(int index, String footerName, String footerLink) {
        MainPage main = openBaseURL();
        List<WebElement> footers = main.getFooterAll();
        String footerText = main.getText(footers.get(index));
        List<String> footersLinks = main.getLinks(footers);

        Assert.assertEquals(footerText, footerName);
        Assert.assertEquals(footersLinks.get(index), footerLink);
    }

    @Test(
            priority = 2,
            dependsOnMethods = {"testFootersCount", "testFootersTextsAndLinks"},
            dataProvider = "FooterTestData"
    )
    public void testFootersNavigationToUrlAndReturnBack(int index, String footerName, String footerLink) {
        MainPage main = openBaseURL();
        String baseLink = getDriver().getCurrentUrl();

        main.clickLink(index);
        String newLink = getDriver().getCurrentUrl();

        Assert.assertNotEquals(newLink, baseLink, ">>>New URL equals previous URL, probably, we are clicking on the same menu<<<");
        Assert.assertEquals(newLink, footerLink);

        getDriver().navigate().back();
        String goBackLink = getDriver().getCurrentUrl();

        Assert.assertNotEquals(newLink, goBackLink);
        Assert.assertEquals(goBackLink, baseLink);
    }

    @Test(
            priority = 3
    )
    public void testFooterMenuBarMainPage() {

        String expectedFooterMenuBar = "Start | Browse Languages | Search Languages | Top Lists | Guestbook | Submit new Language";

        String actualFooterMenuBar = openBaseURL().getFooterBarText();

        Assert.assertEquals(actualFooterMenuBar, expectedFooterMenuBar);
    }

    @Test
    public void testFooterBrowseLanguageButton() {
        String expectedAbcPageUrl = "http://www.99-bottles-of-beer.net/abc.html";

        String actualAbcPageUrl = openBaseURL()
                .clickFooterBrowseLanguages()
                .getDriver()
                .getCurrentUrl();

        Assert.assertEquals(actualAbcPageUrl, expectedAbcPageUrl);
    }

    @Test
    public void testFooterSearchButton() {
        String expectedSearchPageUrl = "http://www.99-bottles-of-beer.net/search.html";

        String actualSearchPageUrl = openBaseURL()
                .clickFooterSearchLanguages()
                .getDriver()
                .getCurrentUrl();

        Assert.assertEquals(actualSearchPageUrl, expectedSearchPageUrl);
    }

    @Test
    public void testFooterTopListButton() {
        String expectedTopListPageUrl = "http://www.99-bottles-of-beer.net/toplist.html";

        String actualTopListPageUrl = openBaseURL()
                .clickFooterTopLists()
                .getDriver()
                .getCurrentUrl();
        Assert.assertEquals(actualTopListPageUrl, expectedTopListPageUrl);
    }
}
