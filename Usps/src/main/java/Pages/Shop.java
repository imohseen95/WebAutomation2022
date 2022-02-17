package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.swing.*;

import static base.CommonAPI.driver;

public class Shop {

    @FindBy(how = How.XPATH, using = "//a[text()='Shop']")
    public static WebElement shopWebElement;

    @FindBy(how = How.XPATH, using = "//a[text()='Stamps']")
    public static WebElement stampsShopWebElement;
//#menu-main-menu li:nth-child(7) a"

    public void hoverToShopWebElement() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(shopWebElement).build().perform();
        Thread.sleep(2000);
    }

    public StampShop goToStampShop(WebDriver driver){
        stampsShopWebElement.click();
        return new StampShop(driver);
    }
}
