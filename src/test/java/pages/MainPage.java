package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.AbcPage;
import pages.guestbook.GuestbookV2Page;
import pages.search_languages.SearchPage;
import pages.start.StartPage;
import pages.submit_new_language.SubmitNewLanguagePage;
import pages.top_lists.TopListPage;

public class MainPage extends BasePage {

    private final By H1_HEADER = By.xpath("//div[@id='header']/h1");
    private final By H2_HEADER = By.xpath("//div[@id='header']/h2");
    private final By ABC_MENU = By.xpath("//ul[@id='menu']//a[@href='/abc.html']");
    private final By SUBMIT_NEW_LANGUAGE_MENU = By.xpath("//ul[@id='menu']//a[@href='/submitnewlanguage.html']");
    private final By SEARCH_MENU = By.xpath("//ul[@id='menu']//a[@href='/search.html']");
    private final By START_MENU = By.xpath("//ul[@id='menu']/li/a[@href='/']");
    private final By TOP_LIST_MENU =  By.xpath("//ul[@id='menu']//a[@href='/toplist.html']");
    private final By GUESTBOOK_V2_MENU = By.xpath("//ul[@id='menu']//a[@href='/guestbookv2.html']");
    private final By FOOTER_BAR = By.id("footer");
    private final By FOOTER_SUBMIT_NEW_LANGUAGE = By.xpath("//div[@id='footer']//a[@href='/submitnewlanguage.html']");
    private final By FOOTER_SEARCH = By.xpath("//div[@id='footer']/p/a[@href='/search.html']");
    private final By FOOTER_TOP_LIST = By.xpath("//p/a[@href='/toplist.html']");
    private final By FOOTER_BROWSE_LANGUAGES = By.xpath("//p/a[@href='/abc.html']");
    private final By ONLOAD_SETTINGS = By.xpath("//body[@onload]");

    public MainPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getH1Header() {

        return getDriver().findElement(H1_HEADER);
    }

    public WebElement getFooterBar() {

        return getDriver().findElement(FOOTER_BAR);
    }

    public WebElement getBrowseLanguagesMenu() {

        return getDriver().findElement(ABC_MENU);
    }

    public WebElement getSubmitNewLanguageMenu() {

        return getDriver().findElement(SUBMIT_NEW_LANGUAGE_MENU);
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public WebElement getSearchMenu() {

        return getDriver().findElement(SEARCH_MENU);
    }

    public WebElement getFooterSearch() {

        return getDriver().findElement(FOOTER_SEARCH);
    }

    public WebElement getStartMenu() {

        return getDriver().findElement(START_MENU);
    }

    public WebElement getTopListMenu(){

        return getDriver().findElement(TOP_LIST_MENU);
    }

    public WebElement getGuestbookV2Menu() {

        return getDriver().findElement(GUESTBOOK_V2_MENU);
    }

    public WebElement getFooterSubmitNewLanguage() {

        return getDriver().findElement(FOOTER_SUBMIT_NEW_LANGUAGE);
    }

    public WebElement getFooterBrowseLanguage() {

        return getDriver().findElement(FOOTER_BROWSE_LANGUAGES);
    }

    public WebElement getFooterTopList(){

        return getDriver().findElement(FOOTER_TOP_LIST);
    }

    public WebElement getOnloadSettings() {

        return getDriver().findElement(ONLOAD_SETTINGS);
    }

    public String getH1HeaderText() {

        return getText(getH1Header());
    }

    public String getSearchMenuText() {

        return getText(getSearchMenu());
    }

    public String getFooterBarText() {

        return getText(getFooterBar());
    }

    public String getSubmitNewLanguageMenuText() {

        return getText(getSubmitNewLanguageMenu());
    }

    public String getH2HeaderText() {

        return getText(getH2Header());
    }

    public String getFooterSearchText() {

        return getText(getFooterSearch());
    }

    public AbcPage clickBrowseLanguagesMenu() {
        getBrowseLanguagesMenu().click();

        return new AbcPage(getDriver());
    }

    public SearchPage clickSearchMenu() {
        getSearchMenu().click();

        return new SearchPage(getDriver());
    }

    public SubmitNewLanguagePage clickSubmitNewLanguageMenu() {
        getSubmitNewLanguageMenu().click();

        return new SubmitNewLanguagePage(getDriver());
    }

    public StartPage clickStartMenu(){
        getStartMenu().click();

        return new StartPage(getDriver());
    }

    public TopListPage clickTopListMenu(){

        getTopListMenu().click();

        return new TopListPage(getDriver());
    }

    public GuestbookV2Page clickGuestbookV2Menu(){
        getGuestbookV2Menu().click();

        return new GuestbookV2Page(getDriver());
    }

    public SubmitNewLanguagePage clickFooterSubmitNewLanguage() {
        getFooterSubmitNewLanguage().click();

        return new SubmitNewLanguagePage(getDriver());
    }

    public SearchPage clickFooterSearchButton(){
        getFooterSearch().click();

        return new SearchPage(getDriver());
    }

    public AbcPage clickFooterBrowseLanguage(){
        getFooterBrowseLanguage().click();

        return new AbcPage(getDriver());
    }

    public TopListPage clickFooterTopList(){
        getFooterTopList().click();

        return new TopListPage(getDriver());
    }

    public String  getAttributeSearchMenu() {

        return getSearchMenu().getAttribute("href");
    }

    public String  getAttributeFooterSearch() {

        return getFooterSearch().getAttribute("href");
    }
}