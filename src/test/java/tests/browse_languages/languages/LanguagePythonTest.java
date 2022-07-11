package tests.browse_languages.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class LanguagePythonTest extends BaseTest {

    @Test
    public void testPythonInfoLink(){

        final String expectedPythonInfoLink = "https://www.python.org/";

        openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickPSubmenu()
                .clickPythonLanguage()
                .clickPythonLanguageInfoLink();

        String actualPythonInfoLink = getDriver().getCurrentUrl();

        Assert.assertEquals(actualPythonInfoLink,expectedPythonInfoLink);
    }
}
