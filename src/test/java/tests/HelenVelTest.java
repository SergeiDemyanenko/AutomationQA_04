package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelenVelTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testBrowseLanguagesCheckInCategoryMLanguageMacroX() {

        String expectedResult = "MacroX";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage category_m = new AbcPage(getDriver());
        category_m.clickMSubmenu();

        MPage language_macroX = new MPage(getDriver());
        String actualResult = language_macroX.getlanguageMacroXVerify();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStartHistoryOnTheHistoryPageConfirmTheHistoryHeader() {

        String expectedResult = "History";

        getDriver().get(BASE_URL);

        StartPage historyLink = new StartPage(getDriver());
        historyLink.clickInfoMain();

        InfoPage H2Header = new InfoPage(getDriver());
        String actualResult = H2Header.getH2HeaderText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testH3NamesTeam() {

        List<String> expectedResult = new ArrayList<>(
                Arrays.asList("Oliver Schade", "Gregor Scheithauer", "Stefan Scheler"));

        getDriver().get(BASE_URL);
        getDriver().findElement(By.linkText("Team")).click();

        TeamPage teamPage = new TeamPage(getDriver());

        List<String> actualResult = new ArrayList<>();
        for (WebElement namesTeam : teamPage.getListH3TeamName()) {
            actualResult.add(namesTeam.getText());
        }
        Assert.assertEquals(actualResult, expectedResult);
    }
}