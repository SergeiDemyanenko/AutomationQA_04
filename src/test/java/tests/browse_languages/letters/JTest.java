package tests.browse_languages.letters;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.letters.JPage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class JTest extends BaseTest {

    @Test
    public void testH2HeaderAndPTagText() {

        List<String> expectedH2HeaderAndPTagText = new ArrayList<>();
        expectedH2HeaderAndPTagText.add("Category J");
        expectedH2HeaderAndPTagText.add("All languages starting with the " +
                "letter J are shown, sorted by Language.");

        List<String> actualH2HeaderAndPTagText =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickJSubmenu()
                        .getH2HeaderAndPTagText();

        Assert.assertEquals(actualH2HeaderAndPTagText, expectedH2HeaderAndPTagText);
    }

    @Test
    public void testTableHeaderText() {

        String expectedTableHeaderText = "Language Author Date Comments Rate";

        String actualTableHeaderText =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickJSubmenu()
                        .getStringTextThTags()
                        .trim();

        Assert.assertEquals(actualTableHeaderText, expectedTableHeaderText);
    }

    @Test
    public void testHowManyLanguagesOnJPage() {
        int expectedQuantity = 22;

        int actualQuantity =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickJSubmenu()
                        .getQuantityTDLinks();

        Assert.assertEquals(actualQuantity, expectedQuantity);
    }

    @Test
    public void testAreAllLanguagesOnJPageStartWithTheLetterJ() {
        String expectedFirstLetter = "j";

        JPage j = new JPage(getDriver());

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
}