package tests.start;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import static runner.TestUtils.createBasicCode;

public class InfoTest extends BaseTest {

    @Test
    public void testCodeOfBasicOnInfoPage() {

        String expectedCodeOfBasicOnInfoPage = createBasicCode();

        String actualCodeOfBasicOnInfoPage =
                openBaseURL()
                        .clickStartMenu()
                        .clickInfoSubmenu()
                        .getCodeOfLanguageBasic();

        Assert.assertEquals(actualCodeOfBasicOnInfoPage, expectedCodeOfBasicOnInfoPage);
    }
}
