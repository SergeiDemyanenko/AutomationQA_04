package tests.start;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class ImpressumTest extends BaseTest {
    @Test
    public void testImpressumLinkText() {

       String actualImpressumLinkText =
               openBaseURL()
                       .clickPrivacySubmenu()
                       .getH2MainText();

       Assert.assertEquals(actualImpressumLinkText, "Privacy");
    }
}
