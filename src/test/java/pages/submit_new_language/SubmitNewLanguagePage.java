package pages.submit_new_language;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPage;

import java.util.ArrayList;
import java.util.List;
import static runner.TestUtils.getRandomStr;

public class SubmitNewLanguagePage extends MainPage {

    private final By EMAIL_NAME = By.name("email");
    private final By AUTHOR_NAME = By.name("author");
    private final By SECURITY_CODE_NAME = By.name("captcha");
    private final By CODE_NAME = By.name("code");
    private final By LANGUAGE_NAME = By.name("language");
    private final By BUTTON_SUBMIT_LANGUAGE = By.xpath("//div/div/form[@id='addlanguage']/p/input[@type='submit']");
    private final By CATEGORY_NAME = By.name("category");
    private final By ASSEMBLY_LANGUAGE_NAME_CATEGORY = By.xpath("//select[@name='category']/option[@value='3']");
    private final By TITLE_H2 = By.xpath("//div[@id='main']/h2");
    private final By TEXT_H3 = By.xpath("//div[@id='main']/h3");

    private final By ERROR_MESSAGE_INVALID_SEC_COD = By.xpath("//div[@id='main']/p");
    private final By ERROR_MESSAGE = By.xpath("//div[@id='main']/p[@style]");
    private final By SPAN_IMPORTANT = By.xpath("//div[@id='main']/ul/li/span/b");
    private final By IMG_CAPTCHA = By.xpath("//input[@name='captcha']/following-sibling::img");
    private final By CATEGORY_LIST = By.xpath("//select[@name='category']/option");

    public SubmitNewLanguagePage(WebDriver driver) {

        super(driver);
    }

    public WebElement getEmailName() {

        return getDriver().findElement(EMAIL_NAME);
    }

    public WebElement getAuthorName() {

        return getDriver().findElement(AUTHOR_NAME);
    }

    public WebElement getSecurityCodeName() {

        return getDriver().findElement(SECURITY_CODE_NAME);
    }

    public WebElement getCodeName() {

        return getDriver().findElement(CODE_NAME);
    }

    public WebElement getLanguageName() {

        return getDriver().findElement(LANGUAGE_NAME);
    }

    public WebElement getButtonSubmitLanguage() {

        return getDriver().findElement(BUTTON_SUBMIT_LANGUAGE);
    }

    public WebElement getCategoryName() {

        return getDriver().findElement(CATEGORY_NAME);
    }

    public WebElement getCategoryAssemblyLanguage() {

        return getDriver().findElement(ASSEMBLY_LANGUAGE_NAME_CATEGORY);
    }
    public WebElement getTitleH2() {

        return getDriver().findElement(TITLE_H2);
    }

    public WebElement getTitleH3() {

        return getDriver().findElement(TEXT_H3);
    }

    public WebElement getErrorMessageInvalidSecCode() {

        return getDriver().findElement(ERROR_MESSAGE_INVALID_SEC_COD);
    }

    public WebElement getErrorMessage() {

        return getDriver().findElement(ERROR_MESSAGE);
    }

    public WebElement getSpanImportant() {

        return getDriver().findElement(SPAN_IMPORTANT);
    }

    public String getAttributeSrcOfCaptcha() {

        return getDriver()
                .findElement(IMG_CAPTCHA)
                .getAttribute("src");
    }

    public  List <String> getCategoryText() {

        List<WebElement> category_list = getDriver().findElements(CATEGORY_LIST);
        List<String> text = new ArrayList<>();
        for (WebElement dropDown : category_list) {
            text.add(dropDown.getText());
        }

        return text;
    }

    public String getTitleH3Text() {

        return getTitleH3().getText();
    }

    public String getTitleH2Text() {

        return getTitleH2().getText();
    }

    public String getErrorMessageInvalidSecCodeText() {

        return  getErrorMessageInvalidSecCode().getText();
    }

    public String getErrorMessageText() {

        return getErrorMessage().getText();
    }

    public SubmitNewLanguagePage clickButtonSubmitLanguage() {
        getButtonSubmitLanguage().click();

        return new SubmitNewLanguagePage(getDriver());
    }

    public SubmitNewLanguagePage clickCategoryName() {
        getCategoryName().click();

        return new SubmitNewLanguagePage(getDriver());
    }

    public SubmitNewLanguagePage clickCategoryAssemblyLanguage(){
        getCategoryAssemblyLanguage().click();

        return new SubmitNewLanguagePage(getDriver());
    }

    public SubmitNewLanguagePage fillLanguageName(){
        getLanguageName().sendKeys(getRandomStr(5));

        return this;
    }

    public SubmitNewLanguagePage fillAuthorName(){
        getAuthorName().sendKeys(getRandomStr(5));

        return this;
    }

    public SubmitNewLanguagePage fillEmailName(){
        getEmailName().sendKeys(getRandomStr(5));

        return this;
    }
    public SubmitNewLanguagePage fillSecurityCode(){
        getSecurityCodeName().sendKeys("5555");

        return this;
    }

    public SubmitNewLanguagePage fillCodeName(){
        getCodeName().sendKeys(getRandomStr(5));

        return this;
    }
}