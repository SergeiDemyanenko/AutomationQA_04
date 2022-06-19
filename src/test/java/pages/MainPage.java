package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private WebDriver driver;

    private final By H1_HEADER = By.xpath("//div[@id='header']/h1");
    private final By H2_HEADER = By.xpath("//div[@id='header']/h2");
    private final By FOOTER_MENU_BAR = By.xpath("//div[@id='footer']");
    private final By BROWSE_LANGUAGES_MENU = By.xpath("//ul[@id='menu']//a[@href='/abc.html']");
    private final By SUBMIT_NEW_LANGUAGE = By.xpath("//ul/li/a[@href='/submitnewlanguage.html']");
    private final By SUBMIT_SEARCH_LANGUAGES = By.xpath("//ul[@id='menu']//a[@href='/search.html']");
    private final By FOOTER_SEARCH_LANGUAGES = By.xpath("//div[@id='footer']/p/a[@href='/search.html']");
    private final By START_MENU = By.xpath("//ul[@id='menu']/li/a[@href='/']");
    private final By TOP_LIST_MENU =  By.xpath("//a[@href='/toplist.html']");

    public MainPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getH1Header() {

        return getDriver().findElement(H1_HEADER);
    }

    public String getH1HeaderText() {

        return getH1Header().getText();
    }

    public WebElement getFooterMenuBar() {

        return getDriver().findElement(FOOTER_MENU_BAR);
    }

    public String getFooterMenuText() {

        return getFooterMenuBar().getText();
    }

    public WebElement getBrowseLanguagesMenu() {

        return getDriver().findElement(BROWSE_LANGUAGES_MENU);
    }

    public void getBrowseLanguagesMenuClick() {
        getBrowseLanguagesMenu().click();
    }

    public WebElement getSubmitNewLanguageMenu() {

        return getDriver().findElement(SUBMIT_NEW_LANGUAGE);
    }

    public String getSubmitNewLanguageMenuText() {

        return getSubmitNewLanguageMenu().getText();
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2HeaderText() {

        return getH2Header().getText();
    }

    public WebElement getSubmitSearchLanguagesMenu() {

        return getDriver().findElement(SUBMIT_SEARCH_LANGUAGES);
    }

    public void getSubmitSearchLanguagesMenuText() {

        getSubmitSearchLanguagesMenu().getText();
    }

    public void getSubmitNewLanguageMenuClick() {

        getSubmitNewLanguageMenu().click();
    }

    public WebElement getFooterSearchLanguagesMenu() {

        return getDriver().findElement(FOOTER_SEARCH_LANGUAGES);
    }

    public void getFooterSearchLanguagesMenuText() {

        getFooterSearchLanguagesMenu().getText();
    }

    public WebElement getStartMenu() {

        return getDriver().findElement(START_MENU);
    }

    public void getStartMenuClick(){

        getStartMenu().click();
    }

    public WebElement getTopListMenu(){

        return getDriver().findElement(TOP_LIST_MENU);
    }

    public void clickTopListMenu(){

        getTopListMenu().click();
    }
}
