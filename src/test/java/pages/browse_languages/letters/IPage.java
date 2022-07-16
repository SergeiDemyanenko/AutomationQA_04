package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseTablePage;
import pages.browse_languages.languages.BaseLanguagePage;
import pages.browse_languages.languages.CLanguagesPage;

import java.util.List;

public class IPage extends BaseLetterPage {

    public IPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected BaseLanguagePage createLangPage() {
        return null;
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