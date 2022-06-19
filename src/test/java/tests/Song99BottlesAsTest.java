package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SubmitNewLanguagePage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class Song99BottlesAsTest extends BaseTest {

    private static final String URL = "http://www.99-bottles-of-beer.net/lyrics.html";

    @Test
    public void testiIncludesNewLanguageCategoryTest() {

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("real language");
        expectedResult.add("esoteric language");
        expectedResult.add("assembly language");

        getDriver().get(URL);
        MainPage main = new MainPage(getDriver());
        main.getSubmitNewLanguageMenu().click();
        SubmitNewLanguagePage category = new SubmitNewLanguagePage(getDriver());
        category.getField_CategoryClick();
        SubmitNewLanguagePage click = new SubmitNewLanguagePage(getDriver());
        click.getField_CategoryClick();

        List<WebElement> name = getDriver().findElements(By.xpath("//select[@name='category']/option"));
        List<String> actualyResalt = new ArrayList<>();
        for (WebElement dropDown : name) {
            actualyResalt.add(dropDown.getText());
        }

        Assert.assertEquals(actualyResalt,expectedResult);
    }
}
