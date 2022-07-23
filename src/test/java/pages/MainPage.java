package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.letters.AbcPage;
import pages.guestbook.GuestbookV2Page;
import pages.search_languages.SearchPage;
import pages.start.StartPage;
import pages.submit_new_language.SubmitNewLanguagePage;
import pages.top_lists.TopListPage;

import java.util.List;

public abstract class MainPage extends BasePage {

    private final By ONLOAD_SETTINGS = By.xpath("//body[@onload]");
    private final By H1_HEADER = By.xpath("//div[@id='header']/h1");
    private final By H2_HEADER = By.xpath("//div[@id='header']/h2");

    private final String MENU_BASE_PATH = "//ul[@id='menu']/li/a[@href=";
    private final By START_MENU = By.xpath(MENU_BASE_PATH + "'/']");
    private final By ABC_MENU = By.xpath(MENU_BASE_PATH + "'/abc.html']");
    private final By SEARCH_MENU = By.xpath(MENU_BASE_PATH + "'/search.html']");
    private final By TOP_LIST_MENU =  By.xpath(MENU_BASE_PATH + "'/toplist.html']");
    private final By GUESTBOOK_V2_MENU = By.xpath(MENU_BASE_PATH + "'/guestbookv2.html']");
    private final By SUBMIT_NEW_LANGUAGE_MENU = By.xpath(MENU_BASE_PATH + "'/submitnewlanguage.html']");

    private final String FOOTER_BASE_PATH = "//div[@id='footer']/p/a[@href=";
    private final By FOOTER_START = By.xpath(FOOTER_BASE_PATH + "'/']");
    private final By FOOTER_ABC = By.xpath(FOOTER_BASE_PATH + "'/abc.html']");
    private final By FOOTER_SEARCH = By.xpath(FOOTER_BASE_PATH + "'/search.html']");
    private final By FOOTER_TOP_LIST = By.xpath(FOOTER_BASE_PATH + "'/toplist.html']");
    private final By FOOTER_GUESTBOOK_V2 = By.xpath(FOOTER_BASE_PATH + "'/guestbookv2.html']");
    private final By FOOTER_SUBMIT_NEW_LANGUAGE = By.xpath(FOOTER_BASE_PATH + "'/submitnewlanguage.html']");
    private final By FOOTER_BAR = By.id("footer");
    private final By FOOTER_ALL = By.xpath("//div[@id='footer']/p/a");

    public MainPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getOnloadSettings() {

        return getDriver().findElement(ONLOAD_SETTINGS);
    }

    public WebElement getH1Header() {

        return getDriver().findElement(H1_HEADER);
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public WebElement getStartMenu() {

        return getDriver().findElement(START_MENU);
    }

    public WebElement getABCMenu() {

        return getDriver().findElement(ABC_MENU);
    }

    public WebElement getSearchMenu() {

        return getDriver().findElement(SEARCH_MENU);
    }

    public WebElement getTopListMenu(){

        return getDriver().findElement(TOP_LIST_MENU);
    }

    public WebElement getGuestbookV2Menu() {

        return getDriver().findElement(GUESTBOOK_V2_MENU);
    }

    public WebElement getSubmitNewLanguageMenu() {

        return getDriver().findElement(SUBMIT_NEW_LANGUAGE_MENU);
    }

    public WebElement getFooterStart() {

        return getDriver().findElement(FOOTER_START);
    }

    public WebElement getFooterABC() {

        return getDriver().findElement(FOOTER_ABC);
    }

    public WebElement getFooterSearch() {

        return getDriver().findElement(FOOTER_SEARCH);
    }

    public WebElement getFooterTopList(){

        return getDriver().findElement(FOOTER_TOP_LIST);
    }

    public WebElement getFooterGuestbookV2(){

        return getDriver().findElement(FOOTER_GUESTBOOK_V2);
    }

    public WebElement getFooterSubmitNewLanguage() {

        return getDriver().findElement(FOOTER_SUBMIT_NEW_LANGUAGE);
    }

    public WebElement getFooterBar() {

        return getDriver().findElement(FOOTER_BAR);
    }

    public List<WebElement> getFooterAll() {

        return getDriver().findElements(FOOTER_ALL);
    }

    public String getH1HeaderText() {

        return getText(getH1Header());
    }

    public String getH2HeaderText() {

        return getText(getH2Header());
    }

    public String getSearchMenuText() {

        return getText(getSearchMenu());
    }

    public String getSubmitNewLanguageMenuText() {

        return getText(getSubmitNewLanguageMenu());
    }

    public String getFooterSearchText() {

        return getText(getFooterSearch());
    }

    public String getFooterBarText() {

        return getText(getFooterBar());
    }

    public String getFullLinkSearchLanguagesMenu() {

        return getSearchMenu().getAttribute("href");
    }

    public String getFullLinkFooterSearchLanguages() {

        return getFooterSearch().getAttribute("href");
    }

    public StartPage clickStartMenu() {
        getStartMenu().click();

        return new StartPage(getDriver());
    }

    public AbcPage clickBrowseLanguagesMenu() {
        getABCMenu().click();

        return new AbcPage(getDriver());
    }

    public SearchPage clickSearchLanguagesMenu() {
        getSearchMenu().click();

        return new SearchPage(getDriver());
    }

    public TopListPage clickTopListsMenu(){

        getTopListMenu().click();

        return new TopListPage(getDriver());
    }

    public GuestbookV2Page clickGuestbookV2Menu(){
        getGuestbookV2Menu().click();

        return new GuestbookV2Page (getDriver());
    }

    public SubmitNewLanguagePage clickSubmitNewLanguageMenu() {
        getSubmitNewLanguageMenu().click();

        return new SubmitNewLanguagePage(getDriver());
    }

    public AbcPage clickFooterBrowseLanguages(){
        getFooterABC().click();

        return new AbcPage(getDriver());
    }

    public SearchPage clickFooterSearchLanguages(){
        getFooterSearch().click();

        return new SearchPage(getDriver());
    }

    public TopListPage clickFooterTopLists(){
        getFooterTopList().click();

        return new TopListPage(getDriver());
    }

    public SubmitNewLanguagePage clickFooterSubmitNewLanguage() {
        getFooterSubmitNewLanguage().click();

        return new SubmitNewLanguagePage(getDriver());
    }

    public void clickLink(int index) {
        getFooterAll().get(index).click();
    }
}