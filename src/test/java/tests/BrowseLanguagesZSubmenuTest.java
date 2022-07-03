package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.MainPage;
import pages.browse_languages.letters.ZPage;
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

    @Test
    public void testZSubmenuHeadersOfTable() {

        final String expectedResult = "Language Author Date Comments Rate";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());
        abc.clickZSubmenu();

        ZPage zSubmenuHeaders = new ZPage(getDriver());
        String actualResult = zSubmenuHeaders.getCategoryText();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testNamesOfLanguageZ() {

        final String expectedResult =
                "Z-C\n" +
                "Z-Shell\n" +
                "Zeno\n" +
                "Zero\n" +
                "Zim\n" +
                "zkl\n" +
                "zmud scripting language\n" +
                "ZOMBIE\n" +
                "Zonnon\n" +
                "Zope-DHTML\n" +
                "Zope-PageTemplates\n" +
                "Zowie\n" +
                "ZT\n" +
                "ZZT";

        final int expectedResultCount = 14;

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());
        abc.clickZSubmenu();

        ZPage zSubmenuHeaders = new ZPage(getDriver());
        String actualResult = zSubmenuHeaders.getNamesText();
        int actualResultCount = zSubmenuHeaders.getNamesOfLanguageZ().size();

        Assert.assertEquals(actualResult,expectedResult);
        Assert.assertEquals(actualResultCount,expectedResultCount);
    }
}
