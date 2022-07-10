package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class LanguageCSharp1614Page extends BasePage {

    private final By A_LINKS = By.xpath("//table[@id='category']/tbody/tr/td/a[@href]");

    public LanguageCSharp1614Page(WebDriver driver) {

        super(driver);
    }

    public List<String> getCSharpLanguageALinks() {

        List<WebElement> aHrefs = getDriver().findElements(A_LINKS);
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
