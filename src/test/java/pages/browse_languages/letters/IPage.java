package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.BaseAbcPage;

import java.util.List;

public class IPage extends BaseAbcPage {

    private final By ALL_TR_I_LANGUAGES = By.xpath("//tr[@onmouseover]");

    public IPage(WebDriver driver) {

        super(driver);
    }

    public String getCurrentUrl() {

        return getDriver().getCurrentUrl();
    }

    public List<WebElement> getAllTrs() {

        return getDriver().findElements(ALL_TR_I_LANGUAGES);
    }

    public int getNumberOfLanguages() {

        return getAllTrs().size();
    }

    public List<String> getActualResult(List<WebElement> allTableLinks, List<String> actualResult) {
        for (int j = 1; j <= allTableLinks.size(); j++) {
            getDriver()
                    .findElement(By.xpath("//div[@id='main']/table[@id='category']/tbody/tr[@onmouseover][" + j + "]/td/a[@href]")).click();
            actualResult.add(getDriver().getCurrentUrl());
            getDriver().navigate().back();
        }
        return actualResult;
    }

    public List<String> getExpectedResult(String attribute, List<String> expectedResult) {

        for (int j = 1; j <= getCountTDLinks(); j++) {
            expectedResult.add(getDriver()
                    .findElement(By.xpath("//div[@id='main']/table[@id='category']/tbody/tr[@onmouseover][" + j + "]/td/a[@href]")).getAttribute("href"));
        }
        return expectedResult;
    }
}