package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import java.util.ArrayList;
import java.util.List;

public abstract class _LanguagesPage extends BasePage {

    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");
    private final By H2_VOTING = By.xpath("//div[@id='voting']/h2[1]");
    private final By H2_CATEGORY = By.xpath("//div[@id='voting']/h2[@style='padding-top: 0']");
    private final By H2_BOOKMARKING = By.xpath("//div[@id='voting']/h2[3]");
    private final By H2_ALTERNATIVES = By.xpath("//div[@id='alternatives']/h2");
    private final By H2_COMMENTS = By.xpath("//div[@id='comments']/h2");
    private final By A_LINKS = By.xpath("//table[@id='category']/tbody/tr/td/a[@href]");
    private final By DIIGO_ICON = By.xpath("//a[@title='diigo']");
    private final By MAGNOLIA_ICON  = By.xpath("//a[@title='magnolia']");
    private final By DIIGG_ICON = By.xpath("//a[@title='digg']");
    private final By DEL_ICIO_US_ICON = By.xpath("//a[@title='del_icio_us']");

    public _LanguagesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2Text() {

        return getH2Header().getText();
    }

    public WebElement getH2Voting() {

        return getDriver().findElement(H2_VOTING);
    }

    public String getH2VotingText() {

        return getH2Voting().getText();
    }

    public WebElement getH2Category() {

        return getDriver().findElement(H2_CATEGORY);
    }

    public String getH2CategoryText() {

        return getH2Category().getText();
    }

    public WebElement getH2Bookmarking() {

        return getDriver().findElement(H2_BOOKMARKING);
    }

    public String getH2BookmarkingText() {

        return getH2Bookmarking().getText();
    }

    public WebElement getH2Alternatives() {

        return getDriver().findElement(H2_ALTERNATIVES);
    }

    public String getH2AlternativesText() {

        return getH2Alternatives().getText();
    }

    public WebElement getH2Comments() {

        return getDriver().findElement(H2_COMMENTS);
    }

    public String getH2CommentsText() {

        return getH2Comments().getText();
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

    public List<String> getCategoryTableLinkTexts() {

        List<WebElement> aHrefs = getDriver().findElements(A_LINKS);
        List<String> listOfVersions = new ArrayList<>();

        for (WebElement a : aHrefs) {
            listOfVersions.add(a.getText());
        }

        return listOfVersions;
    }
}
