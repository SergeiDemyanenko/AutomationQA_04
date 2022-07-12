package tests.browse_languages.letters;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

@Test
public class ITest extends BaseTest {

    public void testIPageLanguagesCount() {

        final int expectedResult = 44;

        int actualResult = openBaseURL().
                clickBrowseLanguagesMenu().
                clickISubmenu().
                getNumberOfLanguages();

        Assert.assertEquals(actualResult, expectedResult);
    }
}