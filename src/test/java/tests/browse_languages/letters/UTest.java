package tests.browse_languages.letters;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class UTest extends BaseTest {

    @Test
    public void testSubMenuCategoryU(){
       final String expectedSubMenuCategoryU = "U";

       String actualSubMenuCategoryU = openBaseURL()
               .clickBrowseLanguagesMenu()
               .getUSubmenuText();

        Assert.assertEquals(actualSubMenuCategoryU,expectedSubMenuCategoryU);
    }

    @Test
    public void testNumberLanguagesU() {
        final int expectedNumberLanguagesU = 25;

        int actualNumberLanguagesU = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickUSubmenu()
                .getCountTrTags();

        Assert.assertEquals(actualNumberLanguagesU, expectedNumberLanguagesU);
    }
}
