package pages.browse_languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.letters.*;
import pages.BasePage;

import java.util.List;

public class AbcPage extends BasePage {

    private final By ZERO_SUBMENU = By.xpath("//a[@href='0.html']");
    private final By J_SUBMENU = By.xpath("//a[@href='j.html']");
    private final By M_SUBMENU = By.xpath("//a[@href='m.html']");
    private final By L_SUBMENU = By.xpath("//a[@href='l.html']");
    private final By C_SUBMENU = By.xpath("//a[@href='c.html']");
    private final By P_SUBMENU = By.xpath("//a[@href='p.html']");
    private final By R_SUBMENU = By.xpath("//a[@href='r.html']");
    private final By Z_SUBMENU = By.xpath("//a[@href='z.html']");
    private final By S_SUBMENU = By.xpath("//a[@href='s.html']");
    private final By U_SUBMENU = By.xpath("//a[@href='u.html']");
    private final By A_SUBMENU = By.xpath("//a[@href='a.html']");
    private final By K_SUBMENU = By.xpath("//a[@href='k.html']");
    private final By TITLES_TABLE = By.xpath("//table[@id='category']/tbody/tr/th");
    private final By SUBMENU = By.id("submenu");
    private final By ALL_SUBMENU = By.xpath("//ul[@id='submenu']//a");
    private final By D_SUBMENU = By.xpath("//a[@href='d.html']");
    private final By I_SUBMENU = By.xpath("//a[@href='i.html']");
    private final By Y_SUBMENU = By.xpath("//a[@href='y.html']");
    private final By X_SUBMENU = By.xpath("//a[@href='x.html']");

    public AbcPage(WebDriver driver) {

        super(driver);
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    public WebElement getJSubmenu() {

        return getDriver().findElement(J_SUBMENU);
    }

    public JPage clickJSubmenu() {

        getJSubmenu().click();

        return new JPage(getDriver());
    }

    public WebElement getMSubmenu() {

        return getDriver().findElement(M_SUBMENU);
    }

    public MPage clickMSubmenu() {

        getMSubmenu().click();

        return new MPage(getDriver());
    }

    public WebElement getLSubmenu() {

        return getDriver().findElement(L_SUBMENU);
    }

    public void clickLSubmenu() {

        getLSubmenu().click();
    }

    public WebElement getCSubmenu() {

        return getDriver().findElement(C_SUBMENU);
    }

    public CPage clickCSubmenu() {
        getCSubmenu().click();

        return new CPage(getDriver());
    }

    public WebElement getZeroSubmenu() {

        return getDriver().findElement(ZERO_SUBMENU);
    }

    public String getZeroSubmenuText() {

        return getText(getZeroSubmenu());
    }

    public ZeroPage clickZeroSubmenu() {
        getZeroSubmenu().click();

        return new ZeroPage(getDriver());
    }

    public List<WebElement> getAllSubmenu() {

        return getDriver().findElements(ALL_SUBMENU);
    }

    public WebElement getPSubmenu() {

        return getDriver().findElement(P_SUBMENU);
    }

    public PPage clickPSubmenu() {
        getPSubmenu().click();

        return new PPage(getDriver());
    }

    public WebElement getRSubmenu() {

        return getDriver().findElement(R_SUBMENU);
    }

    public RPage clickRSubmenu() {
        getRSubmenu().click();

        return new RPage(getDriver());
    }

    public WebElement getZSubmenu() {

        return getDriver().findElement(Z_SUBMENU);
    }

    public ZPage clickZSubmenu() {
        getZSubmenu().click();

        return new ZPage(getDriver());
    }

    public WebElement getSSubmenu() {

        return getDriver().findElement(S_SUBMENU);
    }

    public SPage clickSSubmenu() {
        getSSubmenu().click();

        return new SPage(getDriver());
    }

    public WebElement getUSubmenu() {

        return getDriver().findElement(U_SUBMENU);
    }

    public UPage clickUSubmenu() {
        getUSubmenu().click();

        return new UPage(getDriver());
    }

    public String getUSubmenuText() {

        return getText(getUSubmenu());
    }

    public String getTitlesTable() {
        StringBuilder stringTitle = new StringBuilder();
        String actualResult;

        List<WebElement> titles = getDriver().findElements(TITLES_TABLE);
        for (WebElement t : titles) {
            stringTitle.append(t.getText()).append(", ");
        }
        actualResult = stringTitle.toString()
                .substring(0, stringTitle.length() - 2);

        return actualResult;
    }

    public WebElement getSubmenu() {

        return getDriver().findElement(SUBMENU);
    }

    public WebElement getASubmenu() {

        return getDriver().findElement(A_SUBMENU);
    }

    public void clickASubmenu() {

        getASubmenu().click();
    }

    public String getASubmenuText() {

        return getText(getASubmenu());
    }

    public WebElement getDSubmenu() {

        return getDriver().findElement(D_SUBMENU);
    }

    public void clickDSubmenu() {
        getDSubmenu().click();
    }

    public WebElement getKSubmenu() {

        return getDriver().findElement(K_SUBMENU);
    }

    public KPage clickKSubmenu() {
        getKSubmenu().click();

        return new KPage(getDriver());
    }

    public WebElement getISubmenu() {

        return getDriver().findElement(I_SUBMENU);
    }

    public IPage clickISubmenu() {
        getISubmenu().click();

        return new IPage(getDriver());
    }

    public String getISubmenuText() {

        return getText(getISubmenu());
    }

    public WebElement getYSubmenu() {

        return getDriver().findElement(Y_SUBMENU);
    }

    public YPage clickYSubmenu() {
        getYSubmenu().click();

        return new YPage(getDriver());
    }

    public WebElement getXSubmenu() {

        return getDriver().findElement(X_SUBMENU);
    }

    public XPage clickXSubmenu() {
        getXSubmenu().click();

        return new XPage(getDriver());
    }

    public String getAllNamesOfSubmenu() {
        StringBuilder result = new StringBuilder();
                List<WebElement> liAll = getAllSubmenu();
        for (WebElement li : liAll) {
           result.append(li.getText());
        }

        return  result.toString();
    }
}