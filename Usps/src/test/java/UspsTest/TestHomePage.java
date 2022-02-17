package UspsTest;

import Pages.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {


    @Test
    public void clickOnSendWebElement() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSendWebElement();
        sleepFor(2);
    }

    @Test
    public void clickOnReceiveWebElement() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnReceiveWebElement();
        sleepFor(2);

    }
    @Test
    public void clickOnShopWebElement() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnShopWebElement();
        sleepFor(2);

    }

    @Test
    public void clickOnSearchWebElement() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearchWebElement();
        sleepFor(2);

    }
}

