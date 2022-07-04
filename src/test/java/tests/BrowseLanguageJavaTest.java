package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.browse_languages.letters.JPage;
import pages.MainPage;
import runner.BaseTest;

import java.util.HashMap;
import java.util.Map;

public class BrowseLanguageJavaTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testMoreCommentsOnJavaVersions() {
        String expectedResult = "object-oriented version";

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());
        abc.clickJSubmenu();

        JPage j = new JPage(getDriver());
        j.clickLinkLanguageJava3();

        int mainVersionComments = Integer.parseInt(getDriver().findElement(
                By.xpath("//strong[contains(text(),'Comments')]/parent::td/parent::tr/td[2]")).getText());
        String mainVersionName = getDriver().findElement(
                By.xpath("//div[@id='main']/p[contains(text(),'object')]")).getText();

        Map<Integer, String> map = new HashMap<>();
        map.put(mainVersionComments, mainVersionName.replaceAll("[()]", ""));

        int countVersion = getDriver().findElements(By.xpath("//table[@id='category']//tr[@onmouseover]")).size();

        int max = mainVersionComments;
        for (int i = 0; i < countVersion; i++) {
            int numberOfComments = Integer.parseInt(getDriver().findElement(
                    By.xpath("//tr[starts-with(@onmouseover,'setPointer')][" + (i + 1) + "]/td[4]")).getText());
            String name = getDriver().findElement(
                    By.xpath("//tr[starts-with(@onmouseover,'setPointer')][" + (i + 1) + "]/td/a")).getText();
            map.put(numberOfComments, name);

            if (numberOfComments > max) {
                max = numberOfComments;
            }
        }

        Assert.assertEquals(map.get(max), expectedResult);
    }
}