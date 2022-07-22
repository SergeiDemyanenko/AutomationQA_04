package pages.browse_languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseTablePage;
import pages.browse_languages.letters.*;
import java.util.List;

public abstract class BaseAbcPage<LangPage> extends BaseTablePage<LangPage> {

    private final By H2_MAIN = By.xpath("//div[@id='main']/h2");

    private final String SUBMENU_BASE_PATH = "//ul[@id='submenu']/li/a[@href=";
    private final By ZERO_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'0.html']");
    private final By A_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'a.html']");
    private final By B_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'b.html']");
    private final By C_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'c.html']");
    private final By D_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'d.html']");
    private final By G_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'g.html']");
    private final By I_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'i.html']");
    private final By J_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'j.html']");
    private final By K_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'k.html']");
    private final By L_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'l.html']");
    private final By M_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'m.html']");
    private final By P_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'p.html']");
    private final By R_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'r.html']");
    private final By S_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'s.html']");
    private final By U_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'u.html']");
    private final By X_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'x.html']");
    private final By Y_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'y.html']");
    private final By Z_SUBMENU = By.xpath(SUBMENU_BASE_PATH + "'z.html']");

    private final By SUBMENU = By.id("submenu");
    private final By ALL_SUBMENU = By.xpath("//ul[@id='submenu']//a");

    public BaseAbcPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getH2Main() {

        return getDriver().findElement(H2_MAIN);
    }

    public WebElement getZeroSubmenu() {

        return getDriver().findElement(ZERO_SUBMENU);
    }

    public WebElement getASubmenu() {

        return getDriver().findElement(A_SUBMENU);
    }

    public WebElement getBSubmenu() {

        return getDriver().findElement(B_SUBMENU);
    }

    public WebElement getCSubmenu() {

        return getDriver().findElement(C_SUBMENU);
    }

    public WebElement getDSubmenu() {

        return getDriver().findElement(D_SUBMENU);
    }

    public WebElement getGSubmenu() {

        return getDriver().findElement(G_SUBMENU);
    }

    public WebElement getISubmenu() {

        return getDriver().findElement(I_SUBMENU);
    }

    public WebElement getJSubmenu() {

        return getDriver().findElement(J_SUBMENU);
    }

    public WebElement getKSubmenu() {

        return getDriver().findElement(K_SUBMENU);
    }

    public WebElement getLSubmenu() {

        return getDriver().findElement(L_SUBMENU);
    }

    public WebElement getMSubmenu() {

        return getDriver().findElement(M_SUBMENU);
    }

    public WebElement getPSubmenu() {

        return getDriver().findElement(P_SUBMENU);
    }

    public WebElement getRSubmenu() {

        return getDriver().findElement(R_SUBMENU);
    }

    public WebElement getSSubmenu() {

        return getDriver().findElement(S_SUBMENU);
    }

    public WebElement getUSubmenu() {

        return getDriver().findElement(U_SUBMENU);
    }

    public WebElement getXSubmenu() {

        return getDriver().findElement(X_SUBMENU);
    }

    public WebElement getYSubmenu() {

        return getDriver().findElement(Y_SUBMENU);
    }

    public WebElement getZSubmenu() {

        return getDriver().findElement(Z_SUBMENU);
    }

    public WebElement getSubmenu() {

        return getDriver().findElement(SUBMENU);
    }

    public List<WebElement> getAllSubmenu() {

        return getDriver().findElements(ALL_SUBMENU);
    }

    public String getH2MainText() {

        return getText(getH2Main());
    }

    public String getZeroSubmenuText() {

        return getText(getZeroSubmenu());
    }

    public String getASubmenuText() {

        return getText(getASubmenu());
    }

    public String getCSubmenuText() {

        return getText(getCSubmenu());
    }

    public String getISubmenuText() {

        return getText(getISubmenu());
    }

    public String getUSubmenuText() {

        return getText(getUSubmenu());
    }

    public String getAllNamesOfSubmenu() {
        StringBuilder result = new StringBuilder();
        List<WebElement> liAll = getAllSubmenu();
        for (WebElement li : liAll) {
            result.append(li.getText());
        }

        return  result.toString();
    }

    public ZeroPage clickZeroSubmenu() {
        getZeroSubmenu().click();

        return new ZeroPage(getDriver());
    }

    public APage clickASubmenu() {
        getASubmenu().click();

        return new APage(getDriver());
    }

    public BPage clickBSubmenu() {
        getBSubmenu().click();

        return new BPage(getDriver());
    }

    public CPage clickCSubmenu() {
        getCSubmenu().click();

        return new CPage(getDriver());
    }

    public DPage clickDSubmenu() {
        getDSubmenu().click();

        return new DPage(getDriver());
    }

    public GPage clickGSubmenu() {
        getGSubmenu().click();

        return new GPage(getDriver());
    }

    public IPage clickISubmenu() {
        getISubmenu().click();

        return new IPage(getDriver());
    }

    public JPage clickJSubmenu() {

        getJSubmenu().click();

        return new JPage(getDriver());
    }

    public KPage clickKSubmenu() {
        getKSubmenu().click();

        return new KPage(getDriver());
    }

    public LPage clickLSubmenu() {
        getLSubmenu().click();

        return new LPage(getDriver());
    }

    public MPage clickMSubmenu() {

        getMSubmenu().click();

        return new MPage(getDriver());
    }

    public PPage clickPSubmenu() {
        getPSubmenu().click();

        return new PPage(getDriver());
    }

    public RPage clickRSubmenu() {
        getRSubmenu().click();

        return new RPage(getDriver());
    }

    public SPage clickSSubmenu() {
        getSSubmenu().click();

        return new SPage(getDriver());
    }

    public UPage clickUSubmenu() {
        getUSubmenu().click();

        return new UPage(getDriver());
    }

    public XPage clickXSubmenu() {
        getXSubmenu().click();

        return new XPage(getDriver());
    }

    public YPage clickYSubmenu() {
        getYSubmenu().click();

        return new YPage(getDriver());
    }

    public ZPage clickZSubmenu() {
        getZSubmenu().click();

        return new ZPage(getDriver());
    }
}
