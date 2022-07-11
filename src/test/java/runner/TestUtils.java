package runner;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;

public final class TestUtils {

    private static void getBottles(StringBuilder lyrics, int number, String btl) {
        lyrics.append(number).append(btl);
    }

    private static void getNoMore(StringBuilder lyrics, String noMore, String btl) {
        lyrics.append(noMore).append(btl);
    }

    public static String createSongLyricsTextUsingAlgorithm() {
        final String BOTTLES_WALL_CS = " bottles of beer on the wall, ";
        final String BOTTLES_DOT_LN = " bottles of beer.\n";
        final String BOTTLES_DOT = " bottles of beer on the wall.";
        final String TAKE = "Take one down and pass it around, ";
        final String GO = "Go to the store and buy some more, ";
        final String NO_MORE = "No more";

        StringBuilder lyrics = new StringBuilder();

        getBottles(lyrics, 99, BOTTLES_WALL_CS);
        getBottles(lyrics, 99, BOTTLES_DOT_LN);
        for (int i = 98; i > -1; i--) {
            lyrics.append(TAKE);

            if (i == 1) {
                getBottles(lyrics, i, BOTTLES_DOT.replace("s", ""));
                getBottles(lyrics, i, BOTTLES_WALL_CS.replace("s", ""));
                getBottles(lyrics, i, BOTTLES_DOT_LN.replace("s", ""));
            } else if (i == 0) {
                getNoMore(lyrics, NO_MORE.toLowerCase(), BOTTLES_DOT);
                getNoMore(lyrics, NO_MORE, BOTTLES_WALL_CS);
                getNoMore(lyrics, NO_MORE.toLowerCase(), BOTTLES_DOT_LN);
            } else {
                getBottles(lyrics, i, BOTTLES_DOT);
                getBottles(lyrics, i, BOTTLES_WALL_CS);
                getBottles(lyrics, i, BOTTLES_DOT_LN);
            }
        }
        lyrics.append(GO);
        getBottles(lyrics, 99, BOTTLES_DOT);

        return lyrics.toString();
    }

    public static String getRandomStr(int length) {

        return RandomStringUtils.random(length,
                "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
    }

    public static int getRandomNumbers(int length) {

        if (length == 2) {

            return (int) (Math.random() * 90 + 10);
        } else if (length == 3) {

            return (int) (Math.random() * 900 + 100);
        } else if (length == 4) {

            return (int) (Math.random() * 9000 + 1000);
        } else if (length == 5) {

            return (int) (Math.random() * 90000 + 10000);
        }

        return -1;
    }

    protected static List<String> getTextOfCode() {

        String b = "bottle(s) of beer";
        String w = " on the wall,";
        String T = "Take one down and pass it around,";
        String Pr = "PRINT ";
        String X = "X";
        String smc = ";";
        String quo = "\"";
        String B = Character.toString(
                        b.charAt(0)
                )
                .toUpperCase() + b.substring(1);

        String B2 = B
                .replace("(", "")
                .replace(")", "");

        String w1 = w
                .replace(",", "");

        List<String> basicCode = new ArrayList<>();

        basicCode.add(
                "REM BASIC Version of 99 "
                        .concat(B2)
        );
        basicCode.add(
                "FOR "
                        .concat(X)
                        .concat("=100 TO 1 STEP -1")
        );
        basicCode.add(
                Pr
                        .concat(X)
                        .concat(smc)
                        .concat(quo)
                        .concat(B)
                        .concat(w)
                        .concat(quo)
                        .concat(smc)
                        .concat(X)
                        .concat(smc)
                        .concat(quo)
                        .concat(b)
                        .concat(quo)
        );
        basicCode.add(
                Pr
                        .concat(quo)
                        .concat(T)
                        .concat(quo));
        basicCode.add(
                Pr
                        .concat(X)
                        .concat("-1")
                        .concat(smc)
                        .concat(quo)
                        .concat(b)
                        .concat(w1)
                        .concat(quo)
        );
        basicCode.add("NEXT");

        return basicCode;
    }

    public static String createBasicCode() {
        StringBuilder basicCode = new StringBuilder();
        int count = 10;
        String sp = " ";
        String ln = "\n";

        for (int i = 0; i < getTextOfCode().size() - 1; i ++ ) {

            basicCode.append(count)
                    .append(sp)
                    .append(getTextOfCode().get(i))
                    .append(ln);

            count+=10;

            if (count == 60) {
                basicCode.append(count)
                        .append(sp)
                        .append(getTextOfCode()
                        .get(getTextOfCode().size() - 1));
            }
        }

        return basicCode.toString();
    }

    protected static String createSrc(String value) {

        return "images/bb/bb".concat(value).concat(".gif");
    }

    public static String createAttributesSrcOfImg() {

        String ln = "\n";

        return createSrc("url")
                .concat(ln)
                .concat(createSrc("email"))
                .concat(ln)
                .concat(createSrc("bold"))
                .concat(ln)
                .concat(createSrc("italic"))
                .concat(ln)
                .concat(createSrc("underline"));
    }
}
