package pages.browse_languages.languages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguagesPage extends BaseLanguagesPage<LanguagesPage> {

    private final By INFO_LINK = By.xpath("//div[@id='main']/table/tbody/tr[5]/td[2]/a");

    public LanguagesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {
        return new LanguagesPage(getDriver());
    }

    public WebElement getInfoLink() {

        return getDriver().findElement(INFO_LINK);
    }

    public void clickInfoLink() {

        getInfoLink().click();
    }

}
