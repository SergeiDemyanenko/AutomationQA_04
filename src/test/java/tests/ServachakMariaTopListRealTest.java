package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.top_lists.TopListPage;
import pages.top_lists.TopListRealPage;
import runner.BaseTest;

public class ServachakMariaTopListRealTest extends BaseTest {

    @Test
    public void testVerifyH2Header(){
        String expectedResultText = "Top Rated Real Languages";
        String expectedResultColor = "rgba(27, 101, 28, 1)";

        String actualResultText =
                openBaseURL()
                        .clickTopListMenu()
                        .clickTopListRealSubmenu()
                        .getTextH2Header()
                        .trim();

        String actualResultColor =
                openBaseURL()
                        .clickTopListMenu()
                        .clickTopListRealSubmenu()
                        .getH2Header()
                        .getCssValue("color");

        Assert.assertEquals(actualResultText,expectedResultText);
        Assert.assertEquals(actualResultColor,expectedResultColor);
    }
}