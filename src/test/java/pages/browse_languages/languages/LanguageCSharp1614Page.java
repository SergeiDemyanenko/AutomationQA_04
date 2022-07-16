package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class LanguageCSharp1614Page extends BaseLanguagesPage {

    private final By A_LINKS_TABLE = By.xpath("//table[@id='category']/tbody/tr/td/a");

    public LanguageCSharp1614Page(WebDriver driver) {

        super(driver);
    }

    public List<WebElement> getALinksTable() {

        return getDriver().findElements(A_LINKS_TABLE);
    }

    public List<String> getCSharpLanguageALinks() {

        List<WebElement> aLinks = getALinksTable();
        List<String> listOfVersions = new ArrayList<>();

        for (WebElement a : aLinks) {
            listOfVersions.add(a.getText());
        }

        return listOfVersions;
    }

    public int countNumberOfVersions() {

        return getCSharpLanguageALinks().size();
    }
}
