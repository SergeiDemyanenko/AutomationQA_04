package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class JPage {

    private WebDriver driver;

    private final By DESCRIPTION_J = By.xpath("//div[@id='main']/p[text()]");
    private final By H2_TITLE_J = By.xpath("//div[@id='main']/h2");
    private final By A_LINKS = By.xpath("//tbody/tr/td/a[@href]");

    public JPage(WebDriver existingDriver) {

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getDescriptionCategoryJ() {

        return getDriver().findElement(DESCRIPTION_J);
    }

    public String getDescriptionCategoryJText() {

        return getDescriptionCategoryJ().getText();
    }
    public WebElement getH2PageJ() {

        return getDriver().findElement(H2_TITLE_J);
    }

    public String getH2PageJText() {

        return getH2PageJ().getText();
    }

    public int countProgrammingLanguages() {

        List<WebElement> aHrefs
                = getDriver()
                .findElements(A_LINKS);

        List<String> listOfLanguages = new ArrayList<>();

        for (WebElement a : aHrefs) {
            listOfLanguages.add(a.getText());
        }

        return listOfLanguages.size();
    }
}
