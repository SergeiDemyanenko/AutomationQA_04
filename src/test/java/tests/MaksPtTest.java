package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import runner.BaseTest;

public class MaksPtTest extends BaseTest {

    public static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testDescriptionLanguagesJ() {
        final String expectedResult = "All languages starting with the letter J are shown, sorted by Language.";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());
        abc.clickJSubmenu();

        JPage j = new JPage(getDriver());
        String actualResult = j.getPTagText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLastLanguageInM() {
        final String expectedResult = "MySQL";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());
        abc.clickMSubmenu();

        MPage m = new MPage(getDriver());
        String actualResult = m.getLastLanguageInMText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testErrorTextSignV2Page() {
        final String expectedTextError = "Error: Error: Invalid security code.";

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickGuestbookV2Menu();

        GuestbookV2Page guestbookV2Page = new GuestbookV2Page(getDriver());
        guestbookV2Page.clickSignV2();

        SignV2Page signV2Page = new SignV2Page(getDriver());
        signV2Page.inputNameField("MaksPt");
        signV2Page.inputLocationField("Portugal");
        signV2Page.inputEmailField("pt@gmail.com");
        signV2Page.inputHomepageField("maks.com");
        signV2Page.inputCaptchaField(Integer.toString((int) (Math.random() * 900 + 100)));
        signV2Page.inputCommentField("QA Automation for everyone");
        signV2Page.getSubmitButtonClick();

        Assert.assertEquals(signV2Page.getErrorMessageText(), expectedTextError);
    }

    @Test
    public void testErrorTextFontSignV2Page() {
        final String expectedTextErrorBold = "b";

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickGuestbookV2Menu();

        GuestbookV2Page guestbookV2Page = new GuestbookV2Page(getDriver());
        guestbookV2Page.clickSignV2();

        SignV2Page signV2Page = new SignV2Page(getDriver());
        signV2Page.inputNameField("MaksPt");
        signV2Page.inputLocationField("Portugal");
        signV2Page.inputEmailField("pt@gmail.com");
        signV2Page.inputHomepageField("maks.com");
        signV2Page.inputCaptchaField(Integer.toString((int) (Math.random() * 900 + 100)));
        signV2Page.inputCommentField("QA Automation for everyone");
        signV2Page.getSubmitButtonClick();

        Assert.assertEquals(signV2Page.getErrorMessageTagFont(), expectedTextErrorBold);
    }

    @Test
    public void testErrorTextBackgroundColorSignV2Page() {
        final String expectedTextErrorStyle =
                "border: 1px solid red; background-color: rgb(255, 224, 224); padding: 5px; margin: 5px 10px;";

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickGuestbookV2Menu();

        GuestbookV2Page guestbookV2Page = new GuestbookV2Page(getDriver());
        guestbookV2Page.clickSignV2();

        SignV2Page signV2Page = new SignV2Page(getDriver());
        signV2Page.inputNameField("MaksPt");
        signV2Page.inputLocationField("Portugal");
        signV2Page.inputEmailField("pt@gmail.com");
        signV2Page.inputHomepageField("maks.com");
        signV2Page.inputCaptchaField(Integer.toString((int) (Math.random() * 900 + 100)));
        signV2Page.inputCommentField("QA Automation for everyone");
        signV2Page.getSubmitButtonClick();

        Assert.assertEquals(signV2Page.getErrorMessageAttributeStyle(), expectedTextErrorStyle);
    }
}