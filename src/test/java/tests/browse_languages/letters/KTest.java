package tests.browse_languages.letters;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class KTest extends BaseTest {

    @Test
    public void testH2HeaderKPage() {

        final String expectedH2Header = "Category K";

        String actualH2Header = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickKSubmenu()
                .getH2MainText();

        Assert.assertEquals(actualH2Header, expectedH2Header);
    }

    @Test
    public void testCountOfLanguagesFromK() {

        final int expectedResult = 17;

        int actualResult = openBaseURL().
                clickBrowseLanguagesMenu().
                clickKSubmenu().
                getNumberOfLanguages();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
