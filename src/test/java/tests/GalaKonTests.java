package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import pages.browse_languages.AbcPage;
import pages.browse_languages.languages.LanguageJava3Page;
import pages.browse_languages.languages.LanguageMathematicaPage;
import pages.browse_languages.letters.JPage;
import pages.browse_languages.letters.MPage;
import pages.start.StartPage;
import pages.start.TeamPage;
import runner.BaseTest;

public class GalaKonTests extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void checkTheNameOfMathematicaLanguageAuthor() {

        String expectedResult = "Brenton Bostick";

        getDriver().get(BASE_URL);

        MainPage mainP = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        MPage mp = new MPage(getDriver());
        LanguageMathematicaPage lmp = new LanguageMathematicaPage(getDriver());

        mainP.clickBrowseLanguagesMenu();
        abc.getMSubmenu().click();
        mp.mathematicaPage().click();
        lmp.BrentonBostick();

        String actualResult = lmp.BrentonBostick().getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void confirmObjectOrientedVersionHasTheLargestNumberOfComments() {
        int expectedResult = 33;

        getDriver().get(BASE_URL);

        MainPage mainP = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        JPage jp = new JPage(getDriver());
        LanguageJava3Page ljp = new LanguageJava3Page(getDriver());

        mainP.clickBrowseLanguagesMenu();
        abc.getJSubmenu().click();
        jp.getLinkLanguageJava3().click();

        Assert.assertEquals(expectedResult, ljp.getCountOfCommentsHeaders());
    }

    @Test
    public void test() {

        String expectedResult = "0-9ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        getDriver().get(BASE_URL);

        MainPage mainP = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());

        mainP.getBrowseLanguagesMenu().click();

        String actualResult = abc.getSubmenu().getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void verifyTwoImagesOfTeamMembers() {
        int expectedResult = 2;

        getDriver().get(BASE_URL);

        StartPage startP = new StartPage(getDriver());
        TeamPage teamP = new TeamPage(getDriver());

        startP.getTeamSubmenu().click();

        Assert.assertEquals(expectedResult, teamP.getAmmountOfImages());
    }
}
