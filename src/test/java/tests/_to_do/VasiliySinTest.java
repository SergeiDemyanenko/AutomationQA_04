package tests._to_do;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import runner.BaseTest;

@Ignore
public class VasiliySinTest extends BaseTest {

    private static final String BASE_URL = "https://www.99-bottles-of-beer.net";

    @Test
    public void testSearchCategorySubmit() {

        String expectedResult = "real language" + "\n" + "esoteric language" + "\n" + "assembly language";

        openBaseURL().clickSubmitNewLanguageMenu();

//        String actualResult = category.getCategoryName().getText();
//
//        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testErrorBlankFieldsSubmitNewLanguage() {

        String expectedResult = "Error: Precondition failed - Incomplete Input.";

        openBaseURL()
                .clickSubmitNewLanguageMenu()
                .clickButtonSubmitLanguage();

//        String actualResult = .getErrorMessage().getText();
//
//        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testVerifyTextPleaseNoteSubmitNewLanguage() {

        String expectedResult = "Please note:";

        getDriver().get(BASE_URL);

//        MainPage SubmitNewLanguage = new MainPage(getDriver());
//        SubmitNewLanguagePage getTitleH3 = new SubmitNewLanguagePage(getDriver());
//
//        SubmitNewLanguage.clickSubmitNewLanguageMenu();
//
//        String actualResult = getTitleH3.getTitleH3Text();
//
//        Assert.assertEquals(actualResult, expectedResult);
//        System.out.println(actualResult);
    }
}
