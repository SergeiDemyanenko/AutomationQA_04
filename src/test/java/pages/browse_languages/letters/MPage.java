package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MPage extends _LettersPage {

    private final By MATHEMATICA_PAGE = By.xpath("//a[@href='language-mathematica-1090.html']");
    private final By LANGUAGE_MACROX = By.xpath("//a[@href='language-macrox-371.html']");

    public MPage(WebDriver driver) {

        super(driver);
    }

    public void clickMathematicaPage() {
        clickWebElement(findElement(MATHEMATICA_PAGE));
    }

    public String getlanguageMacroXVerify() {

        return getText(findElement(LANGUAGE_MACROX));
    }
}