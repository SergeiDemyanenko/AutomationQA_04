package pages.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class InfoPage extends BasePage {

    private WebDriver driver;

    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");
    private final By PRE_ELEMENTS = By.xpath("//div[@id='main']/pre");
    private static final By MIRRORS_1 = By.xpath("//a[@href='/mirrors/1/']");

    public InfoPage(WebDriver driver){

        super(driver);
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2HeaderText() {

        return getH2Header().getText();
    }



    public String getCodeOfLanguageBasic() {

        final String LANG_VERSION = "REM BASIC Version of 99 ";

        List<WebElement> preElements = getDriver().findElements(PRE_ELEMENTS);
        List<String> listPreText = new ArrayList<>();

        for (WebElement pre : preElements) {
            if (pre.getText().contains(LANG_VERSION)) {
                listPreText.add(pre.getText());
            }
        }

        String Code
                = listPreText.toString()
                .replace("     ", "")
                .replace("[", "")
                .replace("]", "");

        return Code;
    }

    public WebElement getLinkMirrors1() {
        return getDriver().findElement(MIRRORS_1);
    }
}
