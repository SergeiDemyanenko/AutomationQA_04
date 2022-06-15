package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MPage {

    private WebDriver driver;

    private final By M_PAGE = By.xpath("//a[@href='m.html']");
    private final By MATHEMATICA_PAGE = By.xpath("//a[@href='language-mathematica-1090.html']");
    private final By BRENTON_BOSTICK = By.xpath("//table[@style='margin: 7px; padding: 0;;']/tbody[1]/tr[2]/td[2]");

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
}
