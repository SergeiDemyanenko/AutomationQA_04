package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StartPage;
import runner.BaseTest;
import java.util.ArrayList;
import java.util.List;

public class ConflictResolvingPracticeTest extends BaseTest {


public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

   public static int CountTextP(int n) {

        return n;
    }

    private final By H2_TITLE_A = By.xpath("//div[@id='main']/h2");

    public WebElement getH2PageA() {

        return getDriver().findElement(H2_TITLE_A);
    }

     public static String getText67(String text) {
   
        return text;
    }

    public static String getText5(String text) {

        String str = null;

        return text.concat("Text2").concat("Text3");
    }

    public void testHistoricInformationLinkText2() {
         
        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getHistoricInformationLinkText(), "historic information");
    }

    @Test
    public void testHistoricInformationLinkText() {
        getDriver().get(BASE_URL);        
  
      StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getHistoricInformationLinkText(), "historic information");
    }

    
    public static String getText(String text) {

        return text.concat("Text2").concat("Text3");
    }


    public static List<String> getListWithText(String text) {

        List<String> list = new ArrayList<>();
        list.add(text);

        return list;
    }

    @Test
    public void testCheckSubmenuPrivacyIsClickable() {
        
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
