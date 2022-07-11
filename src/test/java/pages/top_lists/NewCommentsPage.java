package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class NewCommentsPage extends BasePage {

    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");
    private final By MAIN_P = By.xpath("//h2[text()='New Comments']/following-sibling::p[1]");

    public NewCommentsPage(WebDriver driver) {

        super (driver);
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

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2HeaderText() {

        return getText(getH2Header());
    }
}
