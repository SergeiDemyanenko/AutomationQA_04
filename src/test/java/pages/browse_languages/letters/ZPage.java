package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.BaseAbcPage;
import pages.languages.LanguagesPage;

public class ZPage extends BaseAbcPage<LanguagesPage> {

    public ZPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return null;
    }

    public String getNamesText() {
        StringBuilder result = new StringBuilder();

        for (WebElement names : getTDLanguageNames()) {
            result.append(names.getText()).append("\n");
        }
        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }

    public WebElement getRandomNameOfZ() {
        int index =
                (int) (Math.random() * (getTDLanguageNames().size() - 1)) + 1;

        return getDriver()
                .findElement(By.xpath(
                        "//table[@id='category']/tbody/tr[@onmouseover][" + index + "]/td/a"));
    }

//    public ZPage clickRandomNameOfZ() {
//        getRandomNameOfZ().click();
//
//        return new LanguagesBeginWithZPage(getDriver());
//    }
//
//    public String getH2ColorText() {
//
//        return getH2Header().getCssValue("color");
//    }
//
//    public String getH2BoldText() {
//
//        return getH2Header().getCssValue("font-weight");
//    }
//
//    public String getH2VotingColorText() {
//
//        return getH2Voting().getCssValue("color");
//    }
//
//    public String getH2VotingBoldText() {
//
//        return getH2Voting().getCssValue("font-weight");
//    }
//
//    public String getH2CategoryColorText() {
//
//        return getH2Category().getCssValue("color");
//    }
//
//    public String getH2CategoryBoldText() {
//
//        return getH2Category().getCssValue("font-weight");
//    }
//
//    public String getH2BookmarkingColorText() {
//
//        return getH2Bookmarking().getCssValue("color");
//    }
//
//    public String getH2BookmarkingBoldText() {
//
//        return getH2Bookmarking().getCssValue("font-weight");
//    }
//
//    public String getH2AlternativesColorText() {
//
//        return getH2Alternatives().getCssValue("color");
//    }
//
//    public String getH2AlternativesBoldText() {
//
//        return getH2Alternatives().getCssValue("font-weight");
//    }
//
//    public String getH2CommentsColorText() {
//
//        return getH2Comments().getCssValue("color");
//    }
//
//    public String getH2CommentsBoldText() {
//
//        return getH2Comments().getCssValue("font-weight");
//    }
}