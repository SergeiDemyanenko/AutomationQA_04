package tests.browse_languages.letters;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class YTest extends BaseTest {

    @Test
    public void testNumberOfYLanguages() {
        final int expectedNumberOfYLanguages = 9;

        int actualNumberOfYLanguages =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickYSubmenu()
                        .getCountTrTags();

        Assert.assertEquals(actualNumberOfYLanguages, expectedNumberOfYLanguages);
    }
}
