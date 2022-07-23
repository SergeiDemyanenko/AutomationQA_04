package tests.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.languages.AlphaBetaPage;
import runner.BaseTest;

public class AlphaBetaTest extends BaseTest {

    @Test
    public void testNavigationAlphaBetaPage() {

        openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickASubmenu()
                .clickAlphaBeta();

        String oldURL = getDriver().getCurrentUrl();
        AlphaBetaPage diggIcon = new AlphaBetaPage(getDriver());
        diggIcon.clickDiiggIcon();
        String newURL = getDriver().getCurrentUrl();

        Assert.assertNotEquals(oldURL, newURL);
    }
}
