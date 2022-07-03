package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LPage;
import pages.MainPage;
import runner.BaseTest;

public class CheckDownloadText extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net";

    @Test
    public void testDownloadSourceLanguageL33t() {

        getDriver().get(BASE_URL);

        MainPage MP = new MainPage(getDriver());

        MP.clickBrowseLanguagesMenu();

        LPage LP = new LPage(getDriver());

        LP.clickLSubmenu();

        LP.clickLanguageL33t();

        Assert.assertEquals(
                getDriver().findElement(By.xpath("//p[@style='border: 1px solid #1b651c; background-color: #ffffee; padding: " +
                        "5px; margin: 5px 10px 5px 10px; text-align:center;']/a[@href='/download/963']")).getText(),
                "Download Source"
        );
    }
}
