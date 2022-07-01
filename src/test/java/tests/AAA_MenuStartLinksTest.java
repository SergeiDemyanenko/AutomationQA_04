package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InfoPage;
import pages.StartPage;
import runner.BaseTest;

public class AAA_MenuStartLinksTest extends BaseTest {

    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testHistoricInformationLinkText() {
        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getHistoricInformationLinkText(), "historic information");
    }

    @Test
    public void testHistoricInformationLink() {
        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());
        startPage.clickHistoricInformationLink();

        Assert.assertEquals(getDriver().getTitle(),
                "99 Bottles of Beer | Background and historic information");
    }
}