package tests.browse_languages.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class LanguageCSharpTest extends BaseTest {

    @Test
    public void testNumberOfCSharpLanguageVersions() {

        final int expectedNumberOfCSharpLanguageVersions = 7;

        int actualNumberOfCSharpLanguageVersions = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickCSubmenu()
                .clickCSharpLanguage()
                .getCSharpLanguageNumberOfVersions();

        Assert.assertEquals(actualNumberOfCSharpLanguageVersions,expectedNumberOfCSharpLanguageVersions);
    }
}
