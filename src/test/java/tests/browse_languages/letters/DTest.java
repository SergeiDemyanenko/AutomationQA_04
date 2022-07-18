package tests.browse_languages.letters;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class DTest extends BaseTest {

    @Test
    public void testH2Text () {

       String actualH2Text = openBaseURL()
                .clickBrowseLanguagesMenu()
                .clickDSubmenu()
                .getH2MainText();

        Assert.assertEquals(actualH2Text, "Category D");
    }
}
