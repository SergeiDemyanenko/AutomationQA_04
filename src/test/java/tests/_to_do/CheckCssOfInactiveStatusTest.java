package tests._to_do;

import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.start.StartPage;
import runner.BaseTest;

public class CheckCssOfInactiveStatusTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testCssOfInactiveStatus(){

        String expectedResult = "#ff0000";

        getDriver().get(BASE_URL);

        StartPage SP = new StartPage(getDriver());

        SP.clickTeamSubmenu();

        String color = getDriver().findElement(
                By.xpath("//div[@id='main']/p[7]/font")).getCssValue("color"
        );

        String actualResult = Color.fromString(color).asHex();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
