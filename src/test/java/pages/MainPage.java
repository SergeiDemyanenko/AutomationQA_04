package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private WebDriver driver;

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
    private final By FOOTER_BROWSE_LANGUAGES = By.xpath("//p/a[@href='/abc.html']");
    private final By ONLOAD_SETTINGS = By.xpath("//body[@onload]");

    public MainPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    public WebElement getH1Header() {

        return getDriver().findElement(H1_HEADER);
    }

    public String getH1HeaderText() {

        return getText(getH1Header());
    }

    public WebElement getFooterBar() {

        return getDriver().findElement(FOOTER_BAR);
    }

    public String getFooterBarText() {

        return getText(getFooterBar());
    }

    public WebElement getBrowseLanguagesMenu() {

        return getDriver().findElement(ABC_MENU);
    }

    public void clickBrowseLanguagesMenu() {

        getBrowseLanguagesMenu().click();
    }

    public WebElement getSubmitNewLanguageMenu() {

        return getDriver().findElement(SUBMIT_NEW_LANGUAGE_MENU);
    }

    public String getSubmitNewLanguageMenuText() {

        return getText(getSubmitNewLanguageMenu());
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2HeaderText() {

        return getText(getH2Header());
    }

    public WebElement getSearchMenu() {

        return getDriver().findElement(SEARCH_MENU);
    }

    public String getSearchMenuText() {

        return getText(getSearchMenu());
    }

    public void clickSearchMenu() {

        getSearchMenu().click();
    }

    public void clickSubmitNewLanguageMenu() {

        getSubmitNewLanguageMenu().click();
    }

    public WebElement getFooterSearch() {

        return getDriver().findElement(FOOTER_SEARCH);
    }

    public String getFooterSearchText() {

        return getText(getFooterSearch());
    }

    public WebElement getStartMenu() {

        return getDriver().findElement(START_MENU);
    }

    public void clickStartMenu(){

        getStartMenu().click();
    }

    public WebElement getTopListMenu(){

        return getDriver().findElement(TOP_LIST_MENU);
    }

    public void clickTopListMenu(){

        getTopListMenu().click();
    }

    public WebElement getGuestbookV2Menu() {

        return getDriver().findElement(GUESTBOOK_V2_MENU);
    }

    public void clickGuestbookV2Menu(){

        getGuestbookV2Menu().click();
    }

    public WebElement getFooterSubmitNewLanguage() {

        return getDriver().findElement(FOOTER_SUBMIT_NEW_LANGUAGE);
    }

    public void clickFooterSubmitNewLanguage(){

        getFooterSubmitNewLanguage().click();
    }

    public void clickFooterSearchButton(){
        getFooterSearch().click();
    }
    public WebElement getFooterBrowseLanguage() {

        return getDriver().findElement(FOOTER_BROWSE_LANGUAGES);
    }
    public void clickFooterBrowseLanguage(){
        getFooterBrowseLanguage().click();
    }

    public WebElement getOnloadSettings() {

        return getDriver().findElement(ONLOAD_SETTINGS);
    }
}