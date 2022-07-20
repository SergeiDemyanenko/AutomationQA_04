package tests._to_do;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class KatyTBrowseLanguagesTest extends BaseTest {

    @Test
    public void testSwitchToLoginPageReddit(){

        final String KOTLIN_LANGUAGE = "Kotlin";

        final String expectedSwitchToLoginPageReddit = "reddit.com: Log in";

        String actualSwitchToLoginPageReddit = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickKSubmenu()
                .clickLanguage(KOTLIN_LANGUAGE)
                .clickRedditIcon()
                .getTitle();

        Assert.assertEquals(actualSwitchToLoginPageReddit, expectedSwitchToLoginPageReddit);
    }
}
