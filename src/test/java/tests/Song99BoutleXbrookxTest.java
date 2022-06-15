package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;
import java.util.List;

public class Song99BoutleXbrookxTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testConfirmTableWithHeaders() {
        String expectedResult = "Language Author Date Comments Rate";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.getBrowseLanguagesMenuClick();

        List<WebElement> list = getDriver().findElements(By.xpath("//div[@id='main']//th"));

        StringBuilder headers = new StringBuilder();
        for (WebElement web : list) {
            headers.append(web.getText()).append(" ");
        }

        Assert.assertEquals(headers.toString().trim(), expectedResult);
    }
}
