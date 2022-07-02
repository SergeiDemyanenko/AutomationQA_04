package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StartPage;

import runner.BaseTest;

public class ConflictResolvingPracticeTest extends BaseTest {


    private final By H2_TITLE_A = By.xpath("//div[@id='main']/h2");

    public WebElement getH2PageA() {

        return getDriver().findElement(H2_TITLE_A);
    }

  public static String getText(String text) {
   return text;
  }

    public static String getText5(String text) {

        String str = null;

        return text.concat("Text2").concat("Text3");
}

    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";


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