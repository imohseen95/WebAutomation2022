package FacebookPackage;

import base.CommonAPI;
import org.openqa.selenium.By;

public class Messenger extends CommonAPI {
    public void goToMessenger() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Messenger']")).click();
        sleepFor(7);

        driver.findElement(By.name("email")).sendKeys("abc123@gmail.com");
        sleepFor(4);
        driver.findElement(By.name("pass")).sendKeys("qwerty123");
        sleepFor(4);
    }
}
