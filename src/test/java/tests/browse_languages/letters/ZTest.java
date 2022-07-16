package tests.browse_languages.letters;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class ZTest extends BaseTest {

    @Test
    public void testH2Header() {

        final String expectedResult = "Category Z";

        String actualResult = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickZSubmenu()
                .getH2Main()
                .getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDescription() {

        final String expectedResult =
                "All languages starting with the letter Z are shown, sorted by Language.";
        String actualResult = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickZSubmenu()
                .getTextPTag();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testHeadersOfTable() {

        final String expectedResult = "Language Author Date Comments Rate";
        String actualResult = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickZSubmenu()
                .getTextStringThTags();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOfLanguageZ() {

        final int expectedResultCount = 14;
        int actualResultCount = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickZSubmenu()
                .getTDLanguageNames().size();

        Assert.assertEquals(actualResultCount, expectedResultCount);
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
        final String expectedResultallNamesZ = allNamesZ.toString();
        String actualResultallNamesZ = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickZSubmenu()
                .getNamesText();

        Assert.assertEquals(actualResultallNamesZ, expectedResultallNamesZ);
    }

    @Test
    public void testRandomNameBeforeAndAfterClicking() {

        WebElement identicalRandomNameOfZ = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickZSubmenu().getRandomNameOfZ();

        final String expectedResult = "Language "
                .concat(identicalRandomNameOfZ.getText());

        identicalRandomNameOfZ.click();

//        LanguagesBeginWithZPage h2Header = new LanguagesBeginWithZPage(getDriver());
//        String actualResult = h2Header.getH2Text();
//
//        Assert.assertEquals(actualResult, expectedResult);
    }
}
