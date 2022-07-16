package tests._to_do;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.languages.LanguageJava3Page;
import pages.browse_languages.letters.APage;
import pages.browse_languages.letters.DPage;
import pages.browse_languages.letters.JPage;
import pages.start.ImpressumPage;
import pages.start.StartPage;
import runner.BaseTest;
import java.util.List;

public class Song99BoutleXbrookxTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testConfirmTableWithHeaders() {

        openBaseURL().clickBrowseLanguagesMenu();

        APage a = new APage(getDriver());

        Assert.assertEquals(a.getTitlesTable(), "Language, Author, Date, Comments, Rate");
    }

    @Test
    public void testVerifyCountVersionsJavaLanguages () {

        openBaseURL().clickBrowseLanguagesMenu().clickJSubmenu();

        JPage j = new JPage(getDriver());
        j.clickLinkLanguageJava3();

        LanguageJava3Page java = new LanguageJava3Page(getDriver());

        List<WebElement> javaVersions = java.getAlternativeVersions();
        javaVersions.add(java.getObjectOrientedVersion());

        Assert.assertEquals(javaVersions.size(), 6);
    }

    @Test
    public void testVerifyText () {

        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());

        Assert.assertEquals(startPage.getPrivacySubmenuText(), "Privacy");
    }

    @Test
    public void testVerifyLinkText() {

        getDriver().get(BASE_URL);

        StartPage startPage = new StartPage(getDriver());
        startPage.clickPrivacySubmenu();

        ImpressumPage impressumPage = new ImpressumPage(getDriver());

        Assert.assertTrue(getDriver().getCurrentUrl().contains("impressum.html"));
        Assert.assertEquals(impressumPage.getH2MainText(), "Privacy");
    }

    @Test
    public void testVerifyH2TextDPage () {

        openBaseURL().clickBrowseLanguagesMenu().clickDSubmenu();

        DPage dPage = new DPage(getDriver());

        Assert.assertEquals(dPage.getH2MainText(), "Category D");
    }

    @Test
    public void testVerifyDescriptionTextDPage () {

        openBaseURL().clickBrowseLanguagesMenu().clickDSubmenu();

        DPage dPage = new DPage(getDriver());

        Assert.assertEquals(dPage.getTextPTag(),
                "All languages starting with the letter D are shown, sorted by Language.");
    }
}
