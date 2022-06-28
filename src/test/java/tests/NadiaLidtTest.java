package tests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class NadiaLidtTest extends BaseTest {

    private static final String BASE_URL = "https://99-bottles-of-beer.net/";

    @Test
    public void testTitleSearchLenguages () {
        String expectedResult = "Search Languages";

        getDriver().get(BASE_URL);

        SearchPage search = new SearchPage(getDriver());

        search.clickSearchMenu();

        search.clickSearchSubmenu();

        String actualResult = search.getH2MainText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test (description = "TC_700.003")
    public void testSpellingErrorMessageSubmitLanguageButton() {
        String expectedResultError = "Error";
        String expectedResultPrecondition = "Precondition";
        String expectedResultIncomplete = "Incomplete";
        String expectedResultInput = "Input";
        String expectedResultFailed  = "failed";
        String expectedResult1 = ":";
        String expectedResult2 = "-";
        String expectedResult3 = ".";

        getDriver().get(BASE_URL);

        MainPage menuSubmitNewLanguagePage = new MainPage(getDriver());
        SubmitNewLanguagePage errorMessage = new SubmitNewLanguagePage(getDriver());

        menuSubmitNewLanguagePage.clickSubmitNewLanguageMenu();

        errorMessage.clickButtonSubmitLanguage();

        String actualdResultError = errorMessage.getErrorMessageText().substring(0,5);
        String actualdResultPrecondition = errorMessage.getErrorMessageText().substring(7,19);
        String actualdResultIncomplete = errorMessage.getErrorMessageText().substring(29,39);
        String actualdResultInput = errorMessage.getErrorMessageText().substring(40,45);
        String actualdResultFailed = errorMessage.getErrorMessageText().substring(20,26);
        String actualdResult1 = errorMessage.getErrorMessageText().substring(5,6);
        String actualdResult2 = errorMessage.getErrorMessageText().substring(27,28);
        String actualdResult3 = errorMessage.getErrorMessageText().substring(45);

        Assert.assertEquals(actualdResultError, expectedResultError);
        Assert.assertEquals(actualdResultPrecondition, expectedResultPrecondition);
        Assert.assertEquals(actualdResultIncomplete, expectedResultIncomplete);
        Assert.assertEquals(actualdResultInput, expectedResultInput);
        Assert.assertEquals(actualdResultFailed, expectedResultFailed);
        Assert.assertEquals(actualdResult1, expectedResult1);
        Assert.assertEquals(actualdResult2, expectedResult2);
        Assert.assertEquals(actualdResult3, expectedResult3);
    }

    @Test (description = "[US][Browse Language][R Page]")
    public void testVerifyInformationAboutLanguageRPGIVFreeForm(){
        String languageExpected = "RPG IV Free-Form";
        String authorExpected = "James Wall";
        String dateExpected = "01/10/06";
        String commentsExpected = "3";
        List<String> actualResult = new ArrayList<>();

        StringBuilder expectedResult = new StringBuilder();

        expectedResult
                .append(languageExpected)
                .append(" ")
                .append(authorExpected)
                .append(" ")
                .append(dateExpected)
                .append(" ")
                .append(commentsExpected);

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        RPage rPage = new RPage(getDriver());

        main.clickBrowseLanguagesMenu();
        abc.clickRSubmenu();

        for (WebElement tr : rPage.getTRTags()) {
            if (tr.getText().contains(languageExpected)) {
                actualResult.add(tr.getText());
            }
        }

        Assert.assertEquals(actualResult.size(), 1);
        Assert.assertTrue(!actualResult.get(0).isEmpty());
        Assert.assertEquals(actualResult.get(0),expectedResult.toString());
    }

    @Test
    public void testCheckTableTitleMenuBrowseLanguages() {
        String expectedResult = "Language, Author, Date, Comments, Rate" ;
        String actualResult;

        getDriver().get(BASE_URL);

        MainPage menuBrowseLanguages = new MainPage(getDriver());
        AbcPage titleTable = new AbcPage(getDriver());

        menuBrowseLanguages.clickBrowseLanguagesMenu();
        actualResult = titleTable.getTitlesTable();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
