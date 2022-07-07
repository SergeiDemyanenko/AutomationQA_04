package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class YPage {

    private WebDriver driver;

    private final By ALL_TR_Y_LANGUAGES = By.xpath("//tr[@onmouseover]");

    public YPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public List<WebElement> getAllTrs() {

        return getDriver().findElements(ALL_TR_Y_LANGUAGES);
    }

    public int getNumberOfLanguages() {

        return getAllTrs().size();
    }
}

