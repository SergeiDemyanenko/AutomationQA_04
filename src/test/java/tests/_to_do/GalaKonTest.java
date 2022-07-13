package tests._to_do;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import pages.browse_languages.AbcPage;
import pages.browse_languages.languages.LanguageJava3Page;
import pages.browse_languages.languages.LanguageMathematicaPage;
import pages.browse_languages.letters.JPage;
import pages.browse_languages.letters.MPage;
import pages.start.StartPage;
import pages.start.TeamPage;
import runner.BaseTest;

public class GalaKonTest extends BaseTest {

    private static final String BASE_URL = "http://www.99-bottles-of-beer.net/";

    @Test
    public void testTheNameOfMathematicaLanguageAuthor() {

        String expectedTheNameOfMathematicaLanguageAuthor = "Brenton Bostick";

        String actualTheNameOfMathematicaLanguageAuthor = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickMSubmenu()
                .clickMathematicaPage()
                .getBrentonBostickText();

        Assert.assertEquals(expectedTheNameOfMathematicaLanguageAuthor, actualTheNameOfMathematicaLanguageAuthor);
    }

    @Test
    public void testJavaObjectOrientedVersionHasTheLargestNumberOfComments() {
        int expectedObjectOrientedVersionHasTheLargestNumberOfComments = 33;

        Assert.assertEquals(expectedObjectOrientedVersionHasTheLargestNumberOfComments, openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickJSubmenu()
                .clickLinkLanguageJava3()
                .getCountOfCommentsHeaders());
    }

    @Test
    public void testBrowseLanguagesSubmenuText() {

        String expectedBrowseLanguagesSubmenuText = "0-9ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Assert.assertEquals(expectedBrowseLanguagesSubmenuText, openBaseURL()
                .clickBrowseLanguagesMenu()
                .getSubmenu()
                .getText());
    }

    @Test
    public void testTwoImagesOfTeamMembers() {
        int expectedTwoImagesOfTeamMembers = 2;

        Assert.assertEquals(openBaseURL()
                .clickStartMenu()
                .clickTeamSubmenu()
                .getAmmountOfImages(), expectedTwoImagesOfTeamMembers);
    }
}
