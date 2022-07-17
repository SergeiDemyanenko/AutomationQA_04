package tests.browse_languages.letters;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.letters.JPage;
import runner.BaseTest;
import java.util.List;
import static runner.TestUtils.getTrWithRequiredLanguage;

public class JTest extends BaseTest {

    @Test
    public void testH2HeaderAndPTagText() {
        final List<String> expectedH2HeaderAndPTagText = List.of(
                "Category J",
                "All languages starting with the letter J are shown, sorted by Language."
        );

        List<String> actualH2HeaderAndPTagText =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickJSubmenu()
                        .getH2MainAndPTagText();

        Assert.assertEquals(actualH2HeaderAndPTagText, expectedH2HeaderAndPTagText);
    }

    @Test
    public void testTableHeaderText() {
        final String expectedTableHeaderText = "Language Author Date Comments Rate";

        String actualTableHeaderText =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickJSubmenu()
                        .getTextStringThTags();

        Assert.assertEquals(actualTableHeaderText, expectedTableHeaderText);
    }

    @Test
    public void testHowManyLanguagesOnJPage() {
        final int expectedQuantity = 22;

        int actualQuantity =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickJSubmenu()
                        .getCountTDLinks();

        Assert.assertEquals(actualQuantity, expectedQuantity);
    }

    @Test
    public void testAreAllLanguagesOnJPageStartWithTheLetterJ() {
        String expectedFirstLetter = "J";

        JPage j =
                openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickJSubmenu();

        for (String a : j.getListStringTDLinks()) {

            Assert.assertTrue(a
                    .toLowerCase()
                    .substring(0, 1)
                    .contains(expectedFirstLetter.toLowerCase()));
        }
    }

    @Test
    public void testLinkInTableIsClickable() {

        String oldUrl =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickJSubmenu()
                        .getDriver()
                        .getCurrentUrl();

        JPage j = new JPage(getDriver());

        j.getRandomTdLink().click();

        String newUrl = getDriver().getCurrentUrl();

        Assert.assertNotEquals(newUrl, oldUrl);
    }

    @Test
    public void testAuthorDataCommentsForRequiredLanguage() {
        final String languageName = "Joy";

        String expectedTrWithRequiredLanguage = getTrWithRequiredLanguage(languageName);

        String actualTrWithRequiredLanguage =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickJSubmenu()
                        .getTrText(languageName);

        Assert.assertEquals(actualTrWithRequiredLanguage, expectedTrWithRequiredLanguage);
    }

    @Test
    public void testRandomTrIsDisplayedIsEnabledNotEmpty() {
        JPage j =
                openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickJSubmenu();

        Assert.assertTrue(j.getRandomTr().isDisplayed());
        Assert.assertTrue(j.getRandomTr().isEnabled());
        Assert.assertFalse(j.getRandomTr().getText().isEmpty());
    }

    @Test
    public void testIsBrowseLanguagesSubMenuJ() {
        final String expectedResult = "All languages starting with the letter J are shown, sorted by Language.";

        String actualResult =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickJSubmenu()
                        .getTextPTag();

        Assert.assertEquals(actualResult, expectedResult);
    }
}