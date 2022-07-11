package pages.search_languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.browse_languages.languages.LanguagePerl737Page;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends BasePage {

    private final By SEARCH_SUBMENU = By.xpath("//ul[@id='submenu']/li/a[@href='./search.html']");

    private final By H2_MAIN = By.xpath("//div[@id='main']/h2");

    private final By SEARCH_BOX = By.xpath("//input[@name='search']");

    private final By SEARCH_SUBMIT = By.name("submitsearch");

    private final By PERL_LANGUAGE = By.linkText("Perl (bottled by Acme::EyeDrops)");

    private final By JAVA_LANGUAGES =
            By.xpath("//td/a[contains(@href, 'language')and (text()='Java' or contains(text(), 'Java ('))]");

    private final By TABLE_JAVA_SEARCH_LANGUAGES = By.xpath("//tbody/tr");

    public SearchPage(WebDriver driver) {

        super(driver);
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    public WebElement getSearchSubmenu() {

        return getDriver().findElement(SEARCH_SUBMENU);
    }

    public SearchPage clickSearchSubmenu() {
        getSearchSubmenu().click();

        return new SearchPage(getDriver());
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

        return new SearchPage(getDriver());
    }

    public WebElement getSearchSubmit() {

        return getDriver().findElement(SEARCH_SUBMIT);
    }

    public SearchPage clickSubmitSearch() {

        getSearchSubmit().click();
        return new SearchPage(getDriver());
    }

    public WebElement getPerlLanguage() {

        return getDriver().findElement(PERL_LANGUAGE);
    }

    public LanguagePerl737Page clickPerlLanguage() {
        getPerlLanguage().click();

        return new LanguagePerl737Page(getDriver());
    }

    public List<String> getOnlyJavaLanguages() {

        List<WebElement> javaLanguages = getDriver().findElements(JAVA_LANGUAGES);

        List<String> allJavaLanguages = new ArrayList<>();

        for (WebElement name : javaLanguages) {
            allJavaLanguages.add(name.getText());
        }

        return allJavaLanguages;
    }

    public List<WebElement> getTableJavaSearchLanguages(){

        return  getDriver().findElements(TABLE_JAVA_SEARCH_LANGUAGES);
    }

    public int countLanguagesJavaSearch(){

        return getTableJavaSearchLanguages().size() - 1;
    }

}
