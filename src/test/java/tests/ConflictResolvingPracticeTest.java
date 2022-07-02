package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StartPage;
import runner.BaseTest;

public class ConflictResolvingPracticeTest extends BaseTest {

public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

   public static int CountTextP(int n) {

        return n;
    }

    public static String getText5(String text) {

        String str = null;

        return text.concat("Text2").concat("Text3");
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

