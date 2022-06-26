package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AbcPage {

    private WebDriver driver;

    private final By CATEGORY_J = By.xpath("//a[@href='j.html']");
    private final By CATEGORY_M = By.xpath("//a[@href='m.html']");
    private final By CATEGORY_L = By.xpath("//a[@href='l.html']");
    private final By CATEGORY_C = By.xpath("//a[@href='c.html']");
    private final By CATEGORY_P = By.xpath("//a[@href='p.html']");
    private final By CATEGORY_09 = By.xpath("//a[@href='0.html']");
    private final By ALL_CATEGORIES = By.xpath("//ul[@id='submenu']//a");
    private final By CATEGORY_R = By.xpath("//a[@href='r.html']");

    public AbcPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getCategoryJ() {

        return getDriver().findElement(CATEGORY_J);
    }

    public void getCategoryJClick() {

        getCategoryJ().click();
    }

    public WebElement getCategoryM() {

        return getDriver().findElement(CATEGORY_M);
    }

    public void getCategoryMClick() {

        getCategoryM().click();
    }

    public WebElement getCategoryL(){
        return getDriver().findElement(CATEGORY_L);
    }

    public void getCategoryLClick(){
        getCategoryL().click();
    }

    public WebElement getCategoryC() {

        return getDriver().findElement(CATEGORY_C);
    }

    public void getCategoryCClick(){
        getCategoryC().click();
    }

    public WebElement getCategory09(){

        return getDriver().findElement(CATEGORY_09);
    }

    public String getCategory09Text(){

        return getCategory09().getText();
    }

    public List<WebElement> getAllCategories(){

        return getDriver().findElements(ALL_CATEGORIES);
    }
    public WebElement getCategoryP() {

        return getDriver().findElement(CATEGORY_P);
    }

    public void getCategoryPClick() {

        getDriver().findElement(CATEGORY_P).click();
    }

    public WebElement getCategoryR() {

        return getDriver().findElement(CATEGORY_R);
    }
}