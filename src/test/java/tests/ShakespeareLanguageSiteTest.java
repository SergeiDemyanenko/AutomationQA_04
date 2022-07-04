package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.browse_languages.languages.LanguageShakespearePage;
import pages.MainPage;
import pages.browse_languages.letters.SPage;
import runner.BaseTest;

@Ignore
public class ShakespeareLanguageSiteTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    private static final String SHAKESPEARE_L_SITE_LINK = "http://shakespearelang.sourceforge.net/";

    private final By headerShakespeareLanguageSiteHomepage = By.xpath("//div[@id='page']/h1");

    public String headerShakespeareLanguageSiteHomepageText() {

        return getDriver().findElement(headerShakespeareLanguageSiteHomepage).getText();
    }

    @Test
    public void testCheckLandingShakespeareLanguageSiteHomepage() {

        String expectedResult = "The Shakespeare Programming Language";

        getDriver().get(BASE_URL);

        MainPage browseLanguage = new MainPage(getDriver());

        //browseLanguage.getBrowseLanguagesMenuClick();

        AbcPage categoryS = new AbcPage(getDriver());

        //categoryS.getCategorySClick();

        SPage clickShakespeareLanguage = new SPage(getDriver());

        clickShakespeareLanguage.getShakespeareLanguageClick();

        LanguageShakespearePage clickShakespeareLanguageSiteLink = new LanguageShakespearePage(getDriver());

        clickShakespeareLanguageSiteLink.getShakespeareLanguageSiteClick();

        getDriver().get(SHAKESPEARE_L_SITE_LINK);

        String actualResult = headerShakespeareLanguageSiteHomepageText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
