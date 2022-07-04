package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import static java.lang.Integer.parseInt;

public class MorigorHWTest extends BaseTest {

    private final String baseURL = "http://www.99-bottles-of-beer.net/";
    private final String browseLangURL = "https://www.99-bottles-of-beer.net/abc.html";

    @Test
    public void testAreLanguagesSortedByLetter() {
        String expectedResult
                = "All languages starting with the letter J are shown, sorted by Language.";
        getDriver().get(baseURL);

        getDriver().findElement(
                By.xpath("//ul[@id='menu']/li/a[@href='/abc.html']")
        ).click();
        getDriver().findElement(
                By.xpath("//ul[@id='submenu']/li/a[@href='j.html']")
        ).click();

        String actualResult = getDriver()
                .findElement(By.xpath("//div[@id='main']/p[text()]")).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testConfirmIfLanguageCorrect() {
        String expectedResult = "MySQL";

        getDriver().get(baseURL);
        getDriver().findElement(
                By.xpath("//ul[@id='menu']/li/a[@href='/abc.html']")
        ).click();
        getDriver().findElement(
                By.xpath("//ul[@id='submenu']/li/a[@href='m.html']")
        ).click();

        String actualResult = getDriver()
                .findElement(
                        By.xpath("//table[@id='category']/tbody/tr/td" +
                                "/a[@href='language-mysql-1252.html']")
                ).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testConfirmIfTableHeadExist() {
        String expectedResult = "Language, Author, Date, Comments, Rate,";

        getDriver().get(browseLangURL);

        String[] tableArr = new String[5];
        String actualresult = "";
        for(int i = 0; i < tableArr.length; i++) {
            tableArr[i] = getDriver()
                    .findElement(
                            By.xpath("//tbody/tr/th[" + (i + 1) + "]")
                    ).getText();
            actualresult = actualresult.concat(tableArr[i] + ", ");
        }

        Assert.assertEquals(actualresult.trim(), expectedResult);
    }

    @Test
    public void testMathematicaLanguageData() {
        getDriver().get(browseLangURL);
        getDriver().findElement(
                By.xpath("//ul[@id='submenu']/li/a[@href='m.html']")).click();
        getDriver()
                .findElement(
                        By.xpath("//tbody/tr/td/a[@href='language-mathematica-1090.html']"))
                .click();

        WebElement author
                = getDriver()
                .findElement(
                        By.xpath("//table[@style='margin: 7px; padding: 0;;']/tbody/tr[2]/td[last()]"));
        WebElement update
                = getDriver()
                .findElement(
                        By.xpath("//table[@style='margin: 7px; padding: 0;;']/tbody/tr[1]/td[last()]"));
        WebElement comments
                = getDriver()
                .findElement(
                        By.xpath("//table[@style='margin: 7px; padding: 0;;']/tbody/tr[4]/td[last()]"));

        Assert.assertEquals(author.getText(), "Brenton Bostick");
        Assert.assertEquals(update.getText(), "03/16/06");
        Assert.assertEquals(comments.getText(), "1");
    }

    @Test
    public void testLanguagesWithFigureFirst() {
        getDriver().get(browseLangURL);
        getDriver().findElement(
                        By.xpath("//ul[@id='submenu']/li/a[@href='0.html']"))
                .click();

        String[] languageArr = new String[10];
        int numberOfLanguages = 0;
        for(int i = 0; i < languageArr.length; i++) {
            languageArr[i]
                    = getDriver()
                    .findElement(
                            By.xpath("//table[@id='category']/tbody/tr[" + (i + 2) + "]"))
                    .getText();
            if(languageArr[i].length() > 0) {
                numberOfLanguages ++;
            }
        }

        Assert.assertEquals(numberOfLanguages, 10);
    }

    @Test
    public void testOfErrorOnSignGuestbookPage() {
        String expectedResult = "Error: Error: Invalid security code.";

        getDriver().get("https://www.99-bottles-of-beer.net/guestbookv2.html");

        getDriver().findElement(
                        By.xpath("//ul[@id='submenu']/li/a[@href='./signv2.html']"))
                .click();
        getDriver().findElement(By.xpath("//form/p/input[@name='email']"))
                .sendKeys("membership@ics.org.uk");

        int randomCode = (int)(100 + (Math.random() * (999 - 100)));
        String securityCode = String.valueOf(randomCode);
        getDriver().findElement(By.xpath("//form/p/input[@name='captcha']"))
                .sendKeys(securityCode);
        getDriver().findElement(By.xpath("//form/p/textarea[@*]"))
                .sendKeys("test message");
        getDriver().findElement(By.xpath("//form/p/input[@type='submit']"))
                .click();

        String actualResult = getDriver()
                .findElement(By.xpath("//div[@id='main']/p")).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIfIconRedditWorks() {
        String expectedResult
                = "https://www.reddit.com/login/?dest=https%3A%2F%2F" +
                "www.reddit.com%2Fsubmit%3Furl%3Dhttps%253A%252F%252F" +
                "www.99-bottles-of-beer.net%252Flanguage-java-4" +
                ".html%26title%3D99%2520Bottles%2520of%2520Beer%2520%257C%2520Language%2520Java";

        getDriver().get(browseLangURL);

        getDriver().findElement(
                By.xpath("//ul[@id='submenu']/li/a[@href='j.html']")).click();
        getDriver().findElement(
                        By.xpath("//tbody/tr/td/a[@href='language-java-3.html']"))
                .click();
        getDriver()
                .findElement(
                        By.xpath("//table[@id='category']/tbody/tr/td" +
                                "/a[@href='language-java-4.html']")).click();
        getDriver().findElement(By.xpath("//a[@title='reddit']")).click();

        String actualResult = getDriver().getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testConfirmIfShakespeareInTop() {
        String language = "Shakespeare";
        boolean expectedResult = true;

        getDriver().get(baseURL);

        getDriver().findElement(
                        By.xpath("//ul[@id='menu']/li/a[@href='/toplist.html']"))
                .click();
        String[] languageArr = new String[20];
        boolean shakespearInTop20 = false;
        for(int i = 0; i < languageArr.length; i++) {
            languageArr[i] = getDriver()
                    .findElement(By.xpath("//tbody/tr[" + (i + 2) + "]"))
                    .getText();
            if(languageArr[i].contains(language)) {
                shakespearInTop20 = true;
            }
        }

        getDriver().findElement(
                        By.xpath("//ul[@id='submenu']/li/a[@href='./toplist_esoteric.html']"))
                .click();
        String[] languageArr1 = new String[10];
        boolean shakespearInTop10 = false;
        for(int i = 0; i < languageArr1.length; i++) {
            languageArr1[i] = getDriver()
                    .findElement(By.xpath("//tbody/tr[" + (i + 2) + "]"))
                    .getText();
            if(languageArr1[i].contains(language)) {
                shakespearInTop10 = true;
            }
        }

        getDriver().findElement(
                        By.xpath("//ul[@id='submenu']/li/a[@href='./tophits.html']"))
                .click();
        String[] languageArr2 = new String[6];
        boolean shakespearInTop6 = false;
        for(int i = 0; i < languageArr2.length; i++) {
            languageArr2[i] = getDriver()
                    .findElement(By.xpath("//tbody/tr[" + (i + 2) + "]"))
                    .getText();
            if(languageArr2[i].contains(language)) {
                shakespearInTop6 = true;
            }
        }

        getDriver().findElement(
                        By.xpath("//ul[@id='submenu']/li/a[@href='./toplist_real.html']"))
                .click();
        String[] languageArr3 = new String[25];
        boolean shakespearInTop25 = false;
        for(int i = 0; i < languageArr3.length; i++) {
            languageArr3[i] = getDriver()
                    .findElement(By.xpath("//tbody/tr[" + (i + 2) + "]"))
                    .getText();
            if(!languageArr3[i].contains(language)) {
                shakespearInTop25 = true;
            }else {
                shakespearInTop25 = false;
            }
        }

        Assert.assertEquals(shakespearInTop20, expectedResult);
        Assert.assertEquals(shakespearInTop10, expectedResult);
        Assert.assertEquals(shakespearInTop6, expectedResult);
        Assert.assertEquals(shakespearInTop25, expectedResult);
    }

    @Test
    public void testIfSixVersionsOfJavaExist() {
        int numOfJavaVersions = 6;
        int actualResult = 0;

        getDriver().get("https://www.99-bottles-of-beer.net/j.html");

        getDriver().findElement(
                        By.xpath("//tbody/tr/td/a[@href='language-java-3.html']"))
                .click();
        String versionName
                = getDriver()
                .findElement(
                        By.xpath("//div[@id='main']/p[@style='padding-top: 0; padding-bottom: 0;']"))
                .getText();
        actualResult++;

        String[] versionArr = new String[5];
        for(int i = 0; i < versionArr.length; i++) {
            versionArr[i]
                    = getDriver()
                    .findElement(
                            By.xpath("//table[@id='category']/tbody/tr[" + (i + 2) + "]"))
                    .getText();
            if(!versionArr[i].contains(versionName)) {
                actualResult++;
            }
        }

        Assert.assertEquals(actualResult, numOfJavaVersions);
    }

    @Test
    public void testIfVersionHasMaxComments() {
        int javaOOVersionComments = 33;
        getDriver().get("https://www.99-bottles-of-beer.net/language-java-3.html");

        WebElement javaOOVcomments
                = getDriver()
                .findElement(
                        By.xpath("//table[@style='margin: 7px; padding: 0;;']/tbody/tr[4]/td[2]"));
        int maxComments = parseInt(javaOOVcomments.getText());

        int[] eachLangComments = new int[5];
        for(int i = 0; i < eachLangComments.length; i++) {
            eachLangComments[i]
                    = parseInt(getDriver()
                    .findElement(
                            By.xpath("//table[@id='category']/tbody/tr[" + (i + 2) + "]/td[4]"))
                    .getText());
            if(eachLangComments[i] >= maxComments) {
                maxComments = eachLangComments[i];
            }
        }

        Assert.assertEquals(maxComments, javaOOVersionComments);
    }
}