package pages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LanguagesPage extends BaseLanguagesPage<LanguagesPage> {

    private final By INFO_LINK = By.xpath("//div[@id='main']/table/tbody/tr[5]/td[2]/a");
    private final By DOWNLOAD_SOURCE_LINKS = By.xpath("//div[@id='main']/p/a[@href='/download/963']");

    public LanguagesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {
        return new LanguagesPage(getDriver());
    }

    public WebElement getInfoLink() {

        return getDriver().findElement(INFO_LINK);
    }

    public List<WebElement> getDownloadSourceLinks() {

        return getDriver().findElements(DOWNLOAD_SOURCE_LINKS);
    }

    public List<String> getDownloadSourceLinksText() {
        List<String> linksText = new ArrayList<>();

        for (WebElement link : getDownloadSourceLinks()) {
            linksText.add(link.getText());
        }

        return linksText;
    }

    public void clickInfoLink() {

        getInfoLink().click();
    }
}