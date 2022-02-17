package nyptest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SectionMenuPage;

public class TestNYPSectionMenu extends CommonAPI {

    @Test
    public void sectionMenu(){
        SectionMenuPage sectionMenuPage = PageFactory.initElements(driver, SectionMenuPage.class);
        sectionMenuPage.clickOnSectionMenu();
        sectionMenuPage.goToMetroPage(driver).getHeadLineNewsText();
    }

}