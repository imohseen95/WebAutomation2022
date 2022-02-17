package UspsTest;

import Pages.Shop;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestShop extends CommonAPI {

    @Test
    public void goToStampShop() throws InterruptedException {
        Shop shop = PageFactory.initElements(driver, Shop.class);
        shop.hoverToShopWebElement();
        shop.goToStampShop(driver).getOnEdmoniaStampText();
        sleepFor(5);

        shop.hoverToShopWebElement();
        shop.goToStampShop(driver).getLunarStampText();
        sleepFor(5);

        shop.hoverToShopWebElement();
        shop.goToStampShop(driver).getBluberriesStampText();
        sleepFor(5);
    }
}




