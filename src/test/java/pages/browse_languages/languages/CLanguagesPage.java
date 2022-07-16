package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class CLanguagesPage extends BaseLanguagePage<CLanguagesPage> {

    public CLanguagesPage(WebDriver driver) {

        super(driver);
    }

    public List<String> getCSharpLanguageALinks() {

        List<WebElement> aLinks = getALinksTable();
        List<String> listOfVersions = new ArrayList<>();

        for (WebElement a : aLinks) {
            listOfVersions.add(a.getText());
        }

        return listOfVersions;
    }
}
