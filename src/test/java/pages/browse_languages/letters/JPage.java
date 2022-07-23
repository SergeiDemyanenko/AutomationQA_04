package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.browse_languages.BaseAbcPage;
import pages.languages.Java3Page;
import pages.languages.LanguagesPage;

import java.util.List;

public class JPage extends BaseAbcPage<LanguagesPage> {

    private final By lINK_LANGUAGE_JAVA_3 = By.xpath("//table[@id='category']//a[@href='language-java-3.html']");

    public JPage(WebDriver driver) {

        super(driver);
    }

    @Override
    protected LanguagesPage createLangPage() {
        return null;
    }

    public WebElement getLinkLanguageJava3() {

        return getDriver().findElement(lINK_LANGUAGE_JAVA_3);
    }

    public Java3Page clickLinkLanguageJava3() {

        getLinkLanguageJava3().click();

        return new Java3Page(getDriver());
    }

    public List<String> getH2MainAndPTagText() {

        return List.of(getH2MainText(), getTextPTag());
    }

    public String getTrText(String languageName) {
        StringBuilder actualResult = new StringBuilder();

        for (String tr : getTextListTrTags()) {
            if (tr.contains(languageName)) {

                return actualResult.append(tr).toString();
            }
        }

        return null;
    }
}