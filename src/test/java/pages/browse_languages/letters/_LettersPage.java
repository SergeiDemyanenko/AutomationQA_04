package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public abstract class _LettersPage extends BasePage {

    private final By P_TAG_TEXT = By.xpath("//div[@id='main']/p[text()]");
    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");
    private final By TR_TAGS = By.xpath("//table[@id='category']/tbody/tr[@onmouseover]");
    private final By TH_TAGS = By.xpath("//table[@id='category']/tbody/tr/th");
    private final By TD_LINKS = By.xpath("//table[@id='category']/tbody/tr[@onmouseover]/td/a");
    private final By TD_LANGUAGE_NAMES = By.xpath("//table[@id='category']//tr/td[1]");

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

    public int getCountTrTags() {

        return getTrTags().size();
    }

    public List<WebElement> getWebElementsTDLinks() {

        return findElements(TD_LINKS);
    }

    public List<WebElement> getWebElementsTDLanguageNames() {

        return getDriver().findElements(TD_LANGUAGE_NAMES);
    }

    public int getCountTDLinks() {

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

    public void clickLanguageFromTDLinks(String nameLanguage) {
        findElement(By.linkText(getLanguageFromTDLinks(nameLanguage))).click();
    }

    public List<WebElement> getThTags() {

        return findElements(TH_TAGS);
    }

    public String getTextStringThTags() {

        StringBuilder result = new StringBuilder();

        for (WebElement th : getThTags()) {
            result.append(getText(th)).append(" ");
        }

        return result.toString().trim();
    }

    public List<String> getTextListThTags() {

        List<String> allTh = new ArrayList<>();

        for (WebElement th : getThTags()) {
            allTh.add(th.getText());
        }

        return allTh;
    }

    public List<String> getTextListTrTags() {

        List<String> allTrs = new ArrayList<>();

        for (WebElement tr : getTrTags()) {
            allTrs.add(getText(tr));
        }

        return allTrs;
    }
}