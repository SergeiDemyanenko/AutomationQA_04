package tests.top_lists;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class NewCommentsTest extends BaseTest {

    @Test
    public void testH2HeaderText() {
        final String expectedH2HeaderText = "New Comments";

        String actualH2HeaderText = openBaseURL()
                .clickTopListsMenu()
                .clickNewCommentsSubmenu()
                .getTextH2Main();

        Assert.assertEquals(actualH2HeaderText, expectedH2HeaderText);
    }

    @Test
    public void testNewComments() {
        final String expectedNewComments = "";

        String actualNewComments = openBaseURL()
                .clickTopListsMenu()
                .clickNewCommentsSubmenu()
                .getTextMainP();

        Assert.assertEquals(actualNewComments, expectedNewComments);
    }
}