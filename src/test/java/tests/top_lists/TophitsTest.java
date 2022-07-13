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
                        .clickTopListMenu()
                        .clickTopHitsSubmenu()
                        .getH2TableTopHitsName();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
