package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;
import java.util.List;

public class Song99BottlesEkaterinaKazakovaTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    private void getBottles(StringBuilder lyrics, int number, String btl) {
        lyrics.append(number).append(btl);
    }

    private void getNoMore(StringBuilder lyrics, String noMore, String btl) {
        lyrics.append(noMore).append(btl);
    }

    private String createLyrics() {
        final String BOTTLES_DOT_LN = " bottles of beer.\n";
        final String BOTTLES_WALL_COMMA_SPACE = " bottles of beer on the wall, ";
        final String BOTTLES_WALL_DOT = " bottles of beer on the wall.";
        final String TAKE_COMMA_SPACE = "Take one down and pass it around, ";
        final String ZERO = "No more";
        final String GO = "Go to the store and buy some more, ";

        StringBuilder lyrics = new StringBuilder();

        getBottles(lyrics, 99, BOTTLES_WALL_COMMA_SPACE);
        getBottles(lyrics, 99, BOTTLES_DOT_LN);

        for (int i = 98; i > -1; i--) {
            lyrics.append(TAKE_COMMA_SPACE);
            if (i == 1) {
                getBottles(lyrics, i, BOTTLES_WALL_DOT.replace("s", ""));
                getBottles(lyrics, i, BOTTLES_WALL_COMMA_SPACE.replace("s", ""));
                getBottles(lyrics, i, BOTTLES_DOT_LN.replace("s", ""));
            } else if (i == 0) {
                getNoMore(lyrics, ZERO.toLowerCase(),BOTTLES_WALL_DOT);
                getNoMore(lyrics, ZERO,BOTTLES_WALL_COMMA_SPACE);
                getNoMore(lyrics, ZERO.toLowerCase(),BOTTLES_DOT_LN);
            } else {
                getBottles(lyrics, i, BOTTLES_WALL_DOT);
                getBottles(lyrics, i, BOTTLES_WALL_COMMA_SPACE);
                getBottles(lyrics, i, BOTTLES_DOT_LN);
            }
        }
        lyrics.append(GO);
        getBottles(lyrics, 99, BOTTLES_WALL_DOT);

        return lyrics.toString();
    }

    @Test
    public void Song99BottlesLyricsTest() {

        final String expectedResult = createLyrics();
        By pTags = By.xpath("//div[@id='main']/p");
        By menuSongLyrics = By.xpath("//a[@href='lyrics.html']");

        getDriver().get(BASE_URL);
        getDriver().findElement(menuSongLyrics).click();

        List<WebElement> pAll = getDriver().findElements(pTags);

        StringBuilder actualResult = new StringBuilder();
        for (WebElement p : pAll) {
            actualResult.append(p.getText());
        }

        Assert.assertEquals(actualResult.toString(), expectedResult);
    }
}
