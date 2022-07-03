package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.start.TeamPage;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeamTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testH3TeamNamesTeamPage() {
        List<String> expectedResult = new ArrayList<>(
                Arrays.asList("Oliver Schade", "Gregor Scheithauer", "Stefan Scheler"));

        getDriver().get(BASE_URL);

        getDriver().findElement(By.linkText("Team")).click();

        TeamPage teamPage = new TeamPage(getDriver());

        List<String> actualResult = new ArrayList<>();
        for (WebElement name : teamPage.getListH3TeamName()) {
            actualResult.add(name.getText());
        }

        Assert.assertEquals(actualResult, expectedResult);
    }
}