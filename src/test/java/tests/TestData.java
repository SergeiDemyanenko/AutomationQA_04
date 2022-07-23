package tests;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "MainPageTestData")
    public static Object[][] mainDataProvider() {

        return new Object[][]{
                {0, "Start", "http://www.99-bottles-of-beer.net/", "Start"},
                {1, "Browse Languages", "http://www.99-bottles-of-beer.net/abc.html", "Browse category A"},
                {2, "Search Languages", "http://www.99-bottles-of-beer.net/search.html", "Search Languages"},
                {3, "Top Lists", "http://www.99-bottles-of-beer.net/toplist.html", "Top Rated"},
                {4, "Guestbook", "http://www.99-bottles-of-beer.net/guestbookv2.html", "Guestbook"},
                {5, "Submit new Language", "http://www.99-bottles-of-beer.net/submitnewlanguage.html", "Submit new Language"}
        };
    }
}
