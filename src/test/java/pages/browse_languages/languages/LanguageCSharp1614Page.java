package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LanguageCSharp1614Page {

    private final By CSharp_Versions = By.xpath("//table[@id='category']/tbody/tr/td/a[@href]");

    private final WebDriver driver;

    public LanguageCSharp1614Page(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public List<String> getCSharpLanguageALinks() {

        List<WebElement> aHrefs = getDriver().findElements(CSharp_Versions);
        List<String> listOfVersions = new ArrayList<>();

        for (WebElement tr : aHrefs ) {
            listOfVersions.add(tr.getText());
        }

        return listOfVersions;
    }

    public int getCSharpLanguageNumberOfVersions() {

        return getCSharpLanguageALinks().size();
    }
}
