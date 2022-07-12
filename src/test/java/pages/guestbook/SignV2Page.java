package pages.guestbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import runner.TestUtils;

import static runner.TestUtils.getRandomStr;

public class SignV2Page extends BasePage {

    private final By ERROR_MESSAGE = By.xpath("//div[@id='main']/p");
    private final By ERROR_MESSAGE_TAG_FONT = By.xpath("//div[@id='main']/p/b");
    private final By INPUT_HOMEPAGE = By.xpath("//input[@name='homepage']");
    private final By INPUT_NAME = By.xpath("//input[@name='name']");
    private final By INPUT_LOCATION = By.xpath("//input[@name='location']");
    private final By INPUT_EMAIL = By.xpath("//input[@name='email']");
    private final By INPUT_CAPTCHA = By.xpath("//input[@name='captcha']");
    private final By INPUT_COMMENT = By.xpath("//textarea[@name='comment']");
    private final By BUTTON_SUBMIT = By.xpath("//input[@type='submit']");
    private final By IMG_CAPTCHA_PHP = By.cssSelector("img[src*='captcha']");

    public SignV2Page(WebDriver driver) {

        super(driver);
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    public String getAttribute(WebElement element, String attribute) {

        return element.getAttribute(attribute);
    }

    public void inputText(WebElement element, String inputText) {
        element.sendKeys(inputText);
    }

    public String getTagName(WebElement element) {

        return element.getTagName();
    }

    public WebElement getButtonSubmit() {

        return getDriver().findElement(BUTTON_SUBMIT);
    }

    public SignV2Page clickButtonSubmit() {
        getButtonSubmit().click();

        return new SignV2Page(getDriver());
    }

    public WebElement getErrorMessage() {

        return getDriver().findElement(ERROR_MESSAGE);
    }

    public String getErrorMessageText() {

        return getText(getErrorMessage());
    }

    public WebElement getInputHomepage() {

        return getDriver().findElement(INPUT_HOMEPAGE);
    }

    public String getInputHomepageAttribute() {

        return getAttribute(getInputHomepage(), "value");
    }

    public WebElement getInputName() {

        return getDriver().findElement(INPUT_NAME);
    }

    public void setInputName(String name) {
        getInputName().click();
        getInputName().sendKeys(name);
    }

    public void inputName(String name) {
        inputText(getInputName(), name);
    }

    public WebElement getInputLocation() {

        return getDriver().findElement(INPUT_LOCATION);
    }

    public void inputLocation(String location) {
        inputText(getInputLocation(), location);

    }

    public void setInputLocation(String location) {
        getInputLocation().click();
        getInputLocation().sendKeys(location);
    }

    public WebElement getInputEmail() {

        return getDriver().findElement(INPUT_EMAIL);
    }

    public void inputEmail(String email) {
        inputText(getInputEmail(), email);
    }

    public void setInputEmail(String email) {
        getInputEmail().click();
        getInputEmail().sendKeys(email);
    }

    public void inputHomepage(String homepage) {
        inputText(getInputHomepage(), homepage);
    }

    public WebElement getInputHomepage2() {

        return getDriver().findElement(INPUT_HOMEPAGE);
    }

    public void setInputHomepage(String homepage) {
        getInputHomepage2().click();
        getInputHomepage2().sendKeys(homepage);
    }

    public WebElement getInputCaptcha() {

        return getDriver().findElement(INPUT_CAPTCHA);
    }

    public void inputCaptcha(int length) {
        inputText(getInputCaptcha(), Integer.toString(TestUtils.getRandomNumbers(length)));
    }

    public void setInputCapcha(String capcha) {
        getInputCaptcha().click();
        getInputCaptcha().sendKeys(capcha);
    }

    public WebElement getInputComment() {

        return getDriver().findElement(INPUT_COMMENT);
    }

    public void inputComment(String comment) {
        inputText(getInputComment(), comment);
    }

    public void setInputComment(String comment) {
        getInputComment().click();
        getInputComment().sendKeys(comment);
    }

    public String getErrorMessageTagFont() {

        return getTagName(getDriver().findElement(ERROR_MESSAGE_TAG_FONT));
    }

    public String getErrorMessageAttributeStyle() {

        return getAttribute(getErrorMessage(), "style");
    }

    protected String getAttributeName(String cssSelector) {

        return getDriver().findElement(
                        By.cssSelector("img[alt='".concat(cssSelector).concat("']")))
                .getAttribute("src");
    }

    public String getAttributesSrcOfImg() {

        String url = "http://www.99-bottles-of-beer.net/";
        String ln = "\n";

        return getAttributeName("Web Address")
                .concat(ln)
                .concat(getAttributeName("Email Address"))
                .concat(ln)
                .concat(getAttributeName("Bold Text"))
                .concat(ln)
                .concat(getAttributeName("Italic Text"))
                .concat(ln)
                .concat(getAttributeName("Underlined Text"))
                .replace(url, "");
    }

    public WebElement getImgCaptcha() {

        return getDriver().findElement(IMG_CAPTCHA_PHP);
    }

    public SignV2Page fillAllFieldsAndClickButtonSubmit() {
        inputName(getRandomStr(3));
        inputLocation(getRandomStr(6));
        inputEmail(getRandomStr(8));
        inputHomepage(getRandomStr(4));
        inputCaptcha(3);
        inputComment(getRandomStr(40));
        clickButtonSubmit();

        return this;
    }
}