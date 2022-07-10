package tests.start;

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

}
