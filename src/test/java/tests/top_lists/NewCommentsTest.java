package tests.top_lists;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class NewCommentsTest extends BaseTest {

    @Test
    public void testH2HeaderText() {
        String expectedH2HeaderText = "New Comments";

        String actualH2HeaderText = openBaseURL()
                .clickTopListMenu()
                .clickNewCommentsSubmenu()
                .getH2HeaderText();

        Assert.assertEquals(actualH2HeaderText, expectedH2HeaderText);
    }

    @Test
    public void testNewComments() {
        final String expectedNewComments = "";

        String actualNewComments = openBaseURL()
                .clickTopListMenu()
                .clickNewCommentsSubmenu()
                .getTextMainP();

        Assert.assertEquals(actualNewComments, expectedNewComments);
    }
}
