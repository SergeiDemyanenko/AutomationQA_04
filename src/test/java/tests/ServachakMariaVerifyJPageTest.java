package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.browse_languages.letters.JPage;
import pages.MainPage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;


public class ServachakMariaVerifyJPageTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testVerifyTextH2AndPTagJPage(){

        List<String> expectedResults = new ArrayList<>();
        expectedResults.add("Category J");
        expectedResults.add("All languages starting with the " +
                "letter J are shown, sorted by Language.");

        MainPage main = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        JPage j = new JPage(getDriver());

        getDriver().get(BASE_URL);
        main.clickBrowseLanguagesMenu();
        abc.clickJSubmenu();

        List<String> actualResults = List.of(j.getH2HeaderText(), j.getPTagText());

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test
    public void testVerifyTextTableHeader(){

        String expectedResult = "Language Author Date Comments Rate";

        MainPage main = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        JPage j = new JPage(getDriver());

        getDriver().get(BASE_URL);
        main.clickBrowseLanguagesMenu();
        abc.clickJSubmenu();

        Assert.assertEquals(j.getTextThTags().trim(), expectedResult);
    }

    @Test
    public void testAreAllLanguagesOnJPageStartWithTheLetterJ() {
        String expectedResult = "j";

        MainPage main = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        JPage j = new JPage(getDriver());

        getDriver().get(BASE_URL);
        main.clickBrowseLanguagesMenu();
        abc.clickJSubmenu();

        for (WebElement a : j.getAllLanguages()) {

            Assert.assertTrue(a
                    .getText()
                    .toLowerCase()
                    .substring(0, 1)
                    .contains(expectedResult.toLowerCase()));
        }
    }

    @Test
    public void testHowManyLanguagesOnJPage(){
        int expectedResult = 22;

        MainPage main = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        JPage j = new JPage(getDriver());

        getDriver().get(BASE_URL);
        main.clickBrowseLanguagesMenu();
        abc.clickJSubmenu();

        Assert.assertEquals(j.getAllLanguages().size(), expectedResult);
    }

    @Test
    public void testLinkInTableIsClickable(){

        MainPage main = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        JPage j = new JPage(getDriver());

        getDriver().get(BASE_URL);
        main.clickBrowseLanguagesMenu();
        abc.clickJSubmenu();

        String url = getDriver().getCurrentUrl();

        j.getAllLanguages().get(j.randomALinks() - 1).click();

        Assert.assertNotEquals(getDriver().getCurrentUrl(), url);
    }

    @Test
    public void testCheckAuthorDataCommentsForSelectedLanguage(){
        final String languageName = "Joy";

        MainPage main = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        JPage j = new JPage(getDriver());

        getDriver().get(BASE_URL);
        main.clickBrowseLanguagesMenu();
        abc.clickJSubmenu();

        Assert.assertEquals(j.getTrText(languageName), j.getExpectedResult(languageName));
    }
}