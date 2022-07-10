package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class CountCSharpLanguageVersionsTest extends BaseTest {

    @Test
    public void testNumberOfCSharpLanguageVersions() {

        final int expectedCSharpLanguageVersions = 7;

        int actualCSharpLanguageVersions = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickCSubmenu()
                .clickCSharpLanguage()
                .getCSharpLanguageNumberOfVersions();

        Assert.assertEquals(actualCSharpLanguageVersions, expectedCSharpLanguageVersions);
    }
}
