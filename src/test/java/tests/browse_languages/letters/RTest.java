package tests.browse_languages.letters;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.letters.RPage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class RTest extends BaseTest {

    @Test (description = "[US][Browse Language][R Page]")
    public void testInformationAboutLanguageRPGIVFreeForm(){
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

        for (WebElement tr : rPage.getAllTR()) {
            if (tr.getText().contains(languageExpected)) {
                actualInformationAboutLanguageRPGIVFreeForm.add(tr.getText());
            }
        }

        Assert.assertEquals(actualInformationAboutLanguageRPGIVFreeForm.size(), 1);
        Assert.assertTrue(!actualInformationAboutLanguageRPGIVFreeForm.get(0).isEmpty());
        Assert.assertEquals(actualInformationAboutLanguageRPGIVFreeForm.get(0)
                ,expectedInformationAboutLanguageRPGIVFreeForm.toString());
    }
}
