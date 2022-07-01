package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.MainPage;
import pages.ZPage;
import runner.BaseTest;

public class BrowseLanguagesZSubmenuTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test

    public void testZSubmenuH2Header() {

        final String expectedResult = "Category Z";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());
        abc.clickZSubmenu();

        ZPage zSubmenu = new ZPage(getDriver());
        String actualResult = zSubmenu.getH2Text();

        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testZSubmenuDescription() {

        final String expectedResult = "All languages starting with the letter" +
                " Z are shown, sorted by Language.";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());
        abc.clickZSubmenu();

        ZPage zSubmenu = new ZPage(getDriver());
        String actualResult = zSubmenu.getPTagsText();

        Assert.assertEquals(actualResult,expectedResult);
    }

}
