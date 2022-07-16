package tests.browse_languages.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.languages.LanguageJavascript1948Page;
import runner.BaseTest;

public class LanguageJavascript1948Test extends BaseTest {

    @Test
    public void testLinkToWikipedia() {

        openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickJSubmenu()
                .clickLanguage("JavaScript");

        LanguageJavascript1948Page js = new LanguageJavascript1948Page(getDriver());

        String JavaScriptTitle = js.getTitle();

        js.clickWikiLink();

        String WikipediaTitle = js.getTitle();

        Assert.assertNotEquals(JavaScriptTitle, WikipediaTitle);
    }
}
