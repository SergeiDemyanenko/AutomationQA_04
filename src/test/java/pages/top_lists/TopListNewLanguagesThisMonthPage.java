package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class TopListNewLanguagesThisMonthPage extends BasePage {

    private final By H2_TABLE_NAME_NEW_LANGUAGES = By.xpath("//div[@id='main']/h2");

    public TopListNewLanguagesThisMonthPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getH2TableNewLanguages() {

        return getDriver().findElement(H2_TABLE_NAME_NEW_LANGUAGES);
    }

    public String getH2TableNewLanguagesName() {

        return getH2TableNewLanguages().getText();
    }

}
