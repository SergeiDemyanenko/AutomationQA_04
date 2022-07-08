package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.top_lists.TopListPage;
import pages.top_lists.TopListRealPage;
import runner.BaseTest;

public class ServachakMariaTopListRealTest extends BaseTest {
    private static final String URL = "https://www.99-bottles-of-beer.net/";

    @Test
    public void testVerifyH2Header(){
        String expectedResultText = "Top Rated Real Languages";
        String expectedResultColor = "rgba(27, 101, 28, 1)";

        MainPage main = new MainPage(getDriver());
        TopListPage topList = new TopListPage(getDriver());
        TopListRealPage realPage = new TopListRealPage(getDriver());

        getDriver().get(URL);
        main.clickTopListMenu();
        topList.clickTopListRealSubmenu();

        String actualResultText = realPage.getTextH2Header().trim();
        String actualResultColor = realPage.getH2Header().getCssValue("color");

        Assert.assertEquals(actualResultText,expectedResultText);
        Assert.assertEquals(actualResultColor,expectedResultColor);
    }
}