package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MPage {

    private WebDriver driver;

    private final By MATHEMATICA_PAGE = By.xpath("//a[@href='language-mathematica-1090.html']");
    private final By LANGUAGE_MYSQL = By.xpath("//a[@href='language-mysql-1252.html']");
    private final By LANGUAGE_MACROX =  By.xpath("//a[@href='language-macrox-371.html']");

    public MPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement mathematicaPage() {

        return getDriver().findElement(MATHEMATICA_PAGE);
    }

    public WebElement getLastLanguageInM() {

        return getDriver().findElement(LANGUAGE_MYSQL);
    }

    public String getLastLanguageInMText() {

        return getLastLanguageInM().getText();
    }

    public WebElement getLanguageMacroX() {

        return getDriver().findElement(LANGUAGE_MACROX);
    }

    public String getlanguageMacroXVerify() {

        return getLanguageMacroX().getText();
    }
}