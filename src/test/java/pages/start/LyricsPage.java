package pages.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LyricsPage extends BaseStartPage {

    public LyricsPage(WebDriver driver) {

        super(driver);
    }

    public String getSongLyricsText() {
        StringBuilder result = new StringBuilder();

        for (WebElement p : getPTags()) {
            result.append(p.getText());
        }

        return result.toString();
    }
}
