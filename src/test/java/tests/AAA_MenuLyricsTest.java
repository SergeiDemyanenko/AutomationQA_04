package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.start.StartPage;
import runner.BaseTest;

public class AAA_MenuLyricsTest extends BaseTest {
    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testVerifyText() {
        getDriver().get(BASE_URL);
        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getLyricsSubmenu().getText(), "Song Lyrics");
    }

    @Test
    public void testVerifyLinkText() {
        getDriver().get(BASE_URL);
        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getLyricsSubmenu().getAttribute("href"),
                "http://www.99-bottles-of-beer.net/lyrics.html");
    }

    @Test
    public void testVerifyNavigation() {
        getDriver().get(BASE_URL);
        StartPage startPage = new StartPage(getDriver());
        startPage.getLyricsSubmenu().click();

        Assert.assertEquals(getDriver().getTitle(),
                "99 Bottles of Beer | The lyrics to the song 99 Bottles of Beer");
    }
}