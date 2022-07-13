package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.letters._LettersPage;

public class TopListRealPage extends _LettersPage {

    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");

    public TopListRealPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getTextH2Header() {

        return getH2Header().getText();
    }

    public String getTextOneElementFromListTrs(int index){

        return getTextListTrTags().get(index);
    }
}