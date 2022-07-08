package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RPage {

    private WebDriver driver;

    private final By ALL_TR = By.xpath("//tbody/tr[@onmouseover]");
    private final By TITLE_H2 = By.xpath("//div[@id='main']/h2");
    private final By P1_TAG_TEXT = By.xpath("//div[@id='main']/p[1]");
    private final By TH_TAGS = By.xpath("//tbody/tr/th");

    public RPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public List<WebElement> getAllTR() {

        return getDriver().findElements(ALL_TR);
    }

    public int countLanguages() {

        return getAllTR().size();
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    public WebElement getTitleH2() {

        return getDriver().findElement(TITLE_H2);
    }

    public String getTitleH2Text() {

        return getText(getTitleH2());
    }

    public WebElement getP1Tag() {

        return getDriver().findElement(P1_TAG_TEXT);
    }

    public String getP1TagText() {

        return getText(getP1Tag());
    }

    public List<WebElement> getThTags() {

        return getDriver().findElements(TH_TAGS);
    }

    public List<String> getThTagsText() {

        List<String> allTh = new ArrayList<>();

        for (WebElement th : getThTags()) {
            allTh.add(th.getText());
        }

        return allTh;
    }
}
