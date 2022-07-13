package tests.browse_languages.letters;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.browse_languages.AbcPage;
import runner.BaseTest;

import static runner.TestUtils.getTrWithRequiredLanguage;

public class ATest extends BaseTest {

    @Test
    public void testASubmenuTitle()  {
        String expectedASubmenuTitle = "A";

        String actualASubmenuTitle =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .getASubmenu()
                        .getText();

        Assert.assertEquals(actualASubmenuTitle, expectedASubmenuTitle);
    }

    @Test
    public void testVerifyLanguageAlgol60() {
        String languageName = "Algol60";

        String expectedResult = getTrWithRequiredLanguage(languageName);

        String actualResult = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickJSubmenu()
                .getTrText(languageName);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
