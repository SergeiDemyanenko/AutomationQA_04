package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguagesBeginWithZ {

    private WebDriver driver;

    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");
    private final By H2_VOTING = By.xpath("//div[@id='voting']/h2[1]");
    private final By H2_CATEGORY = By.xpath("//div[@id='voting']/h2[@style='padding-top: 0']");
    private final By H2_BOOKMARKING = By.xpath("//div[@id='voting']/h2[3]");
    private final By H2_ALTERNATIVES = By.xpath("//div[@id='alternatives']/h2");
    private final By H2_COMMENTS = By.xpath("//div[@id='comments']/h2");

    public LanguagesBeginWithZ(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2Text() {

        return getH2Header().getText();
    }

    public String getH2ColorText() {

        return getH2Header().getCssValue("color");
    }

    public String getH2BoldText() {

        return getH2Header().getCssValue("font-weight");
    }

    public WebElement getH2Voting() {

        return getDriver().findElement(H2_VOTING);
    }

    public String getH2VotingText() {

        return getH2Voting().getText();
    }

    public String getH2VotingColorText() {

        return getH2Voting().getCssValue("color");
    }

    public String getH2VotingBoldText() {

        return getH2Voting().getCssValue("font-weight");
    }

    public WebElement getH2Category() {

        return getDriver().findElement(H2_CATEGORY);
    }

    public String getH2CategoryText() {

        return getH2Category().getText();
    }

    public String getH2CategoryColorText() {

        return getH2Category().getCssValue("color");
    }

    public String getH2CategoryBoldText() {

        return getH2Category().getCssValue("font-weight");
    }

    public WebElement getH2Bookmarking() {

        return getDriver().findElement(H2_BOOKMARKING);
    }

    public String getH2BookmarkingText() {

        return getH2Bookmarking().getText();
    }

    public String getH2BookmarkingColorText() {

        return getH2Bookmarking().getCssValue("color");
    }

    public String getH2BookmarkingBoldText() {

        return getH2Bookmarking().getCssValue("font-weight");
    }

    public WebElement getH2Alternatives() {

        return getDriver().findElement(H2_ALTERNATIVES);
    }

    public String getH2AlternativesText() {

        return getH2Alternatives().getText();
    }

    public String getH2AlternativesColorText() {

        return getH2Alternatives().getCssValue("color");
    }

    public String getH2AlternativesBoldText() {

        return getH2Alternatives().getCssValue("font-weight");
    }

    public WebElement getH2Comments() {

        return getDriver().findElement(H2_COMMENTS);
    }

    public String getH2CommentsText() {

        return getH2Comments().getText();
    }

    public String getH2CommentsColorText() {

        return getH2Comments().getCssValue("color");
    }

    public String getH2CommentsBoldText() {

        return getH2Comments().getCssValue("font-weight");
    }
}
