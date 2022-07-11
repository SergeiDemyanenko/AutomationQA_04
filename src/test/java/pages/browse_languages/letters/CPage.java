package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.browse_languages.languages.LanguageCSharp1614Page;

public class CPage extends BasePage {

    private final By H2_TITLE_C = By.xpath("//div[@id='main']/h2");
    private final By DESCRIPTION_C = By.xpath("//div[@id='main']/p[text()]");
    private final By CSHARP_LANGUAGE = By.linkText("C#");

    public CPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getDescriptionCategoryC() {

        return getDriver().findElement(DESCRIPTION_C);
    }

    public String getDescriptionCategoryCText() {

        return getDescriptionCategoryC().getText();
    }

    public WebElement getH2PageC() {

        return getDriver().findElement(H2_TITLE_C);
    }

    public String getH2PageCText() {

        return getH2PageC().getText();
    }

    public WebElement getCSharpLanguage() {

        return getDriver().findElement(CSHARP_LANGUAGE);
    }

    public LanguageCSharp1614Page clickCSharpLanguage() {
        getCSharpLanguage().click();

        return new LanguageCSharp1614Page(getDriver());
    }
