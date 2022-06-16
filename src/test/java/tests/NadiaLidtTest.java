package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;
import runner.BaseTest;

public class NadiaLidtTest extends BaseTest {

    private static final String BASE_URL = "https://99-bottles-of-beer.net/";

    @Test
    public void testTitleSearchLenguages () {
        String expectedResult = "Search Languages";

        getDriver().get(BASE_URL);

        SearchPage search = new SearchPage(getDriver());

        search.getSearchMenuClick();

        search.getSearchSubmenuClick();

        String actualResult = search.getH2MainText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
