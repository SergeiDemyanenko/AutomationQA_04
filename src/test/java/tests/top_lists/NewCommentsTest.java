package tests.top_lists;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class NewCommentsTest extends BaseTest {

    @Test
    public void testH2HeaderText() {
        final String expectedH2MainText = "New Comments";

        String actualH2MainText =
                openBaseURL()
                        .clickTopListsMenu()
                        .clickNewCommentsSubmenu()
                        .getH2MainText();

        Assert.assertEquals(actualH2MainText, expectedH2MainText);
    }

    @Test
    public void testNewComments() {
        final String expectedNewComments = "";

        String actualNewComments = openBaseURL()
                .clickTopListsMenu()
                .clickNewCommentsSubmenu()
                .getMainParagraphText();

        Assert.assertEquals(actualNewComments, expectedNewComments);
    }
}