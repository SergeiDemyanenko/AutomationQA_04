package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DPage {

    private final WebDriver driver;

    @FindBy(xpath = "//div[@id='main']/h2")
    private WebElement H2_HEADER;

    @FindBy(xpath = "//div[@id='main']//p[text()]")
    private WebElement DESCRIPTION;

    public DPage(WebDriver existingDriver) {

        this.driver = existingDriver;
        PageFactory.initElements(getDriver(), this);
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public String getH2HeaderText() {

        return H2_HEADER.getText();
    }

    public String getDescriptionText() {

        return DESCRIPTION.getText();
    }
}
