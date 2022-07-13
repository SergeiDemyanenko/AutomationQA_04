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
                        .clickTopListMenu()
                        .clickTopListAssemblySubmenu()
                        .getH2TableAssemblyName();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
