package tests.browse_languages.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import static runner.TestUtils.getTrWithRequiredLanguage;

public class LanguageAlgol601367Test extends BaseTest {
    @Test
    public void testLanguageAlgol601367() {
        String languageName = "Algol60";

        String expectedLanguageAlgol601367 = getTrWithRequiredLanguage(languageName);

        String actualLanguageAlgol601367 = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickJSubmenu()
                .getTrText(languageName);

        Assert.assertEquals(actualLanguageAlgol601367, expectedLanguageAlgol601367);
    }
}
