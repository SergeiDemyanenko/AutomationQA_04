package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class TopListAssemblyPage extends BasePage {

    private final By H2_TABLE_NAME_ASSEMBLY = By.xpath("//div[@id='main']/h2");

    public TopListAssemblyPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getH2TableAssembly() {

        return getDriver().findElement(H2_TABLE_NAME_ASSEMBLY);
    }

    public String getH2TableAssemblyName() {

        return getH2TableAssembly().getText();
    }
}
