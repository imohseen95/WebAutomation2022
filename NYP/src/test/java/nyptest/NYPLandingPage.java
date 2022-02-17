package nyptest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LandingPage;

public class NYPLandingPage extends CommonAPI {

    //@Test
    public void getLandingPageTitle() throws InterruptedException {
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }

    //@Test
    public void clickOnSectionMenuTab() {
        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnSectionMenu();
    }

    @Test
    public void clickOnSearch() {
        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnSearch();
    }

    @Test
    public void clickOnLogIn() {
        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnLogIn();
    }
}
