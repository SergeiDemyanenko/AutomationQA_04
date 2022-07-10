package tests._to_do;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;

import java.util.List;

public class BrowseLanguagesAllCategoriesOfSubmenuTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testAllCategoriesOfSubmenuBrowseLanguages() {

        final String expectedResult = "0-9ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        StringBuilder actualResult = new StringBuilder();

        List<WebElement> liAll = getDriver()
                .findElements(By.xpath("//ul[@id='submenu']/li"));
        for (WebElement li : liAll) {
            actualResult.append(li.getText());
        }

        Assert.assertEquals(actualResult.toString(), expectedResult);
    }
}
