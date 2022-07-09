package pages.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class LyricsPage extends BasePage {

    private final By P_TAGS = By.xpath("//div[@id='main']/p");

    public LyricsPage(WebDriver driver) {

        super(driver);
    }

    public List<WebElement> getPTags() {

        return getDriver().findElements(P_TAGS);
    }

    public String getSongLyricsText() {
        StringBuilder result = new StringBuilder();

        for (WebElement p : getPTags()) {
            result.append(p.getText());
        }

        return result.toString();
    }
}
