package tests._to_do;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.MainPage;
import pages.browse_languages.languages.LanguagesBeginWithZ;
import pages.browse_languages.letters.ZPage;
import runner.BaseTest;

public class BrowseLanguagesZSubmenuTest extends BaseTest {

    protected void clickNowZSubmenu() {
        openBaseURL()
                .clickBrowseLanguagesMenu()
                        .clickZSubmenu();
    }

    @Test
    public void testCheckingRandomLanguage() {

        LanguagesBeginWithZ h2Header = new LanguagesBeginWithZ(getDriver());

        WebElement identicalRandomNameOfZ;
        identicalRandomNameOfZ = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickZSubmenu()
                .getRandomNameOfZ();

        final String expectedResult = "Language "
                .concat(identicalRandomNameOfZ.getText());

        identicalRandomNameOfZ.click();

        String actualResult = h2Header.getH2Text();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
