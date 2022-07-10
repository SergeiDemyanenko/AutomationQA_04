package tests._to_do;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.submit_new_language.SubmitNewLanguagePage;
import runner.BaseTest;

public class VasiliySinTest extends BaseTest {

    private static final String BASE_URL = "https://www.99-bottles-of-beer.net";

    @Test
    public void testSearchCategorySubmit() {

        String expectedResult = "real language" + "\n" + "esoteric language" + "\n" + "assembly language";

        getDriver().get(BASE_URL);

        MainPage SubmitNewLanguage = new MainPage(getDriver());
        SubmitNewLanguagePage category = new SubmitNewLanguagePage(getDriver());

        SubmitNewLanguage.clickSubmitNewLanguageMenu();

        String actualResult = category.getCategoryName().getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testErrorBlankFieldsSubmitNewLanguage() {

        String expectedResult = "Error: Precondition failed - Incomplete Input.";

        getDriver().get(BASE_URL);

        MainPage SubmitNewLanguage = new MainPage(getDriver());
        SubmitNewLanguagePage getButtonSubmitLanguage = new SubmitNewLanguagePage(getDriver());

        SubmitNewLanguage.clickSubmitNewLanguageMenu();
        getButtonSubmitLanguage.clickButtonSubmitLanguage();

        String actualResult = getButtonSubmitLanguage.getErrorMessage().getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testVerifyTextPleaseNoteSubmitNewLanguage() {

        String expectedResult = "Please note:";

        getDriver().get(BASE_URL);

        MainPage SubmitNewLanguage = new MainPage(getDriver());
        SubmitNewLanguagePage getTitleH3 = new SubmitNewLanguagePage(getDriver());

        SubmitNewLanguage.clickSubmitNewLanguageMenu();

        String actualResult = getTitleH3.getTitleH3Text();

        Assert.assertEquals(actualResult, expectedResult);
        System.out.println(actualResult);
    }
}
