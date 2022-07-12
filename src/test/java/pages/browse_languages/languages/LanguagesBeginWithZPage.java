package pages.browse_languages.languages;

import org.openqa.selenium.WebDriver;

public class LanguagesBeginWithZPage extends _LanguagesPage {

    public LanguagesBeginWithZPage(WebDriver driver) {
        super(driver);
    }

    public String getH2ColorText() {

        return getH2Header().getCssValue("color");
    }

    public String getH2BoldText() {

        return getH2Header().getCssValue("font-weight");
    }

    public String getH2VotingColorText() {

        return getH2Voting().getCssValue("color");
    }

    public String getH2VotingBoldText() {

        return getH2Voting().getCssValue("font-weight");
    }

    public String getH2CategoryColorText() {

        return getH2Category().getCssValue("color");
    }

    public String getH2CategoryBoldText() {

        return getH2Category().getCssValue("font-weight");
    }

    public String getH2BookmarkingColorText() {

        return getH2Bookmarking().getCssValue("color");
    }

    public String getH2BookmarkingBoldText() {

        return getH2Bookmarking().getCssValue("font-weight");
    }

    public String getH2AlternativesColorText() {

        return getH2Alternatives().getCssValue("color");
    }

    public String getH2AlternativesBoldText() {

        return getH2Alternatives().getCssValue("font-weight");
    }

    public String getH2CommentsColorText() {

        return getH2Comments().getCssValue("color");
    }

    public String getH2CommentsBoldText() {

        return getH2Comments().getCssValue("font-weight");
    }
}
