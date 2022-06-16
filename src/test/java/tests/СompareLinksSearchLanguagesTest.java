package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;

public class СompareLinksSearchLanguagesTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testСompareSearchLanguages() {

        String expectedResultPage = "search languages";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        String actualResultHeader = main
                .getSubmitSearchLanguagesMenu()
                .getText()
                .trim()
                .toLowerCase();
        String actualResultFooter = main
                .getFooterSearchLanguagesMenu()
                .getText()
                .trim()
                .toLowerCase();

        Assert.assertEquals(actualResultHeader, expectedResultPage);
        Assert.assertEquals(actualResultFooter, expectedResultPage);
    }
}
