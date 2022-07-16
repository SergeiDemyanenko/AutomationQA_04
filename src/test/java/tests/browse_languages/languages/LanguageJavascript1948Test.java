package tests.browse_languages.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.languages.Javascript1948Page;
import pages.browse_languages.languages.LanguagesPage;
import runner.BaseTest;

public class LanguageJavascript1948Test extends BaseTest {

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
