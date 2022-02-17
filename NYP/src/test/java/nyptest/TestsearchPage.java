package nyptest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPage;

public class TestsearchPage extends CommonAPI {

    @Test
    public void search(){
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchIcon();
        searchPage.searchIconClickNEnterNewsNSubmit();
        searchPage.clickOnSubmitButton();
    }

}
