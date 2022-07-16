package tests.browse_languages.letters;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class BTest extends BaseTest {

    @Test
    public void testNumberOfLanguages() {
        final int expectedNumberOfLanguages = 52;

        int actualNumberOfLanguages =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickBSubmenu()
                        .getCountTrTags();

        Assert.assertEquals(actualNumberOfLanguages, expectedNumberOfLanguages);
    }
}
