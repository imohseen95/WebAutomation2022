package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage {

    @FindBy(how = How.CSS, using = ".menu-toggle__title")
    public static WebElement sectionNavBarWebElement;

    @FindBy(how = How.CSS, using = ".site-header__search-toggle")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = "#nypost-membership-header")
    public static WebElement logInWebElement;

    @FindBy(how = How.CSS, using = ".input-container")
    public static WebElement logInSubmitWebElement;

    public void clickOnSectionMenu(){
        sectionNavBarWebElement.click();
    }
    public void clickOnSearch(){
        searchWebElement.click();
    }
    public void clickOnLogIn(){
        logInWebElement.click();
    }
    public void clickOnLogInSubmitButton(){
        logInSubmitWebElement.click();
    }
}