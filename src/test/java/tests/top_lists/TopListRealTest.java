package tests.top_lists;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class TopListRealTest extends BaseTest {

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
