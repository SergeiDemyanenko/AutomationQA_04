package tests.start;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import static runner.TestUtils.createBasicCode;

public class InfoTest extends BaseTest {

    @Test
    public void testCodeOfBasicOnInfoPage() {
        final String LANG_VERSION = "REM BASIC";

        String expectedCodeOfBasicOnInfoPage = createBasicCode();

        String actualCodeOfBasicOnInfoPage =
                openBaseURL()
                        .clickStartMenu()
                        .clickHistorySubmenu()
                        .getLanguageBasicCode(LANG_VERSION);

        Assert.assertEquals(actualCodeOfBasicOnInfoPage, expectedCodeOfBasicOnInfoPage);
    }

    @Test
    public void testH2HeaderText() {
        final String expectedH2HeaderText = "History";

        String actualH2HeaderText= openBaseURL()
                .clickStartMenu()
                .clickHistorySubmenu()
                .getH2MainText();

        Assert.assertEquals(actualH2HeaderText,expectedH2HeaderText);
    }
}
