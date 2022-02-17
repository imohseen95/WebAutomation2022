package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.CSS, using = "#mail-ship-width")
    public static WebElement sendWebElement;

    @FindBy(how = How.XPATH, using = "//a[text()='Receive']")
    public static WebElement receiveWebElement;

    @FindBy(how = How.XPATH, using = "//a[text()='Shop']")
    public static WebElement shopWebElement;

    @FindBy(how = How.XPATH, using = "//a[text()='Business']")
    public static WebElement businessWebElement;

    @FindBy(how = How.XPATH, using = "//a[text()='Search USPS.com']")
    public static WebElement searchWebElement;

    public void clickOnSendWebElement() {
        sendWebElement.click();
    }

    public void clickOnReceiveWebElement() {
        receiveWebElement.click();
    }

    public void clickOnShopWebElement() {
        shopWebElement.click();
    }

    public void clickOnBusinessWebElement() {
        businessWebElement.click();
    }

    public void clickOnSearchWebElement() {
        searchWebElement.click();
    }

}