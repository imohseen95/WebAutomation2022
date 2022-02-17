package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SectionMenuPage {

    @FindBy(how = How.CSS, using = ".menu-toggle__title")
    public static WebElement sectionMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(2) a")
    public static WebElement metroSectionWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(4) a")
    public static WebElement sportsSectionWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(7) a")
    public static WebElement businessSectionWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(9) a")
    public static WebElement entertainmentSectionWebElement;

    public void clickOnSectionMenu(){
        sectionMenuWebElement.click();
    }
    public MetroPage goToMetroPage(WebDriver driver){
        metroSectionWebElement.click();

        return new MetroPage(driver);
    }

    public SportsPage goToSportsPage(WebDriver driver){
        sportsSectionWebElement.click();

        return new SportsPage(driver);
    }

    public BusinessPage goToBusinessPage(WebDriver driver){
        businessSectionWebElement.click();

        return new BusinessPage(driver);
    }

    public EntertainmentPage goToEntertainmentPage(WebDriver driver){
        entertainmentSectionWebElement.click();

        return new EntertainmentPage(driver);
    }
}
