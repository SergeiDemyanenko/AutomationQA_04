package tests.start;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import static runner.TestUtils.createSongLyricsTextUsingAlgorithm;

public class LyricsTest extends BaseTest {

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
