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
    @Test
    public void testNameOfMacroXLanguage() {
        final String expectedResult = "MacroX";

        String actualResult =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickMSubmenu()
                        .getLanguageMacroXVerify();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
