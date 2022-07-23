package tests.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class PythonTest extends BaseTest {

    @Test
    public void testPythonInfoLink(){

        final String expectedPythonInfoLink = "https://www.python.org/";

        openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickPSubmenu()
                .clickPythonLanguage()
                .clickPythonLanguageInfoLink();

        String actualPythonInfoLink = getExternalPageURL();

        Assert.assertEquals(actualPythonInfoLink,expectedPythonInfoLink);
    }
}
