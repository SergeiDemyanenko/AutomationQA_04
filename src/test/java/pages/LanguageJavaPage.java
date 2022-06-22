package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LanguageJavaPage {

    private WebDriver driver;

    public final By commentheader = By.xpath("//p[@class='commentheader']");

    public LanguageJavaPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public int getAmmountOfCommentheaders() {

        List<WebElement> Commentheaderslist;
        Commentheaderslist = getDriver().findElements(commentheader);

        int count = Commentheaderslist.size();

        return count;
    }
}
