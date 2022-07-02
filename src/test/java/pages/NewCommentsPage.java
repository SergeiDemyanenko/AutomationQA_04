package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCommentsPage {
    private WebDriver driver;

    private final By H2_MAIN = By.xpath("//div[@id='main']/h2");
    private final By MAIN_P = By.xpath("//h2[text()='New Comments']/following-sibling::p[1]");

    public NewCommentsPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    public WebElement getMainP() {

        return getDriver().findElement(MAIN_P);
    }

    public String getTextMainP() {

        return getText(getMainP());
    }

    public WebElement getH2Main() {

        return getDriver().findElement(H2_MAIN);
    }

    public String getTextH2Main() {

        return getText(getH2Main());
    }
}
