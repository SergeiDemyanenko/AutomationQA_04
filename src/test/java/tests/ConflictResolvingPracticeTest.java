package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StartPage;
import runner.BaseTest;

public class ConflictResolvingPracticeTest extends BaseTest {

}

    public void testHistoricInformationLinkText2() {
        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getHistoricInformationLinkText(), "historic information");
    }

    @Test
    public void testHistoricInformationLinkText() {
        getDriver().get(BASE_URL);

//    Int

      StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getHistoricInformationLinkText(), "historic information");
    }

    public static String getText6(String text) {

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

    public static int getText9(String text) {

        int length = text.length();
        
        return length;
    }
}