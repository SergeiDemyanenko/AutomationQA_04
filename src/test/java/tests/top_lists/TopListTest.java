package tests.top_lists;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class TopListTest extends BaseTest {

    @Test
    public void testGoToTheTopRated() {
        String expectedResult = "Top Rated";

        String actualResult =
                openBaseURL().
                        clickTopListMenu().
                        getNameH2HeaderTopList();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOfLanguagesInTopRated() {
        int expectedResult = 25;

        int actualResult =
                openBaseURL().
                        clickTopListMenu().
                        getCountTableLinks();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
