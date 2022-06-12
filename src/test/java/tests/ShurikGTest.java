package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class ShurikGTest extends BaseTest {

    public static final String URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void test99Bottles() {
        getDriver().get(URL);
        WebElement menuBrowsLanguges = getDriver().findElement(
                By.xpath("(//a[@href='/abc.html'])[1]"));
        menuBrowsLanguges.click();
        WebElement menuStart = getDriver().findElement(
                By.xpath("(//a[@href='/'])[1]"));
        menuStart.click();
        WebElement h2 = getDriver().findElement(
                By.xpath("(//h2)[2]"));

        Assert.assertEquals(h2.getText(),
                "Welcome to 99 Bottles of Beer");
    }

    @Test
    public void testMenuStartTitle() {
        getDriver().get(URL);
        WebElement menuBrowsLanguges = getDriver().findElement(
                By.xpath("//ul[@id='menu']/li/a[@href='/abc.html']"));
        menuBrowsLanguges.click();
        WebElement menuStart = getDriver().findElement(
                By.xpath("//ul[@id='menu']/li/a[@href='/']"));
        menuStart.click();
        WebElement h2 = getDriver().findElement(
                By.xpath("//div[@id='main']/h2"));


        String expectedResult = "Welcome to 99 Bottles of Beer";
        String actualResult = h2.getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_TC_11_01() {
        getDriver().get(URL);
        WebElement h1 = getDriver().findElement(
                By.xpath("//div[@id='header']/h1"));

        Assert.assertEquals(h1.getText(), "99 Bottles of Beer");
    }

    @Test
    public void test_TC_11_02() {
        getDriver().get(URL);
        WebElement liLast = getDriver().findElement(
                By.xpath("//ul[@id='menu']/li[last()]"));

        Assert.assertEquals(liLast.getText(), "SUBMIT NEW LANGUAGE");
    }

    @Test
    public void test_TC_11_03() {
        getDriver().get(URL);
        getDriver().findElement(
                By.xpath("//ul[@id='menu']/li[last()]")).click();
        WebElement subtitle = getDriver().findElement(By.id("submenu"));

        Assert.assertEquals(subtitle.getText(), "Submit New Language");
    }

    @Test
    public void test_TC_11_04() {
        getDriver().get("http://www.99-bottles-of-beer.net/abc.html");
        WebElement first = getDriver().findElement(
                By.xpath("//ul[@id='submenu']/li[1]"));

        Assert.assertEquals(first.getText(), "0-9");
    }

    @Test
    public void test_TC_11_06() {
        getDriver().get(URL);
        getDriver().findElement(
                By.xpath("//div[@id='main']//a[@href='./team.html']")).click();
        WebElement firstAuthor = getDriver().findElement(
                By.xpath("//div[@id='main']/h3[1]"));
        WebElement secondAuthor = getDriver().findElement(
                By.xpath("//div[@id='main']/h3[2]"));
        WebElement thirdAuthor = getDriver().findElement(
                By.xpath("//div[@id='main']/h3[3]"));

        Assert.assertEquals(firstAuthor.getText(), "Oliver Schade");
        Assert.assertEquals(secondAuthor.getText(), "Gregor Scheithauer");
        Assert.assertEquals(thirdAuthor.getText(), "Stefan Scheler");
    }

    @Test
    public void test_TC_11_11() {
        getDriver().get(URL);
        getDriver().findElement(
                By.xpath("//ul[@id='menu']" +
                        "//a[@href='/submitnewlanguage.html']")).click();
        WebElement submit = getDriver().findElement(
                By.xpath("//input[@type='submit']"));
        submit.click();
        WebElement errorText = getDriver().findElement(
                By.xpath("//div[@id='main']/p"));

        Assert.assertEquals(errorText.getText(),
                "Error: Precondition failed - Incomplete Input.");
    }

    @Test
    public void test_TC_11_13() {
        getDriver().get("http://www.99-bottles-of-beer.net/submitnewlanguage.html");
        WebElement text = getDriver().findElement(
                By.xpath("//div[@id=\"main\"]/ul/li[1]"));
        String expectedResult = "IMPORTANT: Take your time! The more " +
                "carefully you fill out this form (especially the language " +
                "name and description), the easier it will be for us and " +
                "the faster your language will show up on this page. " +
                "We don't have the time to mess around with fixing your " +
                "descriptions etc. Thanks for your understanding.";

        Assert.assertEquals(text.getText(), expectedResult);
    }

    @Test
    public void test_TC_11_14() {
        getDriver().get(URL);
        getDriver().findElement(
                By.xpath("//ul[@id='menu']/li/a[@href='/abc.html']")).click();
        WebElement nameOne = getDriver().findElement(By.xpath("//table//th[1]"));
        WebElement nameTwo = getDriver().findElement(By.xpath("//table//th[2]"));

        Assert.assertEquals(nameOne.getText(), "Language");
        Assert.assertEquals(nameTwo.getText(), "Author");
    }

    @Test
    public void test_TC_11_15() {
        getDriver().get(URL);
        getDriver().findElement(
                By.xpath("//ul[@id='menu']/li" +
                        "/a[@href='/toplist.html']")).click();
        getDriver().findElement(
                By.xpath("//ul[@id='submenu']/li[last()]/a")).click();
        WebElement text = getDriver().findElement(By.xpath("//div[@id='main']/p"));

        Assert.assertEquals(text.getText(), "");
    }

    @Test
    public void test_TC_11_21() {
        getDriver().get("http://www.99-bottles-of-beer.net/submitnewlanguage.html ");
        WebElement text = getDriver().findElement(By.xpath("//div[@id='main']//span"));

        Assert.assertEquals(text.getAttribute("style"),
                "background-color: red; color: white;");
    }
}