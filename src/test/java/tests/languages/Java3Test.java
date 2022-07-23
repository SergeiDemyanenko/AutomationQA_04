package tests.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class Java3Test extends BaseTest {

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

    @Test
    public void testNumberOfVersions() {
        final int expectedNumberOfVersions = 6;

        int actualNumberOfVersions =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickJSubmenu()
                        .clickLinkLanguageJava3().numberOfVersions();

        Assert.assertEquals(actualNumberOfVersions, expectedNumberOfVersions);
    }

    @Test
    public void testJavaObjectOrientedVersionHasTheLargestNumberOfComments() {
        int expectedObjectOrientedVersionHasTheLargestNumberOfComments = 33;

        Assert.assertEquals(expectedObjectOrientedVersionHasTheLargestNumberOfComments, openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickJSubmenu()
                .clickLinkLanguageJava3()
                .getCountOfCommentsHeaders());
    }
}
