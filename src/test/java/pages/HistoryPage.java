package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HistoryPage {

    private WebDriver driver;

    private final By H2_HEADER = By.xpath("//div[@id='main']/h2");
    private final By PRE_ELEMENTS = By.xpath("//div[@id='main']/pre");
    private static final String LANG_VERSION = "REM BASIC Version of 99 ";

    public HistoryPage(WebDriver existingDriver){

        this.driver = existingDriver;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public WebElement getH2Header() {

        return getDriver().findElement(H2_HEADER);
    }

    public String getH2HeaderText() {

        return getH2Header().getText();
    }

    protected List<String> takeTextOfCode() {

        String b = "bottle(s) of beer";
        String w = " on the wall,";
        String T = "Take one down and pass it around,";
        String Pr = "PRINT ";
        String X = "X";
        String smc = ";";
        String quo = "\"";
        String B = Character.toString(
                        b.charAt(0)
                )
                .toUpperCase() + b.substring(1);

        String B2 = B
                .replace("(", "")
                .replace(")", "");

        String w1 = w
                .replace(",", "");

        List<String> basicCode = new ArrayList<>();

        basicCode.add(
                LANG_VERSION
                        .concat(B2)
        );
        basicCode.add(
                "FOR "
                        .concat(X)
                        .concat("=100 TO 1 STEP -1")
        );
        basicCode.add(
                Pr
                        .concat(X)
                        .concat(smc)
                        .concat(quo)
                        .concat(B)
                        .concat(w)
                        .concat(quo)
                        .concat(smc)
                        .concat(X)
                        .concat(smc)
                        .concat(quo)
                        .concat(b)
                        .concat(quo)
        );
        basicCode.add(
                Pr
                        .concat(quo)
                        .concat(T)
                        .concat(quo));
        basicCode.add(
                Pr
                        .concat(X)
                        .concat("-1")
                        .concat(smc)
                        .concat(quo)
                        .concat(b)
                        .concat(w1)
                        .concat(quo)
        );
        basicCode.add("NEXT");

        return basicCode;
    }

    public String createBasicCode() {
        StringBuilder basicCode = new StringBuilder();
        int count = 10;
        String sp = " ";
        String ln = "\n";

        for (int i = 0; i < takeTextOfCode().size() - 1; i ++ ) {

            basicCode.append(count)
                    .append(sp)
                    .append(takeTextOfCode().get(i))
                    .append(ln);
            count+=10;

            if(count == 60) {
                basicCode.append(count)
                        .append(sp)
                        .append(takeTextOfCode().get(takeTextOfCode().size() - 1));
            }
        }
        return basicCode.toString();
    }

    public String getCodeOfLanguageBasic() {

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
}
