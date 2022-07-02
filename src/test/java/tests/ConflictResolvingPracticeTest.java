package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.BaseTest;

public class ConflictResolvingPracticeTest extends BaseTest {

    private final By H2_TITLE_A = By.xpath("//div[@id='main']/h2");

    public WebElement getH2PageA() {

        return getDriver().findElement(H2_TITLE_A);
    }



//    kjdgc



    public static String getText(String text) {

        return text;
    }




}