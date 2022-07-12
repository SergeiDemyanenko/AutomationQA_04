package tests.browse_languages.letters;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class MTest extends BaseTest {

    @Test
    public void testNameOfMySQLLanguage() {
        final String expectedNameOfLanguage= "MySQL";

        String actualNameOfLanguage =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickMSubmenu()
                        .getLanguageMySQLText();

        Assert.assertEquals(actualNameOfLanguage, expectedNameOfLanguage);
    }
}
