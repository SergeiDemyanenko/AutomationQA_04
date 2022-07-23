package tests.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class CSharpTest extends BaseTest {

    @Test
    public void testNumberOfCSharpLanguageVersions() {
        final String CSHARP_LANGUAGE = "C#";

        final int expectedNumberOfCSharpLanguageVersions = 7;

        int actualNumberOfCSharpLanguageVersions = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickCSubmenu()
                .clickLanguage(CSHARP_LANGUAGE)
                .getCountTrTags();

        Assert.assertEquals(actualNumberOfCSharpLanguageVersions,expectedNumberOfCSharpLanguageVersions);
    }
}
