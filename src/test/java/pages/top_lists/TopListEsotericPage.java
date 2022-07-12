package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class TopListEsotericPage extends BasePage {

    private final By H2_TABLE_NAME_ESOTERIC = By.xpath("//div[@id='main']/h2");

    public TopListEsotericPage(WebDriver driver) {

       super(driver);
    }

    public WebElement getH2TableEsoteric() {

        return getDriver().findElement(H2_TABLE_NAME_ESOTERIC);
    }

    public String getH2TableEsotericName() {

        return getH2TableEsoteric().getText();
    }
}
