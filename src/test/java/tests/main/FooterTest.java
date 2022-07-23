package tests.main;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import runner.BaseTest;
import tests.TestData;

import java.util.List;

public class FooterTest extends BaseTest {

    @Test(
            priority = 1
    )
    public void testFootersCount() {
        int expectedFooterCount = 6;

        int actualFooterCount = openBaseURL().getFooterAll().size();

        Assert.assertEquals(actualFooterCount, expectedFooterCount, ">>>Expected Footer Count = 6, but getting failure<<<");
    }

    @Test(
            priority = 2,
            dependsOnMethods = "testFootersCount",
            dataProviderClass = TestData.class,
            dataProvider = "MainPageTestData"
    )
    public void testFootersTextsAndLinks(int index, String footerName, String footerLink, String footerTitle) {
        MainPage main = openBaseURL();
        List<WebElement> footers = main.getFooterAll();
        String footerText = main.getText(footers.get(index));
        List<String> footersLinks = main.getLinks(footers);

        Assert.assertEquals(footerText, footerName);
        Assert.assertEquals(footersLinks.get(index), footerLink);
    }

    @Test(
            priority = 3
    )
    public void testFooterMenuBarMainPage() {

        String expectedFooterMenuBar = "Start | Browse Languages | Search Languages | Top Lists | Guestbook | Submit new Language";

        String actualFooterMenuBar = openBaseURL().getFooterBarText();

        Assert.assertEquals(actualFooterMenuBar, expectedFooterMenuBar);
    }
}
