package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StartPage;
import runner.BaseTest;

public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

public class ConflictResolvingPracticeTest extends BaseTest {

   public static int CountTextP(int n) {

        return n;
    }

    @Test
    public void testHistoricInformationLinkText() {
        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getHistoricInformationLinkText(), "historic information");
    }

  public static String getTextljHEFJEJLFVJLWEVFWVFEF(String text, int number) {

        number += number;

        return text;
    }
}

