package tests.top_lists;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class TopListNewLanguagesThisMonthTest extends BaseTest {

    @Test
    public void testGoToTheNewLanguagesThisMonth() {
        final String expectedResult = "New Languages this month";

        String actualResult =
                openBaseURL()
                        .clickTopListsMenu()
                        .clickNewLanguagesThisMonthSubmenu()
                                .getTextH2Main();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
