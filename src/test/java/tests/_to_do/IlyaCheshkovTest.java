package tests._to_do;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.letters.IPage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class IlyaCheshkovTest extends BaseTest {

    private static final String URL = "http://www.99-bottles-of-beer.net/";


    @Test
    public void testCheckAllTableLinksClickable() {
        IPage i = new IPage(getDriver());

        openBaseURL().clickBrowseLanguagesMenu().clickISubmenu();

        List<WebElement> allTableLinks = i.getWebElementsTDLinks();

        List<String> expectedResult = new ArrayList<>();
        List<String> actualResult = new ArrayList<>();

        Assert.assertEquals
                (i.getActualResult(allTableLinks, actualResult),
                        i.getExpectedResult("href", expectedResult));
    }
}
