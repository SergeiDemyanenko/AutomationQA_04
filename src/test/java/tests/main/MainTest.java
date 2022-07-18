package tests.main;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class MainTest extends BaseTest {

    @Test
    public void testH1HeaderText() {
        final String expectedH1HeaderText = "99 Bottles of Beer";

        String actualH1HeaderText =
                openBaseURL()
                        .getH1HeaderText();

        Assert.assertEquals(actualH1HeaderText, expectedH1HeaderText);
    }

    @Test
    public void testH2HeaderText() {
        final String expectedH2HeaderText = "one program in 1500 variations";

        String actualH2HeaderText =
                openBaseURL()
                        .getH2HeaderText();

        Assert.assertEquals(actualH2HeaderText, expectedH2HeaderText);
    }

    @Test
    public void testOnloadSettings() {
        final String expectedOnloadSettings = "off('addcomments');";

        String actualOnloadSettings =
                openBaseURL()
                        .getOnloadSettings()
                        .getAttribute("onload");

        Assert.assertEquals(actualOnloadSettings, expectedOnloadSettings);
    }
}
