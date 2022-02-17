package googlepackage;
import org.openqa.selenium.WebElement;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class SignIn extends CommonAPI {
    public void signInto() throws InterruptedException {
        clickOnSignIn("//a[contains(text(),'Sign')]");
        Thread.sleep(5000);
        clickOnAddAnotherAccount("//div[contains(text(),'Use')]");
        sleepFor(8);
        sendCredentials("//input[@name='identifier']","imohseen95@gmail.com");
        sleepFor(5);
    }
}
