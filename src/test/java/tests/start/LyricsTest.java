package tests.start;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import static runner.TestUtils.createSongLyricsTextUsingAlgorithm;

public class LyricsTest extends BaseTest {

    @Test
    public void testH2MainText() {
        final String expectedH2MainText = "Lyrics of the song 99 Bottles of Beer";

        String actualH2MainText =
                openBaseURL()
                        .clickStartMenu()
                        .clickSongLyricsSubmenu()
                        .getH2MainText();

        Assert.assertEquals(actualH2MainText, expectedH2MainText);
    }

    @Test
    public void testSongLyricsText() {
        String expectedSongLyricsText = createSongLyricsTextUsingAlgorithm();

        String actualSongLyricsText =
                openBaseURL()
                        .clickStartMenu()
                        .clickSongLyricsSubmenu()
                        .getSongLyricsText();

        Assert.assertEquals(actualSongLyricsText, expectedSongLyricsText);
    }
}
