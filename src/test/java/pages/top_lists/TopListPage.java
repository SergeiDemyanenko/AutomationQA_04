package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.languages.LanguagesPage;

import java.util.ArrayList;
import java.util.List;

public class TopListPage extends _TopPage<LanguagesPage> {

    private final By H2_TABLE_NAME_TOP_LIST = By.xpath("//div[@id='main']/h2");
    private final By TOP_LIST_REAL_SUBMENU = By.linkText("Top Rated Real");
    private final By TOP_LIST_ESOTERIC_SUBMENU = By.xpath("//a[@href='./toplist_esoteric.html']");
    private final By TOP_LIST_ASSEMBLY_SUBMENU = By.xpath("//a[@href='./toplist_assembly.html']");
    private final By TOPHITS_SUBMENU = By.xpath("//a[@href='./tophits.html']");
    private final By NEW_LANGUAGES_THIS_MONTH_SUBMENU = By.xpath("//a[@href='./toplist_newlanguagesthismonth.html']");
    private final By NEW_COMMENTS_SUBMENU = By.linkText("New Comments");
    private final By ALL_LANGUAGES_IN_THE_TABLE_TOP_LIST_SUBMENU = By.xpath("//tbody/tr/td/a");

    public TopListPage(WebDriver driver) {

       super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return null;
    }

    public WebElement getTopListRealSubmenu() {

        return getDriver().findElement(TOP_LIST_REAL_SUBMENU);
    }

    public WebElement getH2TableNameTopList() {

        return getDriver().findElement(H2_TABLE_NAME_TOP_LIST);
    }

    public TopListRealPage clickTopListRealSubmenu() {

        getTopListRealSubmenu().click();

        return new TopListRealPage(getDriver());
    }

    public WebElement getTopListEsotericSubmenu() {

        return getDriver().findElement(TOP_LIST_ESOTERIC_SUBMENU);
    }

    public TopListEsotericPage clickTopListEsotericSubmenu() {

        getTopListEsotericSubmenu().click();

        return new TopListEsotericPage(getDriver());
    }

    public WebElement getTopListAssemblySubmenu() {

        return getDriver().findElement(TOP_LIST_ASSEMBLY_SUBMENU);
    }

    public TopListAssemblyPage clickTopListAssemblySubmenu() {

        getTopListAssemblySubmenu().click();

        return new TopListAssemblyPage(getDriver());
    }

    public WebElement getTopHitsSubmenu() {

        return getDriver().findElement(TOPHITS_SUBMENU);
    }

    public TopListTopHitsPage clickTopHitsSubmenu() {

        getTopHitsSubmenu().click();

        return new TopListTopHitsPage(getDriver());
    }

    public String getTextTopHitsSubmenu() {

        return getText(getTopHitsSubmenu());
    }

    public WebElement getNewLanguagesThisMonthSubmenu() {

        return getDriver().findElement(NEW_LANGUAGES_THIS_MONTH_SUBMENU);
    }

    public TopListNewLanguagesThisMonthPage clickNewLanguagesThisMonthSubmenu() {

        getNewLanguagesThisMonthSubmenu().click();

        return new TopListNewLanguagesThisMonthPage(getDriver());
    }

    public WebElement getNewCommentsSubmenu() {

        return getDriver().findElement(NEW_COMMENTS_SUBMENU);
    }

    public NewCommentsPage clickNewCommentsSubmenu() {

        getNewCommentsSubmenu().click();

        return new NewCommentsPage(getDriver());
    }

    public Integer getCountTableLinks() {

        List<WebElement> countLanguages = getDriver()
                .findElements(ALL_LANGUAGES_IN_THE_TABLE_TOP_LIST_SUBMENU);
        return countLanguages.size();
    }

    public List<String> getAllTableLinks() {

        List<WebElement> links
                = getDriver()
                .findElements(ALL_LANGUAGES_IN_THE_TABLE_TOP_LIST_SUBMENU);

        List<String> textOfLinks = new ArrayList<>();

        for (WebElement n : links) {
            textOfLinks.add(n.getText());
        }
        return textOfLinks;
    }

    public String getTextH2Header() {

        return getText(getH2TableNameTopList());
    }
}