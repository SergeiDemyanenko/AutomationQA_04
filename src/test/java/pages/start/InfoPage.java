package pages.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Mirrors1Page;

import java.util.ArrayList;
import java.util.List;

public class InfoPage extends BaseStartPage {

    private final By PRE_ELEMENTS = By.xpath("//div[@id='main']/pre");
    private static final By MIRRORS_1 = By.xpath("//div[@id='main']/p/a[@href='/mirrors/1/']");
    private final By IMAGE_HISTORY1 = By.xpath("//div[@id='main']/p/a/img[@src='/images/history1_small.png']");

    public InfoPage(WebDriver driver){

        super(driver);
    }

    public List<WebElement> getPreElements() {

        return getDriver().findElements(PRE_ELEMENTS);
    }

    public WebElement getMirrors1() {

        return getDriver().findElement(MIRRORS_1);
    }

    public WebElement getImageHistory1() {

        return getDriver().findElement(IMAGE_HISTORY1);
    }
    
    public String getLanguageBasicCode(String languageVersion) {
        List<String> listPreText = new ArrayList<>();

        for (WebElement pre : getPreElements()) {
            if (pre.getText().contains(languageVersion)) {
                listPreText.add(pre.getText());
            }
        }

        String code
                = listPreText.toString()
                .replace("     ", "")
                .replace("[", "")
                .replace("]", "");

        return code;
    }

    public Mirrors1Page clickLocalCopyLink() {
        getMirrors1().click();

        return new Mirrors1Page(getDriver());
    }

    public void clickImageHistory1(){
        getImageHistory1().click();
    }
}
