package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopListPage {

    private WebDriver driver;

    private final By TOP_LIST_REAL_SUBMENU = By.linkText("Top Rated Real");
    private final By TOP_LIST_ESOTERIC_SUBMENU = By.xpath("//a[@href='./toplist_esoteric.html']");
    private final By TOP_LIST_ASSEMBLY_SUBMENU = By.xpath("//a[@href='./toplist_assembly.html']");
    private final By TOPHITS_SUBMENU = By.xpath("//a[@href='./tophits.html']");
    private final By NEW_LANGUAGES_THIS_MONTH_SUBMENU = By.xpath("//a[@href='./toplist_newlanguagesthismonth.html']");
    private final By NEW_COMMENTS_SUBMENU = By.linkText("New Comments");
    private final By ALL_LANGUAGES_IN_THE_TABLE_TOP_LIST_REAL_SUBMENU = By.xpath("//tbody/tr/td/a");

    public TopListPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }
    protected WebDriver getDriver() {

        return driver;
    }

    public void clickSubmenu(WebElement element) {
        element.click();
    }
    public WebElement getTopListRealSubmenu() {

        return getDriver().findElement(TOP_LIST_REAL_SUBMENU);
    }

    public void clickTopListRealSubmenu() {

        clickSubmenu(getTopListRealSubmenu());
    }

    public WebElement getTopListEsotericSubmenu() {

        return getDriver().findElement(TOP_LIST_ESOTERIC_SUBMENU);
    }

    public void clickTopListEsotericSubmenu() {

        getTopListEsotericSubmenu().click();
    }

    public WebElement getTopListAssemblySubmenu() {

        return getDriver().findElement(TOP_LIST_ASSEMBLY_SUBMENU);
    }

    public void clickTopListAssemblySubmenu() {

        getTopListAssemblySubmenu().click();
    }

    public WebElement getTopHitsSubmenu() {

        return getDriver().findElement(TOPHITS_SUBMENU);
    }

    public void clickTopHitsSubmenu() {

        getTopHitsSubmenu().click();
    }

    public String getTextTopHitsSubmenu() {
        
        return getTopHitsSubmenu().getText();
    }

    public WebElement getNewLanguagesThisMonthSubmenu() {

        return getDriver().findElement(NEW_LANGUAGES_THIS_MONTH_SUBMENU);
    }

    public void clickNewLanguagesThisMonthSubmenu() {

        getNewLanguagesThisMonthSubmenu().click();
    }

    public WebElement getNewCommentsSubmenu() {

        return getDriver().findElement(NEW_COMMENTS_SUBMENU);
    }

    public void clickNewCommentsSubmenu() {

        getNewCommentsSubmenu().click();
    }
}