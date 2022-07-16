package tests.browse_languages.letters;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.letters.RPage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class RTest extends BaseTest {

    @Test(description = "[US][Browse Language][R Page]")
    public void testInformationAboutLanguageRPGIVFreeForm() {
        String languageExpected = "RPG IV Free-Form";
        String authorExpected = "James Wall";
        String dateExpected = "01/10/06";
        String commentsExpected = "3";
        List<String> actualInformationAboutLanguageRPGIVFreeForm = new ArrayList<>();

        StringBuilder expectedInformationAboutLanguageRPGIVFreeForm = new StringBuilder();

        expectedInformationAboutLanguageRPGIVFreeForm
                .append(languageExpected)
                .append(" ")
                .append(authorExpected)
                .append(" ")
                .append(dateExpected)
                .append(" ")
                .append(commentsExpected);

        RPage rPage = openBaseURL().clickBrowseLanguagesMenu().clickRSubmenu();

        for (WebElement tr : rPage.getTrTags()) {
            if (tr.getText().contains(languageExpected)) {
                actualInformationAboutLanguageRPGIVFreeForm.add(tr.getText());
            }
        }

        Assert.assertEquals(actualInformationAboutLanguageRPGIVFreeForm.size(), 1);
        Assert.assertTrue(!actualInformationAboutLanguageRPGIVFreeForm.get(0).isEmpty());
        Assert.assertEquals(actualInformationAboutLanguageRPGIVFreeForm.get(0)
                , expectedInformationAboutLanguageRPGIVFreeForm.toString());
    }

    @Test
    public void testHowManyLanguagesOnPageR() {
        final int expectedQuantity = 44;

        int actualQuantity =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickRSubmenu()
                        .getCountTrTags();

        Assert.assertEquals(actualQuantity, expectedQuantity);
    }

    @Test
    public void testH2HeaderOnPageR() {
        final String expectedHeader = "Category R";

        String actualHeader =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickRSubmenu()
                        .getH2MainText();

        Assert.assertEquals(actualHeader, expectedHeader);
    }

    @Test
    public void testPTagTextOnPageR() {
        final String expectedText = "All languages starting with the letter R are shown, sorted by Language.";

        String actualText =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickRSubmenu()
                        .getTextPTag();

        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void testTableHeaderTextOnPageR() {

        final List<String> expectedTableHeader = new ArrayList<>();

        expectedTableHeader.add("Language");
        expectedTableHeader.add("Author");
        expectedTableHeader.add("Date");
        expectedTableHeader.add("Comments");
        expectedTableHeader.add("Rate");

        List<String> actualTableHeader =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickRSubmenu()
                        .getTextListThTags();

        Assert.assertEquals(actualTableHeader, expectedTableHeader);
    }
}