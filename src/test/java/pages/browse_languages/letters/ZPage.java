package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ZPage {

    private WebDriver driver;

    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");

    private final By P_TAGS = By.xpath("//div[@id='main']/p");

    private final By MAIN_TABLE_HEADING = By.xpath("//table[@id='category']//th");

    private final By NAMES_OF_LANGUAGE_Z= By.xpath("//table[@id='category']//tr/td[1]");

    public ZPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getH2(){

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2Text(){

        return getH2().getText();
    }

    public List<WebElement> getPTags() {

        return getDriver().findElements(P_TAGS);
    }

    public String getPTagsText() {

        StringBuilder result = new StringBuilder();

        for (WebElement p : getPTags()) {
            result.append(p.getText());
        }

        return result.toString();
    }

    public List<WebElement> getCategoryOfTable() {

        return getDriver().findElements(MAIN_TABLE_HEADING);
    }

    public String getCategoryText() {

        StringBuilder result = new StringBuilder();

        for (WebElement th : getCategoryOfTable()) {
            result.append(" ").append(th.getText());
        }
        result.deleteCharAt(0);

        return result.toString();
    }
    public List<WebElement> getNamesOfLanguageZ() {

        return getDriver().findElements(NAMES_OF_LANGUAGE_Z);
    }

    public String getNamesText() {
        StringBuilder result = new StringBuilder();

        for (WebElement names : getNamesOfLanguageZ()) {
            result.append(names.getText()).append("\n");
        }
        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }
}
