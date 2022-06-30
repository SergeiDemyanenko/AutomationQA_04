package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LanguagePerl737Page;
import pages.MainPage;
import pages.SearchPage;
import runner.BaseTest;

public class VerifyPerlLanguageFeaturesTest extends BaseTest {

    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testPerlLanguageFeatures(){

        final String expectedResult1 = "06/04/05";
        final String expectedResult2 ="Andrew Savige" ;
        final String expectedResult3 = "76";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickSearchMenu();

        SearchPage sp = new SearchPage(getDriver());
        String perl = "Perl";
        sp.getSearchBoxSendKey(perl);

        SearchPage sp2 = new SearchPage(getDriver());
        sp2.clickSubmitSearch();

        SearchPage sp3 = new SearchPage(getDriver());
        sp3.clickPerlLanguage();

        LanguagePerl737Page lp = new LanguagePerl737Page(getDriver());
        lp.getPerlLanguageText();

        LanguagePerl737Page lp1 = new LanguagePerl737Page(getDriver());
        String date = lp1.getPerlLanguageDataText();

        LanguagePerl737Page lp2 = new LanguagePerl737Page(getDriver());
        String author =lp2.getAuthorAndrewSavigeText();

        LanguagePerl737Page lp3 = new LanguagePerl737Page(getDriver());
        String comments = lp3.getPerlLanguageCommentsNumberText();

        Assert.assertEquals(date, expectedResult1);
        Assert.assertEquals(author, expectedResult2);
        Assert.assertEquals(comments, expectedResult3);
    }
}
