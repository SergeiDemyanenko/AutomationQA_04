package tests.top_lists;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class TopListRealTest extends BaseTest {

    @Test
    public void testH2HeaderText(){
       final  String expectedText = "Top Rated Real Languages";

       String actualText =
                openBaseURL()
                        .clickTopListMenu()
                        .clickTopListRealSubmenu()
                        .getTextH2Header()
                        .trim();

        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void testH2HeaderColor(){
        final  String expectedColor = "rgba(27, 101, 28, 1)";

        String actualColor =
                openBaseURL()
                        .clickTopListMenu()
                        .clickTopListRealSubmenu()
                        .getH2Header()
                        .getCssValue("color");

        Assert.assertEquals(actualColor,expectedColor);
    }
}