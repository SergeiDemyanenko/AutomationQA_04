package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class TopListTopHitsPage extends BasePage {

    private final By H2_TABLE_NAME_TOP_HITS = By.xpath("//div[@id='main']/h2");
    private final By SHAKESPEARE_LANGUAGE = By.xpath("//a[@href='language-shakespeare-664.html']");

    public TopListTopHitsPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getH2TableTopHits() {

        return getDriver().findElement(H2_TABLE_NAME_TOP_HITS);
    }

    public String getH2TableTopHitsName() {

        return getH2TableTopHits().getText();
    }

    public WebElement getShakespeareLanguage() {

        return getDriver().findElement(SHAKESPEARE_LANGUAGE);
    }
}
