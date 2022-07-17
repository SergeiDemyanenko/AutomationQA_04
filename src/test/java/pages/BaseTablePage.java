package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseTablePage<LangPage> extends MainPage {

    private final By P_TAG_WITH_TEXT = By.xpath("//table[@id='category']/preceding-sibling::p");
    private final By TR_TAGS = By.xpath("//table[@id='category']/tbody/tr[@onmouseover]");
    private final By TH_TAGS = By.xpath("//table[@id='category']/tbody/tr/th");
    private final By TD_LINKS = By.xpath("//table[@id='category']/tbody/tr[@onmouseover]/td/a");
    private final By TD_LANGUAGE_NAMES = By.xpath("//table[@id='category']//tr/td[1]");
    private final By TITLES_TABLE = By.xpath("//table[@id='category']/tbody/tr/th");

    public BaseTablePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getTDLanguageNames() {

        return getDriver().findElements(TD_LANGUAGE_NAMES);
    }

    public WebElement getPTagWithText() {

        return getDriver().findElement(P_TAG_WITH_TEXT);
    }

    public List<WebElement> getTrTags() {

        return getDriver().findElements(TR_TAGS);
    }

    public List<WebElement> getTDLinks() {

        return getDriver().findElements(TD_LINKS);
    }

    public List<WebElement> getThTags() {

        return getDriver().findElements(TH_TAGS);
    }

    public WebElement getLanguage(String languageName) {

        return getDriver().findElement(By.linkText(languageName));
    }


    public String getTextPTag() {

        return getText(getPTagWithText());
    }

    public int getCountTrTags() {

        return getTrTags().size();
    }

    public int getCountTDLinks() {

        return getTDLinks().size();
    }

    public List<String> getListStringTDLinks() {

        List<WebElement> tDLink = getTDLinks();

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

    public WebElement getRandomTdLink(){

        return getTDLinks().get(randomIndex());
    }

    public WebElement getRandomTr() {

        return getTrTags().get(randomIndex());
    }

    public int randomLanguage() {

        return (int) (Math.random() * getCountTDLinks()) + 1;
    }

    public int randomIndex() {

        return randomLanguage() - 1;
    }

    protected abstract LangPage createLangPage();

    public LangPage clickLanguage(String nameLanguage) {

        getLanguage(nameLanguage).click();

        return createLangPage();
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

    public String getTextOneElementFromListTrs(int index){

        return getTextListTrTags().get(index);
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
