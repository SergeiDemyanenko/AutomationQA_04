package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.CPage;
import pages.MainPage;
import runner.BaseTest;

public class OlgaSafMenuStartPageTest extends BaseTest {
    private static final String URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testMenuStartPage() {
       getDriver().get(URL);

        String expectedResult = "Welcome to 99 Bottles of Beer";

        WebElement menuStart = getDriver().findElement(
                By.xpath("(//a[@href='/'])[1]"));
        menuStart.click();

        String actualResult = getDriver().findElement(By.xpath("//div[@id='main']/h2")).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSubMenuCategoryC() {

        String expectedResult = "C";

        getDriver().get(URL);

        MainPage bl = new MainPage(getDriver());
        bl.getBrowseLanguagesMenuClick();

        AbcPage abcC = new AbcPage(getDriver());

        String actualResult = abcC.getCategoryC().getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTitleCPage(){

        String expectedResult = "Category C";

        getDriver().get(URL);

        MainPage main = new MainPage(getDriver());
        main.getBrowseLanguagesMenuClick();

        AbcPage c = new AbcPage(getDriver());
        c.getCategoryCClick();

        CPage title = new CPage(getDriver());


        String actualResult = title.getH2PageCText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
