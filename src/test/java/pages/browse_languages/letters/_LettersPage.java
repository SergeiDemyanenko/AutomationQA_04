package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public abstract class _LettersPage extends BasePage {

    public final By P_TAG_TEXT = By.xpath("//div[@id='main']/p[text()]");
    public final By H2_HEADER = By.xpath("//div[@id='main']/h2");
    public final By TR_TAGS = By.xpath("//table[@id='category']/tbody/tr[@onmouseover]");
    public final By TH_TAGS = By.xpath("//table[@id='category']//th");
    public final By TD_LINKS = By.xpath("//table[@id='category']/tbody/tr[@onmouseover]/td/a");

    public _LettersPage(WebDriver driver) {

        super(driver);
    }

    public String getPTagText() {

        return getText(findElement(P_TAG_TEXT));
    }

    public String getH2HeaderText() {

        return getText(findElement(H2_HEADER));
    }

    public List<WebElement> getTrTags() {

        return findElements(TR_TAGS);
    }

    public List<WebElement> getWebElementsTDLinks() {

        return findElements(TD_LINKS);
    }

    public int getQuantityTDLinks() {

        return getWebElementsTDLinks().size();
    }

    public List<String> getListStringTDLinks() {

        List<WebElement> tDLink = getWebElementsTDLinks();

        List<String> listOfLanguages = new ArrayList<>();

        for (WebElement a : tDLink) {
            listOfLanguages.add(a.getText());
        }

        return listOfLanguages;
    }

    public String getLanguageFromTDLinks(String nameLanguage) {

        for (String language : getListStringTDLinks()) {

            if (getListStringTDLinks().size() != 0
                    && language.equals(nameLanguage)) {

                return language;
            }
        }

        return null;
    }

    public List<WebElement> getThTags() {

        return findElements(TH_TAGS);
    }

    public String getStringTextThTags() {

        StringBuilder result = new StringBuilder();

        for (WebElement th : getThTags()) {
            result.append(getText(th)).append(" ");
        }

        return result.toString();
    }

    public List<String> getTrTagsText() {

        List<String> allTrs = new ArrayList<>();

        for (WebElement tr : getTrTags()) {
            allTrs.add(getText(tr));
        }

        return allTrs;
    }
}
