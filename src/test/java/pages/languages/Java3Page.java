package pages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java3Page extends LanguagesPage {

    private final By ALTERNATIVE_VERSIONS = By.xpath("//table[@id='category']//tr[@onmouseover]");
    private final By OBJECT_ORIENTED_VERSION = By.xpath("//div[@id='main']/p[text()='(object-oriented version)']");
    private final By MAIN_VERSION_COMMENTS = By.xpath("//strong[contains(text(),'Comments')]/parent::td/parent::tr/td[2]");
    private final By COMMENTS_HEADER = By.xpath("//p[@class='commentheader']");
    private final By STANDARD_VERSION = By.xpath("//a[@href='language-java-4.html']");

    public Java3Page(WebDriver driver) {

        super(driver);
    }

    public List<WebElement> getAlternativeVersions() {
        
        return getDriver().findElements(ALTERNATIVE_VERSIONS);
    }

    public WebElement getObjectOrientedVersion() {
        
        return getDriver().findElement(OBJECT_ORIENTED_VERSION);
    }

    public int getCountOfCommentsHeaders() {

        return getDriver().findElements(COMMENTS_HEADER).size();
    }

    public WebElement getMainVersionComments() {

        return getDriver().findElement(MAIN_VERSION_COMMENTS);
    }

    public WebElement getStandardVersion() {

        return getDriver().findElement(STANDARD_VERSION);
    }

    private Map<Integer, String> getAllVersionsNameAndComment() {
        Map<Integer, String> allVersionsNameAndComment = new HashMap<>();

        int mainVersionComments = Integer.parseInt(getMainVersionComments().getText());
        String mainVersionName = getObjectOrientedVersion().getText().replaceAll("[()]", "");
        allVersionsNameAndComment.put(mainVersionComments, mainVersionName);

        for (int i = 1; i <= getAlternativeVersions().size(); i++) {
            int numberOfComments = Integer.parseInt(getDriver().findElement(
                    By.xpath(String.format("//tr[starts-with(@onmouseover,'setPointer')][%s]/td[4]", i))).getText());
            String name = getDriver().findElement(
                    By.xpath(String.format("//tr[starts-with(@onmouseover,'setPointer')][%s]/td/a", i))).getText();
            allVersionsNameAndComment.put(numberOfComments, name);
        }

        return allVersionsNameAndComment;
    }

    public String getNameVersionWithMaxComments() {

        return getAllVersionsNameAndComment()
                .get(Collections
                        .max(getAllVersionsNameAndComment()
                                .keySet()));
    }

    public Java4Page clickStandardVersionPage() {
        getStandardVersion().click();

        return new Java4Page(getDriver());
    }

    public int numberOfVersions () {
        int numberOfVersions = 0;
        String versionName = getObjectOrientedVersion().getText();

        numberOfVersions++;

        String[] versionArr = new String[5];
        for (int i = 0; i < versionArr.length; i++) {
            versionArr[i]
                    = getDriver()
                    .findElement(
                            By.xpath("//table[@id='category']/tbody/tr[" + (i + 2) + "]"))
                    .getText();
            if (!versionArr[i].contains(versionName)) {
                numberOfVersions++;
            }
        }
        return numberOfVersions;
    }
}