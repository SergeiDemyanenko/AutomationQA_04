package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class BrowseLanguageJavaTest extends BaseTest {

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