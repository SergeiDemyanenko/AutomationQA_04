package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.BaseAbcPage;
import pages.languages.MathematicaPage;
import pages.languages.LanguagesPage;

public class MPage extends BaseAbcPage<LanguagesPage> {

    private final By MATHEMATICA_LINK = By.xpath("//a[@href='language-mathematica-1090.html']");
    private final By LANGUAGE_MACROX = By.xpath("//a[@href='language-macrox-371.html']");
    private final By LANGUAGE_MySQL = By.xpath("//a[@href='language-mysql-1252.html']");

    public MPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {

        return null;
    }

    public WebElement getMathematicaLink() {

        return getDriver().findElement(MATHEMATICA_LINK);
    }

    public WebElement getLanguageMacrox() {

        return getDriver().findElement(LANGUAGE_MACROX);
    }

    public WebElement getLanguageMysql() {

        return getDriver().findElement(LANGUAGE_MySQL);
    }

    public MathematicaPage clickMathematicaPage() {
        getMathematicaLink().click();

        return new MathematicaPage(getDriver());
    }

    public String getLanguageMacroXVerify() {

        return getText(getLanguageMacrox());
    }

    public String getLanguageMySQLText() {

        return getText(getLanguageMysql());
    }
}