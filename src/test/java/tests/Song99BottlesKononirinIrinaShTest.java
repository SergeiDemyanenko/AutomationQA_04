package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.start.LyricsPage;
import pages.start.StartPage;
import runner.BaseTest;
import runner.TestUtils;

public class Song99BottlesKononirinIrinaShTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net";

    @Test
    public void testSongLyricsText() {

        getDriver().get(BASE_URL);

        StartPage start = new StartPage(getDriver());

        start.clickLyricsSubmenu();

        LyricsPage lyrics = new LyricsPage(getDriver());

        Assert.assertEquals(lyrics.getSongLyricsText(), TestUtils.createSongLyricsTextUsingAlgorithm());
    }
}
