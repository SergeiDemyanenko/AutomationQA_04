package tests.top_lists;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class TopListTest extends BaseTest {

    @Test
    public void testGoToTheTopRated() {
        final String expectedResult = "Top Rated";

        String actualResult =
                openBaseURL().
                        clickTopListMenu().
                        getTextH2Header();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOfLanguagesInTopRated() {
        final int expectedResult = 25;

        int actualResult =
                openBaseURL().
                        clickTopListMenu().
                        getCountTableLinks();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
