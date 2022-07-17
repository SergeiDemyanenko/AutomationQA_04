package tests.browse_languages.letters;


import org.testng.Assert;
import org.testng.annotations.Test;
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
}
