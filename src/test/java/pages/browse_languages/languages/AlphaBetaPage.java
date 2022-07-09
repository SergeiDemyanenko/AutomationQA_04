package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlphaBetaPage {

    private WebDriver driver;

    private final By ALPHABETA_LINK = By.linkText("AlphaBeta");
    private final By DIIGO_ICON = By.xpath("//a[@title='diigo']");
    private final By MAGNOLIA_ICON  = By.xpath("//a[@title='magnolia']");
    private final By DIIGG_ICON = By.xpath("//a[@title='digg']");
    private final By DEL_ICIO_US_ICON = By.xpath("//a[@title='del_icio_us']");
    private final By SZONE_ICON = By.xpath("//a[@title='dzone']");
    private final By EARTHLINK_ICON = By.xpath("//a[@title='earthlink']");
    private final By GOOGLE_ICON = By.xpath("//a[@title='google']");
    private final By KICKIT_ICON = By.xpath("//a[@title='kickit']");
    private final By LIVE_ICON = By.xpath("//a[@title='live']");
    private final By LOOKLATER_ICON = By.xpath("//a[@title='looklater']");
    private final By REDDIT_ICON = By.xpath("//a[@title='reddit']");
    private final By ROJO_ICON = By.xpath("//a[@title='rojo']");
    private final By STUMBLEOUPON_ICON = By.xpath("//a[@title='stumbleupon']");
    private final By TECHNORATI_ICON = By.xpath("//a[@title='technorati']");

    public AlphaBetaPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getAlphaBeta() {

        return getDriver().findElement(ALPHABETA_LINK);
    }

    public void clickAlphaBeta() {

        getAlphaBeta().click();
    }
    public WebElement getDiigoIcon() {

        return getDriver().findElement(DIIGO_ICON);
    }

    public void clickDiigoIcon() {

        getDiigoIcon().click();
    }

    public WebElement getMagnoliaIcon() {

        return getDriver().findElement(MAGNOLIA_ICON);
    }

    public void clickMagnoliaIcon() {

        getMagnoliaIcon().click();
    }

    public WebElement getDiiggIcon() {

        return getDriver().findElement(DIIGG_ICON);
    }

    public void clickDiiggIcon() {

        getDiiggIcon().click();
    }

    public WebElement getDelIcio() {

        return getDriver().findElement(DEL_ICIO_US_ICON);
    }

    public void clickDelicio() {

        getDelIcio().click();
    }
}
