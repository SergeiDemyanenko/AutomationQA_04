package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseTablePage;

public abstract class BaseTopListPage<LangPage> extends BaseTablePage<LangPage> {

    private final String SUBMENU_BASE_PATH = "//ul[@id='submenu']/li/a[@href=";
    private final By TOP_LIST_REAL_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'./toplist_real.html']");
    private final By TOP_LIST_ESOTERIC_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'./toplist_esoteric.html']");
    private final By TOP_LIST_ASSEMBLY_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'./toplist_assembly.html']");
    private final By TOPHITS_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'./tophits.html']");
    private final By NEW_LANGUAGES_THIS_MONTH_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'./toplist_newlanguagesthismonth.html']");
    private final By NEW_COMMENTS_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'./newcomments.html']");

    private final By H2_MAIN = By.xpath("//div[@id='main']/h2");

    public BaseTopListPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getTopListRealSubmenu() {

        return getDriver().findElement(TOP_LIST_REAL_SUBMENU);
    }

    public WebElement getTopListEsotericSubmenu() {

        return getDriver().findElement(TOP_LIST_ESOTERIC_SUBMENU);
    }

    public WebElement getTopListAssemblySubmenu() {

        return getDriver().findElement(TOP_LIST_ASSEMBLY_SUBMENU);
    }

    public WebElement getTopHitsSubmenu() {

        return getDriver().findElement(TOPHITS_SUBMENU);
    }

    public WebElement getNewLanguagesThisMonthSubmenu() {

        return getDriver().findElement(NEW_LANGUAGES_THIS_MONTH_SUBMENU);
    }

    public WebElement getNewCommentsSubmenu() {

        return getDriver().findElement(NEW_COMMENTS_SUBMENU);
    }

    public WebElement getH2Main() {

        return getDriver().findElement(H2_MAIN);
    }

    public String getH2MainText() {

        return getText(getH2Main());
    }

    public String getTextTopHitsSubmenu() {

        return getText(getTopHitsSubmenu());
    }

    public TopListRealPage clickTopListRealSubmenu() {

        getTopListRealSubmenu().click();

        return new TopListRealPage(getDriver());
    }

    public TopListEsotericPage clickTopListEsotericSubmenu() {

        getTopListEsotericSubmenu().click();

        return new TopListEsotericPage(getDriver());
    }

    public TopListAssemblyPage clickTopListAssemblySubmenu() {

        getTopListAssemblySubmenu().click();

        return new TopListAssemblyPage(getDriver());
    }

    public TopListTopHitsPage clickTopHitsSubmenu() {

        getTopHitsSubmenu().click();

        return new TopListTopHitsPage(getDriver());
    }

    public TopListNewLanguagesThisMonthPage clickNewLanguagesThisMonthSubmenu() {

        getNewLanguagesThisMonthSubmenu().click();

        return new TopListNewLanguagesThisMonthPage(getDriver());
    }

    public NewCommentsPage clickNewCommentsSubmenu() {

        getNewCommentsSubmenu().click();

        return new NewCommentsPage(getDriver());
    }
}