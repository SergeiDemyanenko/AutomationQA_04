package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.JPage;
import pages.MainPage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;


public class TitleAndDescriptionJPageTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testVerifyTextH2AndPTagJPage(){

        List<String> expectedResults = new ArrayList<>();
        expectedResults.add("Category J");
        expectedResults.add("All languages starting with the " +
                "letter J are shown, sorted by Language.");

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());
        abc.clickJSubmenu();

        JPage j = new JPage(getDriver());

        List<String> actualResults = List.of(j.getH2HeaderText(), j.getPTagText());

        Assert.assertEquals(actualResults, expectedResults);
    }
}