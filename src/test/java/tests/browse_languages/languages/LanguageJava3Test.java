package tests.browse_languages.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class LanguageJava3Test extends BaseTest {

    @Test
    public void testJavaVersionWithMaxNumberComments() {
        String expectedJavaVersionName = "object-oriented version";

        String actualJavaVersionName =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickJSubmenu()
                        .clickLinkLanguageJava3()
                        .getNameVersionWithMaxComments();

        Assert.assertEquals(actualJavaVersionName, expectedJavaVersionName);
    }
}
