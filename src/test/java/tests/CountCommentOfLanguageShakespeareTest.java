package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.AbcPage;
import pages.MainPage;
import pages.browse_languages.letters.SPage;
import runner.BaseTest;

public class CountCommentOfLanguageShakespeareTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testCountCommentOfLanguageShakespeare(){

        int expectedResult = 6;

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickBrowseLanguagesMenu();

        AbcPage abcPage = new AbcPage(getDriver());
        abcPage.clickSSubmenu();

        SPage sPage = new SPage(getDriver());
        sPage.getShakespeareLanguageClick();

        String[] result = new String[7];
        int countComment = 0;

        for (int i = 1; i < result.length; i++){
            getDriver().findElement(
                    By.xpath("//div[@id='comments']/p[@class='comment'][" + i + "]"));
            if(result.length > i){
                countComment ++;
            }
        }

        Assert.assertEquals(countComment, expectedResult);
    }
}
