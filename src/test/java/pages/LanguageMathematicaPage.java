package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ListIterator;

public class LanguageMathematicaPage {

    private WebDriver driver;

    private final By BRENTON_BOSTICK = By.xpath("//table[@style='margin: 7px; padding: 0;;']/tbody[1]/tr[2]/td[2]");

    public LanguageMathematicaPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement BrentonBostick() {

        return getDriver().findElement(BRENTON_BOSTICK);
    }
}
