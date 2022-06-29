package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TeamPage {

    private WebDriver driver;

    private final By H3_TEAM_NAME = By.xpath("//div[@id = 'main']/h3");

    @FindBy(xpath = "//div[@id='main']/p[2]")
    private WebElement textAuthorOliverSchade;

    @FindBy(xpath = "//div[@id='main']/p[4]")
    private WebElement textAuthorGregorScheithauer;

    @FindBy(xpath = "//div[@id='main']/p[6]")
    private WebElement textAuthorStefanScheler;


    public TeamPage(WebDriver existingDriver) {

        this.driver = existingDriver;
        PageFactory.initElements(getDriver(), this);
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public List<WebElement> getListH3TeamName() {

        return getDriver().findElements(H3_TEAM_NAME);
    }

    public List<String> getTextFromAuthors() {

        List<String> textFromAllAuthors =
                List.of(textAuthorOliverSchade.getText(), textAuthorGregorScheithauer.getText(), textAuthorStefanScheler.getText());

        return textFromAllAuthors;
    }
}