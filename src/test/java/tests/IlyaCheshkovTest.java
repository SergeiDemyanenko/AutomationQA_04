package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.browse_languages.AbcPage;
import pages.browse_languages.letters.IPage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class IlyaCheshkovTest extends BaseTest {

    private static final String URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testVerifyH1Text() {

        String expectedResult = "99 Bottles of Beer";

        getDriver().get(URL);
        MainPage main = new MainPage(getDriver());

        String actualResult = main.getH1HeaderText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIPageLanguagesCount() {

        int expectedResult = 44;

        MainPage main = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        IPage i = new IPage(getDriver());

        getDriver().get(URL);
        main.clickBrowseLanguagesMenu();
        abc.clickISubmenu();

        List<WebElement> allTRs = i.getTrTags();

        int actualResult = allTRs.size();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckAllTableLinksClickable() {

        MainPage main = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        IPage i = new IPage(getDriver());

        getDriver().get(URL);
        main.clickBrowseLanguagesMenu();
        abc.clickISubmenu();

        List<WebElement> allTableLinks = i.getLanguageLink();

        List<String> expectedResult = new ArrayList<>();
        List<String> actualResult = new ArrayList<>();

        Assert.assertEquals
                (i.getActualResult(allTableLinks, actualResult),
                        i.getExpectedResult(allTableLinks, "href", expectedResult));
    }
}
