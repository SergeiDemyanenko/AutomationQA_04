package tests._to_do;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.guestbook.GuestbookV2Page;
import pages.MainPage;
import pages.submit_new_language.SubmitNewLanguagePage;
import runner.BaseTest;


import java.util.ArrayList;
import java.util.List;

import static pages.submit_new_language.SubmitNewLanguagePage.getRandomStr;

public class Song99BottlesAsTest extends BaseTest {

    private static final String URL = "http://www.99-bottles-of-beer.net/lyrics.html";

    @Test
    public void testIncludesNewLanguageCategory(){

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("real language");
        expectedResult.add("esoteric language");
        expectedResult.add("assembly language");

        getDriver().get(URL);
        MainPage main = new MainPage(getDriver());
        main.clickSubmitNewLanguageMenu();
        SubmitNewLanguagePage category = new SubmitNewLanguagePage(getDriver());
        category.clickCategoryName();
        Assert.assertEquals(category.getCategoryText(),expectedResult);
    }

    @Test
    public void testGetErrorMessageInvalidSecCode(){

        String expectedResult = "Error: Invalid security code.";

        getDriver().get(URL);
        MainPage main = new MainPage(getDriver());
        main.clickSubmitNewLanguageMenu();

        SubmitNewLanguagePage newLanguagePage = new SubmitNewLanguagePage(getDriver());
        newLanguagePage.getLanguageName().sendKeys(getRandomStr(4));
        newLanguagePage.getAuthorName().sendKeys(getRandomStr(7));
        newLanguagePage.getEmailName().sendKeys(getRandomStr(7));
        newLanguagePage.getCategoryName().click();
        newLanguagePage.getCategoryAssemblyLanguage().click();
        newLanguagePage.getSecurityCodeName().sendKeys(getRandomStr(4));
        newLanguagePage.getCodeName().sendKeys(getRandomStr(5));
        newLanguagePage.getButtonSubmitLanguage();
        newLanguagePage.clickButtonSubmitLanguage();

        String actuallyResult  = newLanguagePage.getErrorMessageInvalidSecCodeText();

        Assert.assertEquals(actuallyResult,expectedResult);
    }

    @Test
    public void testVerifyLinkTextGuestbookV2Page() {

        String expectedResult = "http://www.99-bottles-of-beer.net/guestbookv2.html";
        String expecResNum = "2";

        getDriver().get(URL);
        MainPage main = new MainPage(getDriver());
        main.clickSubmitNewLanguageMenu();
        main.clickGuestbookV2Menu();
        GuestbookV2Page text = new GuestbookV2Page(getDriver());
        String actuallyResNum = text.getPage2Text();
        String actuallyResult = getDriver().getCurrentUrl();

        Assert.assertEquals(actuallyResult, expectedResult);
        Assert.assertEquals(actuallyResNum,expecResNum);
    }
}
