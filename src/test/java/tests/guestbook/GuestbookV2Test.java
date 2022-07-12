package tests.guestbook;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class GuestbookV2Test extends BaseTest {

    @Test
    public void testVerifyLinkTextGuestbookV2Page() {

        String expecResNum = "2";

        String actuallVerifyLinkTextGuestbookV2Page =
                         openBaseURL()
                        .clickGuestbookV2Menu()
                        .getPage2Text();

        Assert.assertEquals(actuallVerifyLinkTextGuestbookV2Page,expecResNum);
    }
}
