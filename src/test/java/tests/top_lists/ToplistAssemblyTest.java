package tests.top_lists;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class ToplistAssemblyTest extends BaseTest {

    @Test
    public void testGoToTheTopRatedAssemblyLanguages() {
        final String expectedResult = "Top Rated Assembly Languages";

        String actualResult =
                openBaseURL()
                        .clickTopListsMenu()
                        .clickTopListAssemblySubmenu()
                        .getH2MainText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNumberOfLanguages() {
        final int expectedNumberOfLanguages = 25;

        int actualNumberOfLanguages =
                openBaseURL()
                        .clickTopListsMenu()
                        .clickTopListAssemblySubmenu()
                        .getCountTrTags();

        Assert.assertEquals(actualNumberOfLanguages, expectedNumberOfLanguages);
    }
}
