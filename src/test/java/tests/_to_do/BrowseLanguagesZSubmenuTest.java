package tests._to_do;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.MainPage;
import pages.browse_languages.languages.LanguagesBeginWithZPage;
import pages.browse_languages.letters.ZPage;
import runner.BaseTest;

public class BrowseLanguagesZSubmenuTest extends BaseTest {

    protected void clickZSubmenu() {

        getDriver().get("http://www.99-bottles-of-beer.net/");

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());
        abc.clickZSubmenu();
    }

    @Test

    public void testZSubmenuH2Header() {

        final String expectedResult = "Category Z";

        clickZSubmenu();

        ZPage zSubmenu = new ZPage(getDriver());
        String actualResult = zSubmenu.getH2Text();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testZSubmenuDescription() {

        final String expectedResult =
        "All languages starting with the letter Z are shown, sorted by Language.";

        clickZSubmenu();

        ZPage zSubmenu = new ZPage(getDriver());
        String actualResult = zSubmenu.getPTagsText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testZSubmenuHeadersOfTable() {

        final String expectedResult = "Language Author Date Comments Rate";

        clickZSubmenu();

        ZPage zSubmenuHeaders = new ZPage(getDriver());
        String actualResult = zSubmenuHeaders.getCategoryText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNamesOfLanguageZ() {

        StringBuilder allNamesZ = new StringBuilder();
        allNamesZ
                .append("Z-C\n")
                .append("Z-Shell\n")
                .append("Zeno\n")
                .append("Zero\n")
                .append("Zim\n")
                .append("zkl\n")
                .append("zmud scripting language\n")
                .append("ZOMBIE\n")
                .append("Zonnon\n")
                .append("Zope-DHTML\n")
                .append("Zope-PageTemplates\n")
                .append("Zowie\n")
                .append("ZT\n")
                .append("ZZT");
        final String expectedResult = allNamesZ.toString();

        final int expectedResultCount = 14;

        clickZSubmenu();

        ZPage zSubmenuHeaders = new ZPage(getDriver());
        String actualResult = zSubmenuHeaders.getNamesText();
        int actualResultCount = zSubmenuHeaders.getNamesOfLanguageZ().size();

        Assert.assertEquals(actualResultCount, expectedResultCount);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckingRandomLanguage() {

        ZPage languageZ = new ZPage(getDriver());
        LanguagesBeginWithZPage h2Header = new LanguagesBeginWithZPage(getDriver());

        clickZSubmenu();

        WebElement identicalRandomNameOfZ = languageZ.getRandomNameOfZ();

        final String expectedResult = "Language "
                .concat(identicalRandomNameOfZ.getText());

        identicalRandomNameOfZ.click();

        String actualResult = h2Header.getH2Text();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
