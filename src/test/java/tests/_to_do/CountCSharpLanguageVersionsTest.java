package tests._to_do;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.browse_languages.AbcPage;
import pages.browse_languages.languages.LanguageCSharp1614Page;
import pages.browse_languages.letters.CPage;
import runner.BaseTest;

public class CountCSharpLanguageVersionsTest extends BaseTest {

    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void  testCSharpLanguageVersions(){

        final int expectedResult = 7;

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage c = new AbcPage(getDriver());
        c.clickCSubmenu();

        CPage cSharp = new CPage(getDriver());
        cSharp.clickCSharpLanguage();

        LanguageCSharp1614Page versions = new LanguageCSharp1614Page(getDriver());

        Assert.assertEquals(versions.getCSharpLanguageNumberOfVersions(),expectedResult);
    }
}
