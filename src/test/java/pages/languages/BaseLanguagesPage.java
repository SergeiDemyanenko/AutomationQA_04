package pages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.BaseAbcPage;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseLanguagesPage<LangPage> extends BaseAbcPage<LangPage> {

    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");
    private final By H2_VOTING = By.xpath("//div[@id='voting']/h2[1]");
    private final By H2_CATEGORY = By.xpath("//div[@id='voting']/h2[@style='padding-top: 0']");
    private final By H2_BOOKMARKING = By.xpath("//div[@id='voting']/h2[3]");
    private final By H2_ALTERNATIVES = By.xpath("//div[@id='alternatives']/h2");
    private final By H2_COMMENTS = By.xpath("//div[@id='comments']/h2");
    private final By A_LINKS_TABLE = By.xpath("//table[@id='category']/tbody/tr/td/a");
    private final By DIIGO_ICON = By.xpath("//a[@title='diigo']");
    private final By MAGNOLIA_ICON  = By.xpath("//a[@title='magnolia']");
    private final By DIGG_ICON = By.xpath("//a[@title='digg']");
    private final By DEL_ICIO_US_ICON = By.xpath("//a[@title='del_icio_us']");
    private final By NUMBER_OF_COMMENTS = By.xpath("//div[@id='comments']/p[@class='comment']");
    private final By REDDIT_ICON = By.xpath("//div[@id='voting']/p/a[@title='reddit']");

    public BaseLanguagesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public WebElement getRedditIcon() {

        return getDriver().findElement(REDDIT_ICON);
    }

    public LanguagesPage clickRedditIcon() {
        getRedditIcon().click();

        return new LanguagesPage(getDriver());
    }

    public List<WebElement> getALinksTable() {

        return getDriver().findElements(A_LINKS_TABLE);
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

    public WebElement getDiggIcon() {

        return getDriver().findElement(DIGG_ICON);
    }

    public void clickDiiggIcon() {
        getDiggIcon().click();
    }

    public WebElement getDelIcon() {

        return getDriver().findElement(DEL_ICIO_US_ICON);
    }

    public List<String> getCategoryTableLinkTexts() {

        List<WebElement> aLinks = getALinksTable();
        List<String> listOfVersions = new ArrayList<>();

        for (WebElement a : aLinks) {
            listOfVersions.add(a.getText());
        }

        return listOfVersions;
    }

    public String getRedditIconURL() {

        return getRedditIcon().getAttribute("href");
    }

    public WebElement getNumberOfCommentsOnThePage(){

        return getDriver().findElement(NUMBER_OF_COMMENTS);
    }

    public int countComments() {
        String[] result = new String[7];
        int countComments = 0;

        for (int i = 1; i < result.length; i++) {
            if(getNumberOfCommentsOnThePage().isDisplayed()){
                countComments++;
            }
        }

        return countComments++;
    }
}
