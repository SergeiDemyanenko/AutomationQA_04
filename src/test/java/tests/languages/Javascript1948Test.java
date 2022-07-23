package tests.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.languages.LanguagesPage;
import runner.BaseTest;

public class Javascript1948Test extends BaseTest {

    @Test
    public void testLinkToWikipedia() {

        openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickJSubmenu()
                .clickLanguage("JavaScript");

        LanguagesPage js = new LanguagesPage(getDriver());
        String JavaScriptTitle = js.getTitle();
        js.clickInfoLink();

        Assert.assertNotEquals(JavaScriptTitle, getExternalPageURL());
    }
}
