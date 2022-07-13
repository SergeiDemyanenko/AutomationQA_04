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
                        .getCSubmenu()
                        .getText();

        Assert.assertEquals(actualCSubMenu, expectedCSubMenu);
    }

    @Test
    public void testCPageTitle(){

        String expectedCPageTitle = "Category C";

        String actualCPageTitle =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickCSubmenu()
                        .getH2HeaderText();

        Assert.assertEquals(actualCPageTitle, expectedCPageTitle);
    }
}
