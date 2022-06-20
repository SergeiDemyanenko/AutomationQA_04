package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPage {

    private final WebDriver driver;

    private final By H2_TITLE_C = By.xpath("//div[@id='main']/h2");
    private final By DESCRIPTION_C = By.xpath("//div[@id='main']/p[text()]");


    public CPage(WebDriver existingDriver) {

        this.driver = existingDriver;
   }

    protected WebDriver getDriver() {

        return driver;
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
}
