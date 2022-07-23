package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {

        return driver;
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    public List<String> getTexts(List<WebElement> elements) {
        List<String> texts = new ArrayList<>();

        for (WebElement element : elements) {
            texts.add(getText(element));
        }

        return texts;
    }

    public String getLink(WebElement element) {

        return element.getAttribute("href");
    }

    public List<String> getLinks(List<WebElement> elements) {
        List<String> links = new ArrayList<>();

        for (WebElement element : elements) {
            links.add(getLink(element));
        }

        return links;
    }

    public String getTitle() {

        return getDriver().getTitle();
    }

    public String getURL() {

        return getDriver().getCurrentUrl();
    }
}
