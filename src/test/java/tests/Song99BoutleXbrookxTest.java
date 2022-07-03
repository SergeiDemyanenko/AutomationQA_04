package tests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import pages.browse_languages.AbcPage;
import pages.browse_languages.languages.LanguageJava3Page;
import pages.browse_languages.letters.JPage;
import pages.start.ImpressumPage;
import pages.start.StartPage;
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

    @Test
    public void testVerifyH2TextDPage () {

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickBrowseLanguagesMenu();

        AbcPage abcPage = new AbcPage(getDriver());
        abcPage.clickDSubmenu();

        DPage dPage = new DPage(getDriver());

        Assert.assertEquals(dPage.getH2HeaderText(), "Category D");
    }

    @Test
    public void testVerifyDescriptionTextDPage () {

        getDriver().get(BASE_URL);

        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickBrowseLanguagesMenu();

        AbcPage abcPage = new AbcPage(getDriver());
        abcPage.clickDSubmenu();

        DPage dPage = new DPage(getDriver());

        Assert.assertEquals(dPage.getDescriptionText(),
                "All languages starting with the letter D are shown, sorted by Language.");
    }
}
