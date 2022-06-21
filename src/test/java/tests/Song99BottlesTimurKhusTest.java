package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.util.List;

public class Song99BottlesTimurKhusTest extends BaseTest {

    private void concatSong(StringBuilder lyrics, int number, String btl) {
        lyrics.append(number).append(btl);
    }

    private void concatSong(StringBuilder lyrics, String noMore, String btl) {
        lyrics.append(noMore).append(btl);
    }

    private String createSongText() {
        final String TAKE = "Take one down and pass it around, ";
        final String BOTTLES_WALL_DOT = " bottles of beer on the wall.";
        final String BOTTLES_WALL_COMMA = " bottles of beer on the wall, ";
        final String BOTTLES = " bottles of beer.\n";
        final String NO_MORE = "No more";

        StringBuilder lyrics = new StringBuilder();

        concatSong(lyrics, 99, BOTTLES_WALL_COMMA);
        concatSong(lyrics, 99, BOTTLES);

        for (int i = 98; i > -1; i--) {
            lyrics
                    .append(TAKE);
            if (i == 1) {
                concatSong(lyrics, i, BOTTLES_WALL_DOT.replace("s", ""));
                concatSong(lyrics, i, BOTTLES_WALL_COMMA.replace("s", ""));
                concatSong(lyrics, i, BOTTLES.replace("s", ""));
            } else if (i == 0) {
                concatSong(lyrics, NO_MORE.toLowerCase(), BOTTLES_WALL_DOT);
                concatSong(lyrics, NO_MORE, BOTTLES_WALL_COMMA);
                concatSong(lyrics, NO_MORE.toLowerCase(), BOTTLES);
            } else {
                concatSong(lyrics, i, BOTTLES_WALL_DOT);
                concatSong(lyrics, i, BOTTLES_WALL_COMMA);
                concatSong(lyrics, i, BOTTLES);
            }
        }
        lyrics.append("Go to the store and buy some more, ");
        concatSong(lyrics, 99, BOTTLES_WALL_DOT);

        return lyrics.toString();
    }

    @Test
    public void testSongLyricsText() {
        final String expectedResult = createSongText();
        By pTags = By.xpath("//div[@id='main']/p");

        getDriver().get("https://www.99-bottles-of-beer.net/");
        getDriver().findElement(By.linkText("Song Lyrics")).click();

        StringBuilder actualResult = new StringBuilder();

        List<WebElement> pText = getDriver().findElements(pTags);
        for (WebElement p : pText) {
            actualResult.append(p.getText());
        }

        Assert.assertEquals(actualResult.toString(), expectedResult);
    }
}