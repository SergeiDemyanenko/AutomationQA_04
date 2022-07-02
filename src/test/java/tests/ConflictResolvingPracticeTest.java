package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StartPage;
import runner.BaseTest;

public class ConflictResolvingPracticeTest extends BaseTest {

    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testHistoricInformationLinkText() {
        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getHistoricInformationLinkText(), "historic information");
    }

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net";
    public static String getText(String text) {

        return text;
    }

    @Test
    public void testCheckSubmenuPrivacyIsClickable(){
        String expectedResult = "Privacy";

        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());

        String actualResult = startPage.getImpressumSubmenuText();

        Assert.assertEquals(actualResult,expectedResult);
    }

  public static String getTextljHEFJEJLFVJLWEVFWVFEF(String text, int number) {

        number += number;

        return text;
    }
}
