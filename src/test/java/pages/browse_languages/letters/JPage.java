package pages.browse_languages.letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.browse_languages.languages.LanguageJava3Page;

import java.util.ArrayList;
import java.util.List;

public class JPage extends _LettersPage {

    private final By lINK_LANGUAGE_JAVA_3 = By.xpath("//table[@id='category']//a[@href='language-java-3.html']");

    public JPage(WebDriver driver) {

        super(driver);
    }

    public LanguageJava3Page clickLinkLanguageJava3() {

        findElement(lINK_LANGUAGE_JAVA_3).click();

        return new LanguageJava3Page(getDriver());
    }

    public void clickLanguageJavascript1948() {

        findElement(By.linkText(getLanguageFromTDLinks("JavaScript"))).click();
    }

    public List<String> getH2HeaderAndPTagText(){

        List<String> list = List.of(getH2HeaderText(), getPTagText());

        return list;
    }

    public int randomLanguage() {

        return (int) (Math.random() * getQuantityTDLinks()) + 1;
    }

    public int randomIndex(){

        return randomLanguage() - 1;
    }

    public WebElement getRandomTr(){

       return getTrTags().get(randomIndex());
    }

     public String getTrText(String languageName) {
        StringBuilder actualResult = new StringBuilder();

        for (String tr : getTrTagsText()){
            if(tr.contains(languageName)){

               return actualResult.append(tr).toString();
            }
        }

        return null;
    }

    public String getExpectedResult(String languageName) {
        List<String> languageInformation = new ArrayList<>();
        languageInformation.add("Joy inforichland 07/05/09 0");
        for(String language : languageInformation){
            String name = language.split(" ")[0];
            if(name.equals(languageName)){

                return language;
            }
        }

        return null;
    }
}