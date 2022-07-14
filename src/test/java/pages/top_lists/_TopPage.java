package pages.top_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public abstract class _TopPage extends BasePage {

    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");
    private final By TR_TAGS = By.xpath("//table[@id='category']/tbody/tr[@onmouseover]");
    private final By TH_TAGS = By.xpath("//table[@id='category']/tbody/tr/th");
    private final By TD_LINKS = By.xpath("//table[@id='category']/tbody/tr[@onmouseover]/td/a");

    public _TopPage(WebDriver driver){

        super (driver);
    }

    public WebElement findElementH2Header() {

        return findElement(H2_HEADER);
    }

    public String getTextH2Header() {

        return getText(findElement(H2_HEADER));
    }

    public List<WebElement> getThTags() {

        return findElements(TH_TAGS);
    }

    public String getTextStringThTags() {

        StringBuilder result = new StringBuilder();

        for (WebElement th : getThTags()) {
            result.append(getText(th)).append(" ");
        }

        return result.toString().trim();
    }

    public List<WebElement> getTrTags() {

        return findElements(TR_TAGS);
    }

    public int getCountTrTags() {

        return getTrTags().size();
    }

    public List<String> getTextListTrTags() {

        List<String> allTrs = new ArrayList<>();

        for (WebElement tr : getTrTags()) {
            allTrs.add(getText(tr));
        }

        return allTrs;
    }

    public String getTextOneElementFromListTrs(int index){

        return getTextListTrTags().get(index);
    }

}