package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopListNewLanguagesThisMonthPage {

    private final By H2_TABLE_NAME_NEW_LANGUAGES = By.xpath("//div[@id='main']/h2");

    private WebDriver driver;

    public TopListNewLanguagesThisMonthPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }
    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getH2TableNewLanguages() {

        return getDriver().findElement(H2_TABLE_NAME_NEW_LANGUAGES);
    }

    public String getH2TableNewLanguagesName() {

        return getH2TableNewLanguages().getText();
    }

}
