package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import runner.BaseTest;
import java.util.List;

public class Song99BoutleXbrookxTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testConfirmTableWithHeaders() {

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());

        Assert.assertEquals(abc.getTitlesTable(), "Language, Author, Date, Comments, Rate");
    }

    @Test
    public void testVerifyCountVersionsJavaLanguages () {

        getDriver().get(BASE_URL);

        MainPage main = new MainPage(getDriver());
        main.clickBrowseLanguagesMenu();

        AbcPage abc = new AbcPage(getDriver());
        abc.clickJSubmenu();

        JPage j = new JPage(getDriver());
        j.clickLinkLanguageJava3();

        LanguageJava3Page java = new LanguageJava3Page(getDriver());

        List<WebElement> javaVersions = java.getAlternativeVersions();
        javaVersions.add(java.getMainVersion());

        Assert.assertEquals(javaVersions.size(), 6);
    }

    @Test
    public void testVerifyText () {

        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getImpressumSubmenuText(), "Privacy");
    }

    @Test
    public void testVerifyLinkText() {

        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());
        startPage.clickImpressumSubmenu();

        ImpressumPage impressumPage = new ImpressumPage(getDriver());

        Assert.assertTrue(getDriver().getCurrentUrl().contains("impressum.html"));
        Assert.assertEquals(impressumPage.getH2HeaderText(), "Privacy");



    }
}
