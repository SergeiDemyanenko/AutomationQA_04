package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import static runner.TestUtils.createSongLyricsTextUsingAlgorithm;

public class LessonsTest extends BaseTest {

    @Test
    public void testSongLyricsText() {
        String expectedSongLyricsText = createSongLyricsTextUsingAlgorithm();

        String actualSongLyricsText =
                openBaseURL()
                        .clickStartMenu()
                        .clickLyricsSubmenu()
                        .getSongLyricsText();

        Assert.assertEquals(actualSongLyricsText, expectedSongLyricsText);
    }

    @Test
    public void testH1HeaderText() {
        final String expectedH1HeaderText = "99 Bottles of Beer";

        String actualH1HeaderText =
                openBaseURL()
                        .getH1HeaderText();

        Assert.assertEquals(actualH1HeaderText, expectedH1HeaderText);
    }
}
