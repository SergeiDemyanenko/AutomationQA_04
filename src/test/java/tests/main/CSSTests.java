package tests.main;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class CSSTests extends BaseTest {

    @Test
    public void checkAuthorOfMathematicaLanguageTest (){
        final String expectedResult = "Brenton Bostick";

        String actualResult =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickMSubmenu()
                        .clickMathematicaPage()
                        .getTdTableBrentonBostick()
                        .getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
