package tests.search_languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class SearchLanguagesTest extends BaseTest {

    @Test
    public void testH2HeaderText() {
        final String expectedH2HeaderText = "Search Languages";

        String actualH2HeaderText =
                openBaseURL()
                        .clickSearchMenu()
                        .clickSearchSubmenu()
                        .getH2MainText();

        Assert.assertEquals(actualH2HeaderText, expectedH2HeaderText);
    }



}
