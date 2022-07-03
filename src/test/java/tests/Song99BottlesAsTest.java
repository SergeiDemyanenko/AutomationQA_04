package tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.guestbook.GuestbookV2Page;
import pages.MainPage;
import pages.submit_new_language.SubmitNewLanguagePage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class Song99BottlesAsTest extends BaseTest {

    private static final String URL = "http://www.99-bottles-of-beer.net/lyrics.html";

    @Test
    public void testiIncludesNewLanguageCategoryTest() {

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("real language");
        expectedResult.add("esoteric language");
        expectedResult.add("assembly language");

        getDriver().get(URL);
        MainPage main = new MainPage(getDriver());
        main.getSubmitNewLanguageMenu().click();
        SubmitNewLanguagePage category = new SubmitNewLanguagePage(getDriver());
        category.clickCategoryName();
        List<WebElement> name = getDriver().findElements(By.xpath("//select[@name='category']/option"));
        List<String> actuallyResult = new ArrayList<>();
        for (WebElement dropDown : name) {
            actuallyResult.add(dropDown.getText());
        }
        System.out.println(actuallyResult);
        Assert.assertEquals(actuallyResult,expectedResult);
    }

    public static String getRandomStr(int length) {
        return RandomStringUtils.random(length,
                "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
    }

    @Test
    public void testGetErrorMessageInvalidSecCode(){

        String expectedResult = "Error: Invalid security code.";

        getDriver().get(URL);
        MainPage main = new MainPage(getDriver());
        main.getSubmitNewLanguageMenu().click();

        SubmitNewLanguagePage newLanguagePage = new SubmitNewLanguagePage(getDriver());
        newLanguagePage.getLanguageName().sendKeys(getRandomStr(5));
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
        main.getSubmitNewLanguageMenu().click();
        main.clickGuestbookV2Menu();
        GuestbookV2Page text = new GuestbookV2Page(getDriver());
        String actuallyResNum = text.getPage2Text();
        String actuallyResult = getDriver().getCurrentUrl();

        Assert.assertEquals(actuallyResult, expectedResult);
        Assert.assertEquals(actuallyResNum,expecResNum);
    }
}
