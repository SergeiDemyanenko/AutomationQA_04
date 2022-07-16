package pages.search_languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseTablePage;
import pages.browse_languages.languages.Perl737Page;
import pages.browse_languages.languages.LanguagesPage;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends BaseTablePage<LanguagesPage> {

    private final By SEARCH_SUBMENU = By.xpath("//ul[@id='submenu']/li/a[@href='./search.html']");
    private final By H2_MAIN = By.xpath("//div[@id='main']/h2");
    private final By SEARCH_BOX = By.xpath("//input[@name='search']");
    private final By SUBMIT_SEARCH = By.name("submitsearch");
    private final By PERL_LANGUAGE = By.linkText("Perl (bottled by Acme::EyeDrops)");
    private final By JAVA_LANGUAGES =
            By.xpath("//td/a[contains(@href, 'language')and (text()='Java' or contains(text(), 'Java ('))]");
    private final By TABLE_JAVA_SEARCH_LANGUAGES = By.xpath("//tbody/tr");

    public SearchPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return null;
    }

    public WebElement getSearchSubmenu() {

        return getDriver().findElement(SEARCH_SUBMENU);
    }

    public SearchPage clickSearchSubmenu() {
        getSearchSubmenu().click();

        return this;
    }

    public WebElement getH2Main() {

        return getDriver().findElement(H2_MAIN);
    }

    public String getH2MainText() {

        return getText(getH2Main());
    }

    public WebElement getSearchBox() {

        return getDriver().findElement(SEARCH_BOX);
    }

    public SearchPage getSearchBoxSendKey(String name) {
        getSearchBox().sendKeys(name);

        return this;
    }

    public WebElement getSubmitSearch() {

        return getDriver().findElement(SUBMIT_SEARCH);
    }

    public SearchPage clickSubmitSearch() {

        getSubmitSearch().click();

        return this;
    }

    public WebElement getPerlLanguage() {

        return getDriver().findElement(PERL_LANGUAGE);
    }

    public Perl737Page clickPerlLanguage() {
        getPerlLanguage().click();

        return new Perl737Page(getDriver());
    }

    public List<WebElement> getJavaATags() {

        return getDriver().findElements(JAVA_LANGUAGES);
    }

    public List<String> getOnlyJavaSearchAText() {
        List<String> allJavaATags = new ArrayList<>();

        for (WebElement javaSearchATag : getJavaATags()) {
            allJavaATags.add(getText(javaSearchATag));
        }

        return allJavaATags;
    }

    public String getStringTextFromJavaSearch() {
        StringBuilder actualResult = new StringBuilder();
        for (String javaSearchATag : getOnlyJavaSearchAText()) {
            actualResult.append(javaSearchATag).toString();
        }

        return actualResult.toString();
    }

    public List<WebElement> getTableJavaSearchLanguages() {

        return getDriver().findElements(TABLE_JAVA_SEARCH_LANGUAGES);
    }

    public int countLanguagesJavaSearch() {

        return getTableJavaSearchLanguages().size() - 1;
    }

    public SearchPage sendKeyToSearchBox(String name) {
        getSearchBox().sendKeys(name);

        return new SearchPage(getDriver());
    }

    public String getExpectedResult(String languageName) {
        List<String> languages = new ArrayList<>();
        languages.add("Java (object-oriented version)JavaJava (exception oriented)" +
                "Java (bytecode-version with loader)" +
                "Java (Java 5.0 object-oriented version)Java (Singing with Java Speech API)");
        for (String language : languages) {
            String name = language.split(" ")[0];
            if (name.equals(languageName)) {

                return language;
            }
        }

        return null;
    }
}
