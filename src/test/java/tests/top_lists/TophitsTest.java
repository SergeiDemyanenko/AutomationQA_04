package tests.top_lists;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class TophitsTest extends BaseTest {

    @Test
    public void testGoToTheTopHits() {
        final String expectedResult = "Top Hits";

        String actualResult =
                openBaseURL()
                        .clickTopListsMenu()
                        .clickTopHitsSubmenu()
                        .getH2MainText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTextTopHitsSubmenu() {

        String expectedTextTopHitsSubmenu = "Top Hits";

        String actualTextTopHitsSubmenu =
                openBaseURL()
                        .clickTopListsMenu()
                        .clickTopHitsSubmenu()
                        .getTextTopHitsSubmenu();

        Assert.assertEquals(actualTextTopHitsSubmenu, expectedTextTopHitsSubmenu);
    }
}