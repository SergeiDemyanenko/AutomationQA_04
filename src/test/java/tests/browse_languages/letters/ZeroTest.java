package tests.browse_languages.letters;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class ZeroTest extends BaseTest {

    @Test
    public void testH2MainText() {
        final String expectedH2MainText = "Category 0-9";

        String actualH2MainText =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickZeroSubmenu()
                        .getH2MainText();

        Assert.assertEquals(actualH2MainText, expectedH2MainText);
    }

    @Test
    public void testNumberOfLanguages() {
        final int expectedNumberOfLanguages = 10;

        int actualNumberOfLanguages =
                openBaseURL().
                        clickBrowseLanguagesMenu()
                        .clickZeroSubmenu()
                        .getCountTDLinks();

        Assert.assertEquals(actualNumberOfLanguages, expectedNumberOfLanguages);
    }
}
