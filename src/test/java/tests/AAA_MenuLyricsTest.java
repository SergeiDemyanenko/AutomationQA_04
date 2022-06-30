package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StartPage;
import runner.BaseTest;

public class AAA_MenuLyricsTest extends BaseTest {
    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testVerifyText() {
        String expectedResult = "Song Lyrics";

        getDriver().get(BASE_URL);
        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getLyricsSubmenu().getText(), expectedResult);
    }

    @Test
    public void testVerifyLinkText() {
        String expectedResult = "http://www.99-bottles-of-beer.net/lyrics.html";

        getDriver().get(BASE_URL);
        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getLyricsSubmenu().getAttribute("href"), expectedResult);
    }

    @Test
    public void testVerifyNavigation() {
        String expectedResult = "99 Bottles of Beer | The lyrics to the song 99 Bottles of Beer";

        getDriver().get(BASE_URL);
        StartPage startPage = new StartPage(getDriver());
        startPage.getLyricsSubmenu().click();

        Assert.assertEquals(getDriver().getTitle(), expectedResult);
    }
}
