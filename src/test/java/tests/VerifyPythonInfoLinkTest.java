package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.LanguagePythonPage;
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
        main.getBrowseLanguagesMenuClick();

        AbcPage p = new AbcPage(getDriver());
        p.getCategoryPClick();

        PPage python = new PPage(getDriver());
        python.getPythonLanguageClick();

        LanguagePythonPage lp = new LanguagePythonPage(getDriver());
        lp.getPythonWebsiteClick();

        String strUrl = getDriver().getCurrentUrl();

        Assert.assertEquals(strUrl, expectedResult);

    }
}
