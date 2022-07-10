package tests._to_do;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;
import java.util.ArrayList;
import java.util.List;

public class Song99BottlesElenaNov686Test extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/lyrics.html";
    private String actualResult;
    private String expectedResult;


    @Test //TC_12_04
    public void testMathematicaBrentonDataComment() {
        String languageExpected = "Mathematica";
        String authorExpected = "Brenton Bostick";
        String dataExpected = "03/16/06";
        String commentsExpected = "1";

        StringBuilder expectedResult = new StringBuilder();
        expectedResult
                .append(languageExpected)
                .append(" ")
                .append(authorExpected)
                .append(" ")
                .append(dataExpected)
                .append(" ")
                .append(commentsExpected);


        getDriver().get(BASE_URL);
        getDriver().findElement(By.linkText("Browse Languages")).click();
        getDriver().findElement(By.linkText("M")).click();

        List<WebElement> trs = getDriver().findElements(By.xpath("//table[@id='category']/tbody/tr"));
        List<String> actualResult = new ArrayList<>();

        for (WebElement tr : trs) {
            if (tr.getText().contains(languageExpected)) {
                actualResult.add(tr.getText());
            }
        }

        Assert.assertEquals(actualResult.size(), 1);
        Assert.assertFalse(actualResult.get(0).isEmpty());
        Assert.assertEquals(actualResult.get(0), expectedResult.toString());

    }

    @Test//TC_12_02
    public void testBrowseLanguagesLetterM_MySQL() {
        String expectedResult = "MySQL";

        getDriver().get(BASE_URL);
        getDriver().findElement(By.linkText("Browse Languages")).click();
        getDriver().findElement(By.linkText("M")).click();

        String actualResult = getDriver().findElement(By.linkText("MySQL")).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}

