package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.BaseAbcPage;

import java.util.ArrayList;
import java.util.List;

public abstract class _LettersPage extends BaseAbcPage {

    private final By P_TAG_WITH_TEXT = By.xpath("//table[@id='category']/preceding-sibling::p");
    private final By H2_MAIN = By.xpath("//div[@id='main']/h2");
    private final By TR_TAGS = By.xpath("//table[@id='category']/tbody/tr[@onmouseover]");
    private final By TH_TAGS = By.xpath("//table[@id='category']/tbody/tr/th");
    private final By TD_LINKS = By.xpath("//table[@id='category']/tbody/tr[@onmouseover]/td/a");
    private final By TD_LANGUAGE_NAMES = By.xpath("//table[@id='category']//tr/td[1]");
    private final By TITLES_TABLE = By.xpath("//table[@id='category']/tbody/tr/th");

    protected _LettersPage(WebDriver driver) {

        super(driver);
    }

    public List<WebElement> getTDLanguageNames() {

        return getDriver().findElements(TD_LANGUAGE_NAMES);
    }

    public WebElement getPTagWithText() {

        return getDriver().findElement(P_TAG_WITH_TEXT);
    }

    public WebElement getH2Main() {

        return getDriver().findElement(H2_MAIN);
    }

    public List<WebElement> getTrTags() {

        return getDriver().findElements(TR_TAGS);
    }

    public List<WebElement> getWebElementsTDLinks() {

        return getDriver().findElements(TD_LINKS);
    }

    public List<WebElement> getThTags() {

        return getDriver().findElements(TH_TAGS);
    }

    public WebElement getLanguage(String languageName) {

        return getDriver().findElement(By.linkText(getLanguageFromTDLinks(languageName)));
    }

    public String getH2HeaderText() {

        return getText(getH2Header());
    }

    public String getTextPTag() {

        return getText(getPTagWithText());
    }

    public int getCountTrTags() {

        return getTrTags().size();
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
        getLanguage(nameLanguage).click();
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

    public String getTitlesTable() {
        StringBuilder stringTitle = new StringBuilder();
        String actualResult;

        List<WebElement> titles = getDriver().findElements(TITLES_TABLE);
        for (WebElement t : titles) {
            stringTitle.append(t.getText()).append(", ");
        }
        actualResult = stringTitle.toString()
                .substring(0, stringTitle.length() - 2);

        return actualResult;
    }
}