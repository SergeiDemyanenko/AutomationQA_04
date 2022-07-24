package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.search_languages.SearchPage;
import runner.BaseTest;
import runner.CaptureNetworkTraffic;

import java.util.List;

public class APITest extends BaseTest {

    @Test
    public void testRequestBySearchCriteria() {
        final String searchCriteria = "java";

        SearchPage search = openBaseURL()
                .clickSearchLanguagesMenu()
                .enterTextSearchField(searchCriteria);

        CaptureNetworkTraffic cnt = new CaptureNetworkTraffic();

        cnt.setUpDevTool(getDriver());

        List<String> requests = cnt.captureHttpRequests();

        search.clickSubmitSearchButton();

        Assert.assertFalse(requests.size() < 1);
        Assert.assertEquals(requests.get(0), "POST");
        Assert.assertTrue(requests.get(1).contains("http://www.99-bottles-of-beer.net"));
        Assert.assertEquals(requests.get(2), "Optional[search=" + searchCriteria + "&submitsearch=GO]");
        Assert.assertEquals(requests.get(3), "Optional.empty");
    }

    @Test
    public void testResponseBySearchCriteria() {
        final String searchCriteria = "java";

        SearchPage search = openBaseURL()
                .clickSearchLanguagesMenu()
                .enterTextSearchField(searchCriteria);

        CaptureNetworkTraffic cnt = new CaptureNetworkTraffic();

        cnt.setUpDevTool(getDriver());

        List<String> responses = cnt.captureHttpResponses();

        search.clickSubmitSearchButton();

        Assert.assertFalse(responses.size() < 1);
        Assert.assertEquals(responses.get(0), "200");
        Assert.assertEquals(responses.get(1), "OK");
        Assert.assertEquals(responses.get(2), "http://www.99-bottles-of-beer.net/search.html");
    }
}
