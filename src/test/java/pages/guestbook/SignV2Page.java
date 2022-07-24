package pages.guestbook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.TestUtils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static runner.TestUtils.createStringBuilder;
import static runner.TestUtils.getRandomStr;

public class SignV2Page extends BaseGuestbookPage {

    private final String INPUT_PATH = "//input[@name=";
    private final By INPUT_HOMEPAGE = By.xpath(INPUT_PATH + "'homepage']");
    private final By INPUT_NAME = By.xpath(INPUT_PATH + "'name']");
    private final By INPUT_LOCATION = By.xpath(INPUT_PATH + "'location']");
    private final By INPUT_EMAIL = By.xpath(INPUT_PATH + "'email']");
    private final By INPUT_CAPTCHA = By.xpath(INPUT_PATH+ "'captcha']");

    private final String ERROR_PATH = "//div[@id='main']/p";
    private final By ERROR_MESSAGE = By.xpath(ERROR_PATH);
    private final By ERROR_MESSAGE_TAG_FONT = By.xpath(ERROR_PATH + "/b");

    private final By INPUT_COMMENT = By.xpath("//textarea[@name='comment']");
    private final By BUTTON_SUBMIT = By.xpath("//input[@type='submit']");
    private final By IMG_CAPTCHA_PHP = By.cssSelector("img[src*='captcha']");
    private final By P_ADDENTRY = By.xpath("//form[@id='addentry']/p/strong");

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ZERO);

    public SignV2Page(WebDriver driver) {

        super(driver);
    }

    WebDriverWait getWait() {

        return wait;
    }

    public WebElement getButtonSubmit() {

        return getDriver().findElement(BUTTON_SUBMIT);
    }

    protected WebElement getInputHomepage2() {

        return getDriver().findElement(INPUT_HOMEPAGE);
    }

    protected WebElement getInputCaptcha() {

        return getDriver().findElement(INPUT_CAPTCHA);
    }

    public WebElement getErrorMessage() {

        return getDriver().findElement(ERROR_MESSAGE);
    }

    public String getErrorMessageText() {

        return getText(getErrorMessage());
    }

    protected WebElement getInputHomepage() {

        return getDriver().findElement(INPUT_HOMEPAGE);
    }

    protected WebElement getInputName() {

        return getDriver().findElement(INPUT_NAME);
    }

    protected WebElement getInputLocation() {

        return getDriver().findElement(INPUT_LOCATION);
    }

    protected WebElement getInputEmail() {

        return getDriver().findElement(INPUT_EMAIL);
    }

    protected WebElement getInputComment() {

        return getDriver().findElement(INPUT_COMMENT);
    }

    protected String getTagName(WebElement element) {

        return element.getTagName();
    }

    public String getErrorMessageTagFont() {

        return getTagName(getDriver().findElement(ERROR_MESSAGE_TAG_FONT));
    }

    protected List<WebElement> getListImgCaptcha() {

        return getDriver().findElements(IMG_CAPTCHA_PHP);
    }

    protected List<WebElement> getListPAddentry(){

        return getDriver().findElements(P_ADDENTRY);
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    protected String getAttribute(WebElement element, String attribute) {

        return element.getAttribute(attribute);
    }

    public String getInputHomepageAttribute() {

        return getAttribute(getInputHomepage(), "value");
    }

    protected void inputText(WebElement element, String inputText) {
        element.sendKeys(inputText);
    }

    public SignV2Page clickButtonSubmit() {
        getButtonSubmit().click();

        return this;
    }

    public SignV2Page setInputName(String name) {
        getInputName().click();
        getInputName().sendKeys(name);

        return this;
    }

    public void inputName(String name) {
        inputText(getInputName(), name);
    }

    public void inputLocation(String location) {
        inputText(getInputLocation(), location);
    }

    public void setInputLocation(String location) {
        getInputLocation().click();
        getInputLocation().sendKeys(location);
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

    public void setInputHomepage(String homepage) {
        getInputHomepage2().click();
        getInputHomepage2().sendKeys(homepage);
    }

    public void inputCaptcha(int length) {
        inputText(getInputCaptcha(), Integer.toString(TestUtils.getRandomNumbers(length)));
    }

    public void setInputCapcha(String capcha) {
        getInputCaptcha().click();
        getInputCaptcha().sendKeys(capcha);
    }

    public void inputComment(String comment) {
        inputText(getInputComment(), comment);
    }

    public SignV2Page setInputComment(String comment) {
        getInputComment().click();
        getInputComment().sendKeys(comment);

        return this;
    }

    public String getErrorMessageAttributeStyle() {

        return getAttribute(getErrorMessage(), "style");
    }

    protected String getAttributeName(String cssSelector) {
        StringBuilder sb = new StringBuilder();
        sb
                .append("img[alt='")
                .append(cssSelector)
                .append("']");

        return getDriver()
                .findElement(By.cssSelector(sb.toString()))
                .getAttribute("src");
    }

    public String getAttributesSrcOfImg() {
        String ln = "\n";
        StringBuilder sb = new StringBuilder();

        return sb
                .append(getAttributeName("Web Address"))
                .append(ln)
                .append(getAttributeName("Email Address"))
                .append(ln)
                .append(getAttributeName("Bold Text"))
                .append(ln)
                .append(getAttributeName("Italic Text"))
                .append(ln)
                .append(getAttributeName("Underlined Text"))
                .toString();
    }

    public boolean isImgCaptchaDisplayed() {
        if (getListImgCaptcha().size() != 0) {

            return getListImgCaptcha().get(0).isDisplayed();
        } else {

            return false;
        }
    }

    public SignV2Page fillAllFields() {
        inputName(getRandomStr(3));
        inputLocation(getRandomStr(6));
        inputEmail(getRandomStr(8));
        inputHomepage(getRandomStr(4));
        inputCaptcha(3);
        inputComment(getRandomStr(40));

        return this;
    }

    protected WebElement getPrompt(String type) {

        return getDriver().findElement(By.xpath(
                createStringBuilder()
                        .append("//img[@src='/images/bb/bb")
                        .append(type)
                        .append(".gif']")
                        .toString()));
    }

    protected String getTextPrompt() {
        Alert alert = getWait().until(ExpectedConditions.alertIsPresent());

        String a = alert.getText();

        alert.dismiss();

        return a;
    }

    protected String getTextFromPrompt1() {
        getPrompt("url").click();

        Alert alert = getWait().until(ExpectedConditions.alertIsPresent());

        String a = alert.getText();

        alert.dismiss();
        alert.dismiss();

        return a;
    }

    protected String getTextFromPrompt2() {
        getPrompt("email").click();

        return getTextPrompt();
    }

    protected String getTextFromPrompt3() {
        getPrompt("bold").click();

        return getTextPrompt();
    }

    protected String getTextFromPrompt4() {
        getPrompt("italic").click();

        return getTextPrompt();
    }

    protected String getTextFromPrompt5() {
        getPrompt("underline").click();

        return getTextPrompt();
    }

    public String getTextFromPrompts() {
        String ln ="\n";

        return createStringBuilder()
                .append(getTextFromPrompt1())
                .append(ln)
                .append(getTextFromPrompt2())
                .append(ln)
                .append(getTextFromPrompt3())
                .append(ln)
                .append(getTextFromPrompt4())
                .append(ln)
                .append(getTextFromPrompt5())
                .toString();
    }

    public String getNamesGeneralFields() {
        List<String> list = new ArrayList<>();

        for (WebElement p : getListPAddentry()) {
            list.add(p.getText());
        }

        return list.toString()
                .replace("[", "")
                .replace("]" ,"");
    }
}