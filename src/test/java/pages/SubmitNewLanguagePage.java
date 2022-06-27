package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubmitNewLanguagePage {

    private WebDriver driver;

    private final By SPAN_IMPORTANT =By.xpath("//div[@id='main']/ul/li/span/b");

    private final By BUTTON_SUBMIT_LANGUAGE = By.xpath("//div/div/form[@id='addlanguage']/p/input[@type='submit']");

    private final By ERROR_MESSAGE = By.xpath("//div[@id='main']/p[@style]");

    private final By FIELD_CATEGORY = By.xpath("//select[@name='category']");

    private final By TITLE_H2 = By.xpath("//div[@id='main']/h2");

    public SubmitNewLanguagePage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getSPAN_IMPORTANT() {

        return getDriver().findElement(SPAN_IMPORTANT);
    }

    public String getSPAN_IMPORTANTSCC_Value(String value) {

        return getSPAN_IMPORTANT().getCssValue(value);
    }

    public WebElement getButtonSubmitLanguage(){

        return getDriver().findElement(BUTTON_SUBMIT_LANGUAGE);
    }

    public void getButtonSubmitLanguageClick() {

        getButtonSubmitLanguage().click();
    }

    public WebElement getErrorMessage(){

        return getDriver().findElement(ERROR_MESSAGE);
    }

    public String getErrorMessageText() {

        return getErrorMessage().getText();
    }

    public WebElement getField_Category() {

        WebElement category = getDriver().findElement(FIELD_CATEGORY);

        return category;
    }

    public void getField_CategoryClick() {getField_Category().click();}

    public WebElement getTitleH2() {

        return getDriver().findElement(TITLE_H2);
    }

    public String getTitleH2Text() {

        return getTitleH2().getText();
    }
}
