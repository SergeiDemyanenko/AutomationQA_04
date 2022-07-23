package pages.search_languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseTablePage;
import pages.languages.Perl737Page;
import pages.languages.LanguagesPage;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends BaseTablePage<LanguagesPage> {

    private final By NEW_SEARCH_SUBMENU = By.xpath("//ul[@id='submenu']/li/a[@href='./search.html']");
    private final By H2_MAIN = By.xpath("//div[@id='main']/h2");
    private final By SEARCH_FIELD = By.xpath("//input[@name='search']");
    private final By SUBMIT_SEARCH_BUTTON = By.name("submitsearch");
    private final By PERL_LANGUAGE = By.linkText("Perl (bottled by Acme::EyeDrops)");
    private final By JAVA_LANGUAGES =
            By.xpath("//td/a[contains(@href, 'language')and (text()='Java' or contains(text(), 'Java ('))]");

    public SearchPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return null;
    }

    public WebElement getNewSearchSubmenu() {

        return getDriver().findElement(NEW_SEARCH_SUBMENU);
    }

    public WebElement getH2Main() {

        return getDriver().findElement(H2_MAIN);
    }

    public WebElement getSearchField() {

        return getDriver().findElement(SEARCH_FIELD);
    }

    public WebElement getSubmitSearchButton() {

        return getDriver().findElement(SUBMIT_SEARCH_BUTTON);
    }

    public WebElement getPerlLanguage() {

        return getDriver().findElement(PERL_LANGUAGE);
    }

    public List<WebElement> getJavaLanguages() {

        return getDriver().findElements(JAVA_LANGUAGES);
    }

    public String getH2MainText() {

        return getText(getH2Main());
    }

    public List<String> getOnlyJavaSearchAText() {
        List<String> allJavaATags = new ArrayList<>();

        for (WebElement javaSearchATag : getJavaLanguages()) {
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

    public SearchPage enterTextSearchField(String name) {
        getSearchField().sendKeys(name);

        return this;
    }

    public SearchPage clickNewSearchSubmenu() {
        getNewSearchSubmenu().click();

        return this;
    }

    public SearchPage clickSubmitSearchButton() {

        getSubmitSearchButton().click();

        return this;
    }

    public Perl737Page clickPerlLanguage() {
        getPerlLanguage().click();

        return new Perl737Page(getDriver());
    }
}
