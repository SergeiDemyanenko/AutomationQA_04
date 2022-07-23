package tests.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.languages.LanguagesPage;
import runner.BaseTest;

public class Algol601367Test extends BaseTest {
    @Test
    public void testLanguageAlgol601367() {

                openBaseURL()
                .clickBrowseLanguagesMenu().clickASubmenu().clickLanguage("Algol60");


        LanguagesPage al601367 = new LanguagesPage(getDriver());
        String algol601367Title = al601367.getH2VotingText();

        Assert.assertNotEquals(algol601367Title, getExternalPageURL());
    }
}
