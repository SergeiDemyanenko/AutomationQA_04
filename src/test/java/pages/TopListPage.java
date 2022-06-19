package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopListPage {
    private WebDriver driver;

    private final By TopLists = By.xpath("//div[@id='navigation']/a[@href='/toplist.html'");
    private final By H2_Title = By.xpath("//div[@id='main']/h2");

    public TopListPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }
    public WebElement getTopLists() {

        return getDriver().findElement(TopLists);
    }

    public WebElement getH2Title() {

        return getDriver().findElement(H2_Title);
    }

    public String getH2_Title() {

        return getH2_Title().getText();
    }
}
