package pages.languages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A_Page extends LanguagesPage {

    private final By A_LINK = By.xpath("//div[@id='main']//a[@href='language-a+-11.html']");
    private final By REDDIT_ICON_H1 = By.xpath("//div[@class='Step__content']/h1[text()='Log in']");

    public A_Page(WebDriver driver) {
        super(driver);
    }

    public WebElement getALink() {

        return getDriver().findElement(A_LINK);
    }

    public WebElement getH1RedditIcon() {

        return getDriver().findElement(REDDIT_ICON_H1);
    }

    public String getH1RedditIconText() {

        return getH1RedditIcon().getText();
    }

    public void clickALink() {

        getALink().click();
    }
}
