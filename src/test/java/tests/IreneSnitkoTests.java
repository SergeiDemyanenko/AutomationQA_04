package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import runner.BaseTest;

public class IreneSnitkoTests extends BaseTest {

    private static final String BASE_URL = "https://www.99-bottles-of-beer.net/";

    @Test
    public void testCodeOfBasicOnHistoryPage() {

        getDriver().get(BASE_URL);

        StartPage start = new StartPage(getDriver());

        start.getHistoryMenuClick();

        HistoryPage history = new HistoryPage(getDriver());

        Assert.assertEquals(history.getCodeOfLanguageBasic(), history.createBasicCode());
    }

    @Test
    public void testCountNumberOfProgrammingLanguagesOnJPage() {

        int expectedResult = 22;

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());

        main.getBrowseLanguagesMenuClick();

        AbcPage abc = new AbcPage(getDriver());

        abc.getCategoryJClick();

        JPage j = new JPage(getDriver());

        Assert.assertEquals(j.countProgrammingLanguages(), expectedResult);
    }
}
