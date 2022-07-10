package tests._to_do;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class Song99BottlesServachakMTest extends BaseTest {
    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";



    @Test
    public void testAreAllLanguagesStartingWithTheLetterJInMenuBrowseLanguages() {
        String expectedResult = "All languages starting with the " +
                "letter J are shown, sorted by Language.";

        getDriver().get(BASE_URL);
        getDriver().findElement(
                By.xpath("//a[@href='/abc.html']")).click();
        getDriver().findElement(By.xpath("//a[@href='j.html']")).click();

        String actualResult = getDriver().findElement(
                By.xpath("//div[@id='main']/p[1]")).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLastLanguageInMenuBrowseLanguageLetterM() {
        String expectedResult = "MySQL";

        getDriver().get(BASE_URL);
        getDriver().findElement(
                By.xpath("//a[@href='/abc.html']")).click();
        getDriver().findElement(By.xpath("//a[@href = 'm.html']")).click();

        String actualResult = getDriver().findElement(
                By.xpath("//a[@href='language-mysql-1252.html']")).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTableInBrowseLanguages() {
        String expectedResult = "Language Author Date Comments Rate";

        getDriver().get(BASE_URL);
        getDriver().findElement(
                By.xpath("//a[@href='/abc.html']")).click();

        String actualResult = getDriver().findElement(
                By.xpath("//tr[1]")).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLanguageMathematica() {
        String expectedResult = "Mathematica Brenton Bostick 03/16/06 1";

        getDriver().get(BASE_URL);
        getDriver().findElement(
                By.xpath("//a[@href='/abc.html']")).click();
        getDriver().findElement(By.xpath("//a[@href='m.html']")).click();

        String actualResult = getDriver()
                .findElement(
                        By.xpath("//td[text()='Brenton Bostick']/..")
                ).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLanguageNameStartsWithNumber() {
        int expectedResult = 10;

        getDriver().get(BASE_URL);
        getDriver().findElement(
                By.xpath("//a[@href='/abc.html']")).click();
        getDriver().findElement(By.xpath("//a[@href='0.html']")).click();

        int actualResult = getDriver()
                .findElements(By.xpath("//tr[@onmouseover]"))
                .size();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSignGuestbookError() {
        String expectedResult = "Error: Error: Invalid security code.";

        getDriver().get("http://www.99-bottles-of-beer.net/signv2.html");
        getDriver().findElement(
                        By.xpath("//input[@name='name']"))
                .sendKeys("Servachak Maria");
        getDriver().findElement(
                        By.xpath("//input[@name='location']"))
                .sendKeys("Ukraine");
        getDriver().findElement(
                        By.xpath("//input[@name='email']"))
                .sendKeys("servachak.m.u@gmail.com");
        getDriver().findElement(
                        By.xpath("//input[@name='homepage']"))
                .sendKeys("http://www.99-bottles-of-beer.net/");
        getDriver().findElement(
                        By.xpath("//textarea[@name='comment']"))
                .sendKeys("Hello");
        getDriver().findElement(
                        By.xpath("//input[@name='captcha']"))
                .sendKeys(Integer.toString((int) (Math.random() * 900) + 100));
        getDriver().findElement(
                        By.xpath("//input[@type='submit']"))
                .click();

        String actualResult = getDriver().findElement(
                By.xpath("//p[contains(text(),'Error')]")).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBookmarkRedditInBrowseLanguageCPlusPlus7() {
        String expectedResult = "reddit.com: Log in";

        getDriver().get(BASE_URL);
        getDriver().findElement(
                By.xpath("//a[@href='/abc.html']")).click();
        getDriver().findElement(
                By.xpath("//a[@href='c.html']")).click();
        getDriver().findElement(
                By.linkText("C++")
        ).click();
        getDriver().findElement(
                By.linkText("hacking style")
        ).click();
        getDriver().findElement(
                By.xpath("//a[@title='reddit']")).click();

        WebDriverWait wait = new WebDriverWait(getDriver(), 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id='loginUsername']")));

        String actualResult = getDriver().getTitle();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIsShakespeareInTop20Rated() {
        getDriver().get(BASE_URL);
        getDriver().findElement(
                        By.xpath("//a[@href='/toplist.html']"))
                .click();
        getDriver().findElement(By.xpath("//a[@href='./toplist.html']")).click();

        int actualResult = Integer.parseInt(
                getDriver().findElement(
                        By.xpath("//a[text()='Shakespeare']/../..")
                ).getText().substring(0, 2));

        Assert.assertTrue(actualResult < 21);
    }

    @Test
    public void testIsShakespeareInTop10EsotericRated() {
        getDriver().get(BASE_URL);
        getDriver().findElement(
                        By.xpath("//a[@href='/toplist.html']"))
                .click();
        getDriver().findElement(By.xpath("//a[@href='./toplist_esoteric.html']"))
                .click();

        int actualResult = Integer.parseInt(
                getDriver().findElement(
                        By.xpath("//a[text()='Shakespeare']/../..")
                ).getText().substring(0, 2).replace(".", ""));

        Assert.assertTrue(actualResult < 11);
    }

    @Test
    public void testIsShakespeareInTop6Hits() {
        getDriver().get(BASE_URL);
        getDriver().findElement(
                        By.xpath("//a[@href='/toplist.html']"))
                .click();
        getDriver().findElement(By.xpath("//a[@href='./tophits.html']")).click();

        int actualResult = Integer.parseInt(
                getDriver().findElement(
                        By.xpath("//a[text()='Shakespeare']/../..")
                ).getText().substring(0, 2).replace(".", ""));

        Assert.assertTrue(actualResult < 7);
    }

    @Test
    public void testIsShakespeareInTopRealLanguage() {
        getDriver().get(BASE_URL);
        getDriver().findElement(
                        By.xpath("//a[@href='/toplist.html']"))
                .click();
        getDriver().findElement(By.xpath("//a[@href='./toplist_real.html']"))
                .click();

        Assert.assertFalse(getDriver().findElement(
                By.xpath("//table[@id='category']")).getText().contains("Shakespeare"));
    }

    @Test
    public void testNumberOfJavaVersions() {
        int expectedResult = 6;

        getDriver().get(BASE_URL);
        getDriver().findElement(By.xpath("//a[@href='/abc.html']"))
                .click();
        getDriver().findElement(By.xpath("//a[@href='j.html']"))
                .click();
        getDriver().findElement(By.xpath("//a[text()='Java']"))
                .click();
        int javaVersion = getDriver().findElements(
                By.xpath("//tr[@onmouseover]")).size();

        int actualResult = javaVersion + 1;

        Assert.assertEquals(actualResult, expectedResult);
    }
}
