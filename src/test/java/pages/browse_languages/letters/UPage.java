package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UPage {

    private WebDriver driver;

    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");
    private final By TABLE_U = By.xpath("//tbody/tr[@onmouseover]");

    public UPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public List<WebElement> getTableU() {

        return getDriver().findElements(TABLE_U);
    }

    public int countLanguagesU() {

        return getTableU().size();
    }

    public WebElement getH2PageU() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2PageUText() {

        return getH2PageU().getText();
    }
}
