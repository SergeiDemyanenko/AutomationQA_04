package tests.browse_languages.letters;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.languages.A_Page;
import runner.BaseTest;

public class ATest extends BaseTest {

    @Test
    public void testASubmenuTitle()  {
        String expectedASubmenuTitle = "A";

        String actualASubmenuTitle =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .getASubmenuText();

        Assert.assertEquals(actualASubmenuTitle, expectedASubmenuTitle);
    }

    @Test
    public void testRedditIconText(){
        String expectedResult = "Log in";

        openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickASubmenu();

        A_Page a_page = new A_Page(getDriver());
        a_page.clickALink();
        a_page.clickRedditIcon();
        String actualResult = a_page.getH1RedditIconText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
