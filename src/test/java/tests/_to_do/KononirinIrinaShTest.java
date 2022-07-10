package tests._to_do;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.browse_languages.letters.KPage;
import pages.MainPage;
import runner.BaseTest;
import java.util.List;

public class KononirinIrinaShTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testLastItemMenuIsSubmitNewLanguage() {

        String expectedResult = "Submit new Language";
        expectedResult = expectedResult.toLowerCase();

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        String actualResult = main.getSubmitNewLanguageMenuText().toLowerCase();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTitleKPage() {

        String expectedResult = "Category K";

        getDriver().get(BASE_URL);

        MainPage browseLang = new MainPage(getDriver());
        browseLang.clickBrowseLanguagesMenu();

        AbcPage k = new AbcPage(getDriver());
        k.clickKSubmenu();

        KPage title = new KPage(getDriver());

        String actualResult = title.getH2PageKText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOfLanguagesFromK() {

        int expectedResult = 18;

        getDriver().get(BASE_URL);

        MainPage browseLang = new MainPage(getDriver());
        browseLang.clickBrowseLanguagesMenu();

        AbcPage k = new AbcPage(getDriver());
        k.clickKSubmenu();

        List<WebElement> versionList = getDriver()
                .findElements(
                        By.xpath("//table[@id='category']/tbody/tr")
                );

        int actualResult = versionList.size();

        Assert.assertEquals(actualResult, expectedResult);
    }
}