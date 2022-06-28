package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private WebDriver driver;

    private final By SEARCH_MENU = By.xpath("//div[@id='navigation']/ul[@id='menu']/li/a[@href='/search.html']");

    private final By SEARCH_SUBMENU = By.xpath("//ul[@id='submenu']/li/a[@href='./search.html']");

    private final By H2_MAIN =By.xpath("//div[@id='main']/h2");

    private final By SEARCH_BOX = By.xpath("//input[@name='search']");

    private final By SEARCH_SUBMIT = By.name("submitsearch");

    public SearchPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getSearchMenu() {

        return getDriver().findElement(SEARCH_MENU);
    }

    public void clickSearchMenu() {

        getSearchMenu().click();
    }

    public WebElement getSearchSubmenu() {

        return getDriver().findElement(SEARCH_SUBMENU);
    }

    public void clickSearchSubmenu() {

        getSearchSubmenu().click();
    }

    public WebElement getH2Main() {

        return getDriver().findElement(H2_MAIN);
    }

    public String getH2MainText() {

        return getH2Main().getText();
    }

    public WebElement getSearchBox(){

        return getDriver().findElement(SEARCH_BOX);
    }

    public void getSearchBoxSendKey(String name){

        getSearchBox().sendKeys(name);
    }

    public WebElement getSearchSubmit(){

        return getDriver().findElement(SEARCH_SUBMIT);
    }

    public void clickSubmitSearch(){

        getSearchSubmit().click();
    }
}
