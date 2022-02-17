package pages;

import datafetch.FetchTheSteps;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class AllFunctionality {
    LogInPage logInPage = null;
    SearchPage SearchPage = null;
    LandingPage landingPage = null;
    SectionMenuPage SectionPage = null;

    String captureUrl = "https://nypost.com/";

    public void logIn(WebDriver driver){
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnLogIn();
        logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.enterEmailAddress("abc123@gmail.com");
        logInPage.enterPassword("abc123");
        //logInPage.clickOnLogInSubmitButton();
    }
    public void search(WebDriver driver){
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnSearch();
        SearchPage = PageFactory.initElements(driver, SearchPage.class);
        SearchPage.searchIconClickNEnterNewsNSubmit();
    }

    public void clickTheSectionMenu(WebDriver driver)throws InterruptedException {
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnSectionMenu();
    }

    public void sectionsMenu(WebDriver driver, String capturedUrl)throws InterruptedException {
        try {
            clickTheSectionMenu(driver);
        }catch (Exception ex){
            driver.navigate().to(capturedUrl);
            clickTheSectionMenu(driver);
        }
        SectionPage = PageFactory.initElements(driver,SectionMenuPage.class);
        String headLineNews = SectionPage.goToMetroPage(driver).getHeadLineNewsText();
        System.out.println(headLineNews);
        //clickOnSectionMenu(driver);
       // SectionPage.goToBusinessPage(driver).getHeadLineNewsText();
        //clickOnSectionMenu(driver);
        //SectionPage.goToEntertainmentPage(driver).getHeadLineNewsText();
    }

    public void runAllTheFeatureTest(WebDriver driver) throws InterruptedException, IOException {
        FetchTheSteps fetchTheSteps = new FetchTheSteps();
        String[] featureSteps = fetchTheSteps.getDataFromExcelFile();
        for (int i=1; i<featureSteps.length; i++){
            select(featureSteps[i], driver);
        }
    }
    public void select(String featureName, WebDriver driver)throws InterruptedException, IOException {

        switch(featureName){
            case "signUp": logIn(driver);
                break;
            case "sectionsMenu": sectionsMenu(driver,captureUrl);
                break;
            case "search": search(driver);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }
}
