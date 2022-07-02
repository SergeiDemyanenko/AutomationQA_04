package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class JPage {

    private WebDriver driver;

    private final By P_TAG_TEXT = By.xpath("//div[@id='main']/p[text()]");
    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");
    private final By TH_TAGS = By.xpath("//table[@id='category']//th");
    private final By ALL_A_LINKS = By.xpath("//tbody/tr/td/a[@href]");
    private final By lINK_LANGUAGE_JAVA_3 = By.xpath("//table[@id='category']//a[@href='language-java-3.html']");

    public JPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    public WebElement getPTag() {

        return getDriver().findElement(P_TAG_TEXT);
    }

    public String getPTagText() {

        return getPTag().getText();
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2HeaderText() {

        return getH2Header().getText();
    }

    protected List<String> getAllALinks() {

        List<WebElement> aHrefs
                = getDriver()
                .findElements(ALL_A_LINKS);

        List<String> listOfLanguages = new ArrayList<>();

        for (WebElement a : aHrefs) {
            listOfLanguages.add(a.getText());
        }

        return listOfLanguages;
    }

    public int getQuantityALinks() {

        return getAllALinks().size();
    }

    public  WebElement getLinkLanguageJava3() {

        return getDriver().findElement(lINK_LANGUAGE_JAVA_3);
    }

    public void clickLinkLanguageJava3() {

        getLinkLanguageJava3().click();
    }

    public String getLanguageJavascript1948() {

        for (String language : getAllALinks()) {

            if (
                    getAllALinks().size() != 0
                            && language.equals("JavaScript")
            ) {
                return language;
            }
        }

        return null;
    }

    public void clickLanguageJavascript1948() {

        getDriver().findElement(
                        By.linkText(
                                getLanguageJavascript1948()
                        )
                )
                .click();
    }

    public List<WebElement> getThTags() {

        return getDriver().findElements(TH_TAGS);
    }

    public String getTextThTags(){

        StringBuilder result = new StringBuilder();

        for(WebElement th : getThTags()) {
            result.append(getText(th)).append(" ");
        }

        return result.toString();
    }
}