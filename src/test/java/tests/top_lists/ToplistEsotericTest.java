package tests.top_lists;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class ToplistEsotericTest extends BaseTest {

    @Test
    public void testGoToTheTopRatedEsotericLanguages() {
        final String expectedResult = "Top Rated Esoteric Languages";

        String actualResult =
                openBaseURL().
                        clickTopListsMenu()
                        .clickTopListEsotericSubmenu()
                        .getH2MainText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
