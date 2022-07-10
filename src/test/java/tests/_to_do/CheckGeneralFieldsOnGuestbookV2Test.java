package tests._to_do;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class CheckGeneralFieldsOnGuestbookV2Test extends BaseTest {
    public final String START_URL = ("http://www.99-bottles-of-beer.net/");

    @Test
    public void signGuestBookTest() {

        String name = "Name:";
        String location = "Location: (optional)";
        String email = "E-Mail:";
        String homePage = "Homepage (optional):";
        String securityCode = "Security Code:";
        String message = "Message::";

        StringBuilder expectedResult = new StringBuilder();
        expectedResult
                .append(name)
                .append("\n\n")
                .append(location)
                .append("\n\n")
                .append(email)
                .append("\n\n")
                .append(homePage)
                .append("\n\n")
                .append(securityCode)
                .append("\n  \n")
                .append(message);

        getDriver().get(START_URL);
        getDriver().findElement(By.linkText("GUESTBOOK")).click();
        getDriver().findElement(By.linkText("Sign Guestbook")).click();

        List<WebElement> ps = getDriver().findElements(By.xpath("//form[@id='addentry']/p"));
        List<String> actualResult = new ArrayList<>();

        for (WebElement p : ps) {
            if (p.getText().contains(name)) {
                actualResult.add(p.getText());
            }
        }
        Assert.assertEquals(actualResult.size(), 1);
        Assert.assertEquals(actualResult.get(0), expectedResult.toString());
    }
}