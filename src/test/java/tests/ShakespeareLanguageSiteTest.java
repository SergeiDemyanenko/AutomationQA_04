package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.browse_languages.languages.LanguageShakespearePage;
import pages.MainPage;
import pages.browse_languages.letters.SPage;
import runner.BaseTest;

public class ShakespeareLanguageSiteTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    private static final String SHAKESPEARE_L_SITE_LINK = "http://shakespearelang.sourceforge.net/";

    private final By HEADER_SHAKESPEARE_L_SITE_HOMEPAGE = By.xpath("//div[@id='page']/h1");

    public String headerShakespeareLanguageSiteHomepageText() {

        return getDriver().findElement(HEADER_SHAKESPEARE_L_SITE_HOMEPAGE).getText();
    }

    @Test
    public void testCheckLandingShakespeareLanguageSiteHomepage() {

        String expectedResult = "The Shakespeare Programming Language";

        getDriver().get(BASE_URL);

        MainPage browseLanguage = new MainPage(getDriver());

        browseLanguage.clickBrowseLanguagesMenu();

        AbcPage submenuS = new AbcPage(getDriver());

        submenuS.clickSSubmenu();

        SPage clickShakespeareLanguage = new SPage(getDriver());

        clickShakespeareLanguage.clickShakespeareLanguage();

        LanguageShakespearePage clickShakespeareLanguageSiteLink = new LanguageShakespearePage(getDriver());

        clickShakespeareLanguageSiteLink.clickShakespeareLanguageSite();

        getDriver().get(SHAKESPEARE_L_SITE_LINK);

        String actualResult = headerShakespeareLanguageSiteHomepageText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
