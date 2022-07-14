package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class LanguageCSharp1614Page extends _LanguagesPage {

    private final By A_LINKS = By.xpath("//table[@id='category']/tbody/tr/td/a[@href]");

    public LanguageCSharp1614Page(WebDriver driver) {

        super(driver);
    }

    public List<WebElement> getALinksTable() {

        return getDriver().findElements(A_LINKS);
    }

    public List<String> getCSharpLanguageALinks() {

        List<WebElement> aHrefs = getALinksTable();
        List<String> listOfVersions = new ArrayList<>();

        for (WebElement a : aHrefs) {
            listOfVersions.add(a.getText());
        }

        return listOfVersions;
    }

    public int getCSharpLanguageNumberOfVersions() {

        return getCSharpLanguageALinks().size();
    }
}
