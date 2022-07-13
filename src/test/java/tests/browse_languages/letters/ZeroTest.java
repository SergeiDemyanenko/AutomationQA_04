package tests.browse_languages.letters;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class ZeroTest extends BaseTest {

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
