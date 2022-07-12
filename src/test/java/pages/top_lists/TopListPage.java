package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class TopListPage extends BasePage {

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

    public void clickSubmenu(WebElement element) {
        element.click();
    }

    public WebElement getTopListRealSubmenu() {

        return getDriver().findElement(TOP_LIST_REAL_SUBMENU);
    }

    public TopListRealPage clickTopListRealSubmenu() {

        clickSubmenu(getTopListRealSubmenu());

        return new TopListRealPage(getDriver());
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

    public TopListTopHitsPage clickTopHitsSubmenu() {
        getTopHitsSubmenu().click();

        return new TopListTopHitsPage(getDriver());
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

    public String getNameH2HeaderTopList() {

        return getDriver().findElement(H2_TABLE_NAME_TOP_LIST).getText();
    }
}