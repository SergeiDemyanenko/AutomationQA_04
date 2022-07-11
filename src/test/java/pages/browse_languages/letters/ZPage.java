package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZPage extends _LettersPage {

    public ZPage(WebDriver driver) {

        super(driver);
    }

    public String getNamesText() {
        StringBuilder result = new StringBuilder();

        for (WebElement names : getWebElementsTDLanguageNames()) {
            result.append(names.getText()).append("\n");
        }
        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }

    public WebElement getRandomNameOfZ() {
        int index =
                (int) (Math.random() * (getWebElementsTDLanguageNames().size() - 1)) + 1;

        return getDriver()
                .findElement(By.xpath(
                        "//table[@id='category']/tbody/tr[@onmouseover][" + index + "]/td/a"));
    }
}