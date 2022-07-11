package tests._to_do;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.browse_languages.letters.KPage;
import pages.MainPage;
import runner.BaseTest;
import java.util.List;

public class KononirinIrinaShTest extends BaseTest {

    @Test
    public void testSubmitNewLanguageMenuText() {

        final String expectedResult = "Submit new Language".toLowerCase();

        String actualResult = openBaseURL().
                getSubmitNewLanguageMenuText().
                toLowerCase();

        Assert.assertEquals(actualResult, expectedResult);
    }
}