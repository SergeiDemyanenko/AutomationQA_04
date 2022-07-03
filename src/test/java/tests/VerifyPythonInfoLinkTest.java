package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.LanguagePython808Page;
import pages.MainPage;
import pages.PPage;
import runner.BaseTest;

public class VerifyPythonInfoLinkTest extends BaseTest {

    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void PythonInfoLinkTest(){

        final String expectedResult = "https://www.python.org/";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage p = new AbcPage(getDriver());
        p.clickPSubmenu();

        PPage python = new PPage(getDriver());
        python.clickPythonLanguage();

        LanguagePython808Page lp = new LanguagePython808Page(getDriver());
        lp.clickPythonLanguageInfoLink();

        String strUrl = getDriver().getCurrentUrl();

        Assert.assertEquals(strUrl, expectedResult);
    }
}
