package tests._to_do;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import pages.browse_languages.AbcPage;
import pages.browse_languages.letters.CPage;
import pages.start.StartPage;
import pages.start.TeamPage;
import pages.top_lists.TopListAssemblyPage;
import pages.top_lists.TopListPage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class OlgaSafMenuStartPageTest extends BaseTest {

    private static final String URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testTopRatedAssemblyLanguagesText() {

            String expectedResult = "Top Rated Assembly Languages";

            getDriver().get(URL);

            MainPage main = new MainPage(getDriver());
            main.clickTopListMenu();

            TopListPage topListPage = new TopListPage(getDriver());
            topListPage.clickTopListAssemblySubmenu();

            TopListAssemblyPage topListAssembly = new TopListAssemblyPage(getDriver());

            String actualResult = topListAssembly.getH2TableAssemblyName();

            Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testVerifyTableHeaderIs() {

        List<String> expectedResult = new ArrayList<>();

        expectedResult.add("Language");
        expectedResult.add("Author");
        expectedResult.add("Date");
        expectedResult.add("Comments");
        expectedResult.add("Rate");

        getDriver().get(URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        List<WebElement> tableHeader = getDriver().findElements(By.xpath("//tbody/tr[1]/th"));


        List<String> actualResult = new ArrayList<>();

        for (WebElement name: tableHeader) {
            actualResult.add(name.getText());
        }

        Assert.assertEquals(actualResult, expectedResult);
    }
}
