package googlepackage;

import base.CommonAPI;
import org.openqa.selenium.By;

import java.util.List;

public class GoogleSettingsList extends CommonAPI {

    public void goToSearchSetting() throws InterruptedException {
        driver.findElement(By.cssSelector(".EzVRq")).click();
        sleepFor(5);
        driver.findElement(By.xpath("//ul[@role='menu']//li/descendant::a[text()='Search settings']")).click();
        sleepFor(5);
        driver.navigate().back();
    }

    public void goToAdvancedSetting() throws InterruptedException {
        driver.findElement(By.cssSelector(".EzVRq")).click();
        sleepFor(5);
        driver.findElement(By.xpath("//ul[@role='menu']//li/descendant::a[text()='Advanced search']")).click();
        sleepFor(5);
        driver.navigate().back();
    }

    public void goToSearchHelp() throws InterruptedException {
        driver.findElement(By.cssSelector(".EzVRq")).click();
        sleepFor(5);
        driver.findElement(By.xpath("//ul[@role='menu']//li/descendant::a[text()='Search help']")).click();
        sleepFor(5);
        driver.navigate().back();
    }
    public void darkThemeOnOff() throws InterruptedException {
        driver.findElement(By.cssSelector(".EzVRq")).click();
        sleepFor(5);
        driver.findElement(By.xpath("//div[@class='tFYjZe']")).click();
        sleepFor(5);

        driver.findElement(By.cssSelector(".EzVRq")).click();
        sleepFor(5);
        driver.findElement(By.xpath("//div[@class='tFYjZe']")).click();
        sleepFor(5);

    }
}
