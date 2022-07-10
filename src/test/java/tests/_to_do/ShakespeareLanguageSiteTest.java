package tests._to_do;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class ShakespeareLanguageSiteTest extends BaseTest {

    @Test
    public void testTitleShakespeareLanguageWebSite() {

        final String expectedTitleShakespeareLanguageWebSite = "The Shakespeare Programming Language";

        openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickSSubmenu()
                .clickShakespeareLanguage()
                .clickShakespeareLanguageSite();

        String actualTitleShakespeareLanguageWebSite = getDriver().getTitle();

        Assert.assertEquals(actualTitleShakespeareLanguageWebSite, expectedTitleShakespeareLanguageWebSite);
    }
}
