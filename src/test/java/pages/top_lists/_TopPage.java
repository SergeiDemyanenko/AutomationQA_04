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

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public List<WebElement> getThTags() {

        return getDriver().findElements(TH_TAGS);
    }

    public List<WebElement> getTrTags() {

        return getDriver().findElements(TR_TAGS);
    }

    public List<WebElement> getTdLinks() {

        return getDriver().findElements(TD_LINKS);
    }

    public WebElement getRandomTdLink(){

        return getTdLinks().get(randomIndex());
    }

    public int countTdLinks() {

        return getTdLinks().size();
    }

    public int countTrTags() {

        return getTrTags().size();
    }

    public String getTextH2Header() {

        return getText(getH2Header());
    }

    public List<String> getTextListTrTags() {

        List<String> allTrs = new ArrayList<>();

        for (WebElement tr : getTrTags()) {
            allTrs.add(getText(tr));
        }

        return allTrs;
    }

    public String getTextStringThTags() {

        StringBuilder result = new StringBuilder();

        for (WebElement th : getThTags()) {
            result.append(th.getText()).append(" ");
        }

        return result.toString().trim();
    }

    public String getTextOneElementFromListTrs(int index){

        return getTextListTrTags().get(index);
    }

    public int randomLanguage() {

        return (int) (Math.random() * countTdLinks()) + 1;
    }

    public int randomIndex() {

        return randomLanguage() - 1;
    }
}