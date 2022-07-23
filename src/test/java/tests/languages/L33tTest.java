package tests.languages;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.util.List;

public class L33tTest extends BaseTest {

    @Test
    public void testDownloadSourceLanguageL33t() {
        final List<String> expectedDownloadSourceLinksText = List.of(
                "Download Source",
                "Download Source"
        );

        List<String> actualDownloadSourceLinksText =
                openBaseURL()
                        .clickBrowseLanguagesMenu()
                        .clickLSubmenu()
                        .clickLanguageL33t()
                        .getDownloadSourceLinksText();

        Assert.assertEquals(actualDownloadSourceLinksText, expectedDownloadSourceLinksText);
    }
}
