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

//    Int

        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getHistoricInformationLinkText(), "historic information");
    }

  public static String getTextljHEFJEJLFVJLWEVFWVFEF(String text, int number) {

    number += number;
  }

    public static int getText(String text) {

        int length = text.length();
        
        return length;
    }
}