package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopListTopHitsPage extends _TopPage {

    private final By SHAKESPEARE_LANGUAGE = By.xpath("//a[@href='language-shakespeare-664.html']");

    public TopListTopHitsPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getShakespeareLanguage() {

        return getDriver().findElement(SHAKESPEARE_LANGUAGE);
    }
}
