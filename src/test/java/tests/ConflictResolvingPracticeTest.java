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


  public static String getTextljHEFJEJLFVJLWEVFWVFEF(String text, int number) {
  
  number += number;
  
  return text;  
 }

public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

   public static int CountTextP(int n) {

        return n;
    }


    public static String getTextFourFive(String text) {

        return text;
    }

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
}
