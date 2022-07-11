package tests.main;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class FooterMenuButtonsTest extends BaseTest {

        @Test
    public void testFooterMenuBarMainPage() {

        String expectedFooterMenuBar = "Start | Browse Languages | Search Languages | Top Lists | Guestbook | Submit new Language";

        String actualFooterMenuBar = openBaseURL().getFooterBarText();

        Assert.assertEquals(actualFooterMenuBar, expectedFooterMenuBar);
    }
    @Test
    public void testFooterBrowseLanguageButton(){
        String expectedAbcPageUrl ="http://www.99-bottles-of-beer.net/abc.html";

        String  actualAbcPageUrl = openBaseURL()
                .clickFooterBrowseLanguage()
                .getDriver()
                .getCurrentUrl();

       Assert.assertEquals(actualAbcPageUrl, expectedAbcPageUrl);
    }

    @Test
    public void testFooterSearchButton(){
        String expectedSearchPageUrl = "http://www.99-bottles-of-beer.net/search.html";

        String actualSearchPageUrl = openBaseURL()
                .clickFooterSearchButton()
               .getDriver()
               .getCurrentUrl();

        Assert.assertEquals(actualSearchPageUrl, expectedSearchPageUrl);
    }

    @Test
    public void testFooterTopListButton(){
            String expectedTopListPageUrl = "http://www.99-bottles-of-beer.net/toplist.html";

            String actualTopListPageUrl = openBaseURL()
                    .clickFooterTopList()
                    .getDriver()
                    .getCurrentUrl();
            Assert.assertEquals(actualTopListPageUrl, expectedTopListPageUrl);
    }
}
