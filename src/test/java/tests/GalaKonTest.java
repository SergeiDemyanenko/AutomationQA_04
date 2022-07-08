package tests;

import org.openqa.selenium.By;
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

public class GalaKonTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testCheckTheNameOfMathematicaLanguageAuthor() {

        String expectedResult = "Brenton Bostick";

        getDriver().get(BASE_URL);

        MainPage mainP = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());
        MPage mp = new MPage(getDriver());
        LanguageMathematicaPage lmp = new LanguageMathematicaPage(getDriver());

        mainP.clickBrowseLanguagesMenu();
        abc.getMSubmenu().click();
        mp.mathematicaPage().click();
        lmp.getTdTableBrentonBostick();

        String actualResult = lmp.getTdTableBrentonBostick().getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testConfirmObjectOrientedVersionHasTheLargestNumberOfComments() {
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
    public void testVerifyBrowseLanguagesSubmenuText() {

        String expectedResult = "0-9ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        getDriver().get(BASE_URL);

        MainPage mainP = new MainPage(getDriver());
        AbcPage abc = new AbcPage(getDriver());

        mainP.getBrowseLanguagesMenu().click();

        String actualResult = abc.getSubmenu().getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testVerifyTwoImagesOfTeamMembers() {
        int expectedResult = 2;

        getDriver().get(BASE_URL);

        StartPage startP = new StartPage(getDriver());
        TeamPage teamP = new TeamPage(getDriver());

        startP.getTeamSubmenu().click();

        Assert.assertEquals(expectedResult, teamP.getAmmountOfImages());
    }

    @Test
    public void testVerifyClickabilityOfWebsiteLinks() {

        StringBuilder expectedR = new StringBuilder();
        String expectedResult = expectedR.append("Index of /").append("www.e-taste.org").toString();

        String lsLaNetURL = "http://www.ls-la.net/";
        String eTasteURL = "http://www.e-taste.org/";

        StartPage startP = new StartPage(getDriver());
        TeamPage teamP = new TeamPage(getDriver());

        getDriver().get(BASE_URL);

        startP.getTeamSubmenu().click();

        teamP.getOliverSchadeLink().click();
        getDriver().get(lsLaNetURL);
        String h1LsLaNet = getDriver()
                .findElement(By.xpath("//h1")).getText();

        getDriver().get("https://www.99-bottles-of-beer.net/team.html");

        teamP.GregorScheithauerLink().click();
        getDriver().get(eTasteURL);
        String h1ETaste = getDriver()
                .findElement(By.xpath("//strong[@class='text-primary text-5xl mb-4']")).getText();

        StringBuilder actualR = new StringBuilder();
        String actualResult = actualR.append(h1LsLaNet).append(h1ETaste).toString();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
