package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LyricsPage;
import pages.StartPage;
import runner.BaseTest;

public class Song99BottlesKononirinIrinaShTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net";

    @Test
    public void testSongLyricsText() {

        getDriver().get(BASE_URL);

        StartPage start = new StartPage(getDriver());

        start.clickMenuSongLyrics();

        LyricsPage lyrics = new LyricsPage(getDriver());

        Assert.assertEquals(lyrics.getLyrics(), lyrics.createLyrics());
    }
}
