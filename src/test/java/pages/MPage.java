package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MPage {

    private WebDriver driver;

    private final By M_PAGE = By.xpath("//a[@href='m.html']");
    private final By MATHEMATICA_PAGE = By.xpath("//a[@href='language-mathematica-1090.html']");
    private final By BRENTON_BOSTICK = By.xpath("//table[@style='margin: 7px; padding: 0;;']/tbody[1]/tr[2]/td[2]");
    private final By LAST_LANGUAGE = By.xpath("//table[@id='category']/tbody/tr[last()]/td/a");
    private final By LANGUAGE_MACROX =  By.xpath("//a[@href='language-macrox-371.html']");

    public MPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement MLanguagesPage() {

         return getDriver().findElement(M_PAGE);
    }

    public WebElement mathematicaPage() {

        return getDriver().findElement(MATHEMATICA_PAGE);
    }

    public WebElement BrentonBostick() {

        return getDriver().findElement(BRENTON_BOSTICK);
    }

    public WebElement getLastLanguageInM() {

        return getDriver().findElement(LAST_LANGUAGE);
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