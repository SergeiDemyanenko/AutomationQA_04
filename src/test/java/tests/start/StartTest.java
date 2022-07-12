package tests.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class StartTest extends BaseTest {

    @Test
    public void testInfoSubmenuText() {
        String expectedInfoSubmenuText = "History";

        String actualInfoSubmenuText = openBaseURL()
                .getText(openBaseURL()
                        .clickStartMenu()
                        .getInfoSubmenu());

        Assert.assertEquals(actualInfoSubmenuText, expectedInfoSubmenuText);
    }

    @Test
    public void testInfoSubmenuLinkText() {
        String expectedInfoSubmenuLinkText = "http://www.99-bottles-of-beer.net/info.html";

        String actualInfoSubmenuLinkText = openBaseURL()
                .clickStartMenu()
                .getInfoSubmenu()
                .getAttribute("href");

        Assert.assertEquals(actualInfoSubmenuLinkText, expectedInfoSubmenuLinkText);
    }

    @Test
    public void testH2Header() {

        String expectedH2Header = "Welcome to 99 Bottles of Beer";

        String actualH2Header = openBaseURL()
                .clickStartMenu()
                .getH2HeaderMainText();

        Assert.assertEquals(actualH2Header, expectedH2Header);
    }
}
