package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.browse_languages.languages.LanguageJava3Page;

import java.util.ArrayList;
import java.util.List;

public class JPage extends BasePage {

    private final By P_TAG_TEXT = By.xpath("//div[@id='main']/p[text()]");
    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");
    private final By TH_TAGS = By.xpath("//table[@id='category']//th");
    private final By TR_TAGS = By.xpath("//table[@id='category']/tbody/tr[@onmouseover]");
    private final By ALL_A_LINKS = By.xpath("//tbody/tr/td/a[@href]");
    private final By lINK_LANGUAGE_JAVA_3 = By.xpath("//table[@id='category']//a[@href='language-java-3.html']");

    public JPage(WebDriver driver) {

        super(driver);
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    public WebElement getPTag() {

        return getDriver().findElement(P_TAG_TEXT);
    }

    public String getPTagText() {

        return getPTag().getText();
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2HeaderText() {

        return getH2Header().getText();
    }

    protected List<String> getAllALinks() {

        List<WebElement> aHrefs = getDriver().findElements(ALL_A_LINKS);

        List<String> listOfLanguages = new ArrayList<>();

        for (WebElement a : aHrefs) {
            listOfLanguages.add(a.getText());
        }

        return listOfLanguages;
    }

    public int getQuantityALinks() {

        return getAllALinks().size();
    }

    public WebElement getLinkLanguageJava3() {

        return getDriver().findElement(lINK_LANGUAGE_JAVA_3);
    }

    public LanguageJava3Page clickLinkLanguageJava3() {

        getLinkLanguageJava3().click();

        return new LanguageJava3Page(getDriver());
    }

    protected String getLanguageJavascript1948() {

        for (String language : getAllALinks()) {

            if (getAllALinks().size() != 0
                && language.equals("JavaScript")) {

                return language;
            }
        }

        return null;
    }

    public void clickLanguageJavascript1948() {

        getDriver().findElement(By.linkText(getLanguageJavascript1948())).click();
    }

    public List<WebElement> getThTags() {

        return getDriver().findElements(TH_TAGS);
    }

    public String getTextThTags() {

        StringBuilder result = new StringBuilder();

        for (WebElement th : getThTags()) {
            result.append(getText(th)).append(" ");
        }

        return result.toString();
    }

    public List<WebElement> getAllLanguages() {

        return getDriver().findElements(ALL_A_LINKS);
    }

    public int randomLanguage() {

        return (int) (Math.random() * getAllLanguages().size()) + 1;
    }

    public int randomIndex(){

        return randomLanguage() - 1;
    }

    public WebElement getRandomTr(){

       return getTrTags().get(randomIndex());
    }

    public List<WebElement> getTrTags() {

        return getDriver().findElements(TR_TAGS);
    }

    public List<String> getTrTagsText() {

        List<String> allTrs = new ArrayList<>();

        for (WebElement tr : getTrTags()) {
            allTrs.add(getText(tr));
        }

        return allTrs;
    }

     public String getTrText(String languageName) {
        StringBuilder actualResult = new StringBuilder();

        for (String tr : getTrTagsText()){
            if(tr.contains(languageName)){

               return actualResult.append(tr).toString();
            }
        }

        return null;
    }

    public String getExpectedResult(String languageName) {
        List<String> languageInformation = new ArrayList<>();
        languageInformation.add("Joy inforichland 07/05/09 0");
        for(String language : languageInformation){
            String name = language.split(" ")[0];
            if(name.equals(languageName)){

                return language;
            }
        }

        return null;
    }
}