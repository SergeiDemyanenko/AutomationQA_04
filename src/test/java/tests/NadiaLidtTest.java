package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbcPage;
import pages.MainPage;
import pages.SearchPage;
import pages.SubmitNewLanguagePage;
import runner.BaseTest;

public class NadiaLidtTest extends BaseTest {

    private static final String BASE_URL = "https://99-bottles-of-beer.net/";

    @Test
    public void testTitleSearchLenguages () {
        String expectedResult = "Search Languages";

        getDriver().get(BASE_URL);

        SearchPage search = new SearchPage(getDriver());

        search.getSearchMenuClick();

        search.getSearchSubmenuClick();

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

        menuSubmitNewLanguagePage.getSubmitNewLanguageMenuClick();

        errorMessage.getButtonSubmitLanguageClick();

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

    @Test
    public void testCheckTableTitleMenuBrowseLanguages() {
        String expectedResult = "Language, Author, Date, Comments, Rate" ;
        String actualResult;

        getDriver().get(BASE_URL);

        MainPage menuBrowseLanguages = new MainPage(getDriver());
        AbcPage titleTable = new AbcPage(getDriver());

        menuBrowseLanguages.getBrowseLanguagesMenuClick();
        actualResult = titleTable.getTitelsTable();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
