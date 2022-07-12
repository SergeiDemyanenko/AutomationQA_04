package tests.browse_languages.letters;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class XTest extends BaseTest {

    @Test
    public void testNumberOfXLanguages() {
        final int expectedNumberOfXLanguages = 14;

        int actualNumberOfXLanguages =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickXSubmenu()
                        .getCountTrTags();

        Assert.assertEquals(actualNumberOfXLanguages, expectedNumberOfXLanguages);
    }
}
