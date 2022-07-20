package tests.guestbook;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class GuestbookV2Test extends BaseTest {

    @Test
    public void testVerifyLinkTextGuestbookV2Page() {

        final String expectedResultResNum = "2";

        String actualResultVerifyLinkTextGuestbookV2Page =
                openBaseURL()
                        .clickGuestbookV2Menu()
                        .getPage2Text();

        Assert.assertEquals(actualResultVerifyLinkTextGuestbookV2Page, expectedResultResNum);
    }

    @Test
    public void testVerifyH2Menu() {

        final String expectedResultH2Menu = "Guestbook";

        String actualResultH2Menu =
                openBaseURL()
                .clickGuestbookV2Menu()
                        .clickPageLast()
                .getH2MainText();

        Assert.assertEquals(actualResultH2Menu,expectedResultH2Menu);
    }

    @Test
    public void testVerifyColorOfH2Menu() {

        final String expectedResultColorOfH2Menu = "rgba(27, 101, 28, 1)";

        String actualResulColorOftH2Menu =
                openBaseURL()
                        .clickGuestbookV2Menu()
                        .clickPageLast()
                        .getH2MainColor();

        Assert.assertEquals(actualResulColorOftH2Menu,expectedResultColorOfH2Menu);
    }
    @Test
    public void testVerifyFontWeightOfH2Menu() {

        final String expectedResultFontWeightOfH2Menu = "700";

        String actualResultFontWeightOfH2Menu =
                openBaseURL()
                        .clickGuestbookV2Menu()
                        .clickPageLast()
                        .getH2MainFont_Weight();

        Assert.assertEquals(actualResultFontWeightOfH2Menu,expectedResultFontWeightOfH2Menu);
    }
}
