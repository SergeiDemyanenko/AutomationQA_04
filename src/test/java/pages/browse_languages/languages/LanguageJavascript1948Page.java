package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class LanguageJavascript1948Page extends _LanguagesPage {

    private final By ALL_A_LINKS = By.xpath("//a[@href]");

    public LanguageJavascript1948Page(WebDriver driver) {

        super(driver);
    }

    protected String getTextWikiLink() {

        List<WebElement> aLinksOnJSPage
                = getDriver()
                .findElements(ALL_A_LINKS);
        List<String> listAllALinks = new ArrayList<>();

        for (WebElement a : aLinksOnJSPage) {
            if (a.getText()
                    .contains("http://en.wikipedia.org/wiki/Javascript")
            ) {
                listAllALinks.add(a.getText());
            }
        }

        return listAllALinks
                .toString()
                .replace("[", "")
                .replace("]", "");
    }

    protected WebElement getWikiLink() {

        return getDriver().findElement(
                By.linkText(getTextWikiLink()
                )
        );
    }

    public void clickWikiLink() {

        getWikiLink().click();
    }
}
