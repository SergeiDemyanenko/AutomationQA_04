package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;

public class СompareRealLinksSearchLanguages extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testСompareSearchLanguages() {

        String expectedResult = "http://www.99-bottles-of-beer.net/search.html";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        String actualResultHeader = main
                .getSearchMenu()
                .getAttribute("href");
        String actualResultFooter = main
                .getFooterSearch()
                .getAttribute("href");

        Assert.assertEquals(actualResultHeader, expectedResult);
        Assert.assertEquals(actualResultFooter, expectedResult);
    }
}
