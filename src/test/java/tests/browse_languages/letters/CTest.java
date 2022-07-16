package tests.browse_languages.letters;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class CTest extends BaseTest {

    @Test
    public void testCSubMenu() {

        String expectedCSubMenu = "C";

        String actualCSubMenu =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .getCSubmenuText();

        Assert.assertEquals(actualCSubMenu, expectedCSubMenu);
    }

    @Test
    public void testCPageTitle(){

        String expectedCPageTitle = "Category C";

        String actualCPageTitle =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickCSubmenu()
                        .getH2MainText();

        Assert.assertEquals(actualCPageTitle, expectedCPageTitle);
    }
}
