package FacebookPackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUp extends CommonAPI {

    public void fbSignUP() throws InterruptedException {
        sleepFor(2);
        driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
        sleepFor(6);
        WebElement monthElement = driver.findElement(By.id("month"));
        WebElement dayElement = driver.findElement(By.id("day"));
        WebElement yearElement = driver.findElement(By.id("year"));

        Select monthDropDown = new Select(monthElement);
        Select dayDropDown = new Select(dayElement);
        Select yearDropDown = new Select(yearElement);

        monthDropDown.selectByVisibleText("Feb");
        dayDropDown.selectByVisibleText("12");
        yearDropDown.selectByVisibleText("1990");
        sleepFor(3);

        driver.findElement(By.name("firstname")).sendKeys("Peter");
        driver.findElement(By.name("lastname")).sendKeys("Parker");
        sleepFor(3);
        driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
        sleepFor(3);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
        sleepFor(3);
        driver.findElement(By.name("reg_passwd__")).sendKeys("password12345");
        sleepFor(3);

        driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
        sleepFor(5);
       // driver.findElement(By.name("websubmit")).click();


    }
}
