package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class StampShop {
    private final WebDriver driver;

    public StampShop(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.CSS, using = ".results-product-info div:nth-child(1)")
    public static WebElement edmoniaStampWebElement;

    @FindBy(how = How.XPATH, using = "//div[text()='Lunar New Year: Year of the Tiger Stamps']")
    public static WebElement lunarStampWebElement;


    @FindBy(how = How.XPATH, using = "//div[text()='Blueberries Stamps']")
    public static WebElement blueberriesStampWebElement;

    public String getOnEdmoniaStampText() {
        String expected = "Edmonia Lewis Stamps";
        String actual = edmoniaStampWebElement.getText();
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
        return actual;
    }

    public String getLunarStampText() {
        String expected = "Lunar New Year: Year of the Tiger Stamps";
        String actual = lunarStampWebElement.getText();
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
        return actual;
    }

    public String getBluberriesStampText() {
        String expected = "Blueberries Stamp";
        String actual = blueberriesStampWebElement.getText();
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
        return actual;
    }
}
