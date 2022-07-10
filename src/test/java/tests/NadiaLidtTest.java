package tests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.letters.RPage;
import pages.start.StartPage;
import runner.BaseTest;
import java.util.ArrayList;
import java.util.List;

public class NadiaLidtTest extends BaseTest {

    @Test
    public void testTitleSearchLenguages () {
        final String expectedTitleSearchLenguages = "Search Languages";

        String actualTitleSearchLenguages =
                openBaseURL()
                        .clickSearchMenu()
                        .clickSearchSubmenu()
                        .getH2MainText();

        Assert.assertEquals(actualTitleSearchLenguages, expectedTitleSearchLenguages);
    }

    @Test (description = "TC_700.003")
    public void testErrorMessageSubmitLanguageButton() {
        final String expectedResultErrorMessageSubmitLanguageButtonError = "Error";
        final String expectedResultErrorMessageSubmitLanguageButtonPrecondition = "Precondition";
        final String expectedResultErrorMessageSubmitLanguageButtonIncomplete = "Incomplete";
        final String expectedResultErrorMessageSubmitLanguageButtonInput = "Input";
        final String expectedResultErrorMessageSubmitLanguageButtonFailed  = "failed";
        final String expectedResultErrorMessageSubmitLanguageButton1 = ":";
        final String expectedResultErrorMessageSubmitLanguageButton2 = "-";
        final String expectedResultErrorMessageSubmitLanguageButton3 = ".";



        String actualErrorMessageSubmitLanguageButtonError =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(0,5);
        String actualErrorMessageSubmitLanguageButtonPrecondition =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(7,19);
        String actualErrorMessageSubmitLanguageButtonIncomplete =
                openBaseURL()
                        .clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(29,39);
        String actualErrorMessageSubmitLanguageButtonInput =
                openBaseURL().clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(40,45);
        String actualErrorMessageSubmitLanguageButtonFailed =
                openBaseURL().clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(20,26);
        String actualErrorMessageSubmitLanguageButton1 =
                openBaseURL().clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(5,6);
        String actualErrorMessageSubmitLanguageButton2 =
                openBaseURL().clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(27,28);
        String actualErrorMessageSubmitLanguageButton3 =
                openBaseURL().clickSubmitNewLanguageMenu()
                        .clickButtonSubmitLanguage()
                        .getErrorMessageText()
                        .substring(45);

        Assert.assertEquals(actualErrorMessageSubmitLanguageButtonError,
                expectedResultErrorMessageSubmitLanguageButtonError);
        Assert.assertEquals(actualErrorMessageSubmitLanguageButtonPrecondition,
                expectedResultErrorMessageSubmitLanguageButtonPrecondition);
        Assert.assertEquals(actualErrorMessageSubmitLanguageButtonIncomplete,
                expectedResultErrorMessageSubmitLanguageButtonIncomplete);
        Assert.assertEquals(actualErrorMessageSubmitLanguageButtonInput,
                expectedResultErrorMessageSubmitLanguageButtonInput);
        Assert.assertEquals(actualErrorMessageSubmitLanguageButtonFailed,
                expectedResultErrorMessageSubmitLanguageButtonFailed);
        Assert.assertEquals(actualErrorMessageSubmitLanguageButton1,
                expectedResultErrorMessageSubmitLanguageButton1);
        Assert.assertEquals(actualErrorMessageSubmitLanguageButton2,
                expectedResultErrorMessageSubmitLanguageButton2);
        Assert.assertEquals(actualErrorMessageSubmitLanguageButton3,
                expectedResultErrorMessageSubmitLanguageButton3);
    }

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

    @Test
    public void testTableTitleMenuBrowseLanguages() {
        String expectedTableTitleMenuBrowseLanguages = "Language, Author, Date, Comments, Rate" ;

        String actualTableTitleMenuBrowseLanguages =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .getTitlesTable();

        Assert.assertEquals(actualTableTitleMenuBrowseLanguages, expectedTableTitleMenuBrowseLanguages);
    }

    @Test
    public void testTextInfoSubmenu() {
        String expectedTextInfoSubmenu = "History";

        String actualTextInfoSubmenu = openBaseURL()
                .getText(openBaseURL()
                        .clickStartMenu()
                        .getInfoSubmenu());

        Assert.assertEquals(actualTextInfoSubmenu, expectedTextInfoSubmenu);
    }

    @Test
    public void testLinkTextInfoSubmenu() {
        String expectedLinkTextInfoSubmenu = "http://www.99-bottles-of-beer.net/info.html";

        String actualLinkTextInfoSubmenu = openBaseURL()
                .clickStartMenu()
                .getInfoSubmenu()
                .getAttribute("href");
        System.out.println(actualLinkTextInfoSubmenu);

        Assert.assertEquals(actualLinkTextInfoSubmenu, expectedLinkTextInfoSubmenu);
    }

    @Test
    public void testNavigationInfoSubmenu() {
        String expectedNavigationInfoSubmenu = "History";

        String actualNavigationInfoSubmenu = openBaseURL()
                .clickStartMenu()
                .clickInfoSubmenu()
                .getH2HeaderText();

        Assert.assertEquals(actualNavigationInfoSubmenu, expectedNavigationInfoSubmenu);
    }

    @Test
    public void testTextH2MainHeader() {
        String expectedTextH2MainHeader = "The Team";

        StartPage startPage = new StartPage(getDriver());

        String actualTextH2MainHeader = openBaseURL()
                .clickStartMenu()
                .clickTeamSubmenu()
                .getH2MainHeaderText();

        Assert.assertEquals(expectedTextH2MainHeader, actualTextH2MainHeader);
    }
}
