package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage {
    @FindBy(how = How.CSS,using = ".site-header__search-toggle")
    public static WebElement searchIconWebElement;

    @FindBy(how = How.CSS,using = "input#search-input-header.search__input")
    public static WebElement searchInputFieldWebElement;

    @FindBy(how = How.CSS,using = "button.search__submit")
    public static WebElement searchSubmitButtonWebElement;

    public void searchIcon(){
        searchIconWebElement.click();
    }

    public void typeOnSearchField(String value){
        searchInputFieldWebElement.sendKeys(value, Keys.ENTER);
    }
    public void clickOnSubmitButton(){
        searchSubmitButtonWebElement.click();
    }
    public void searchIconClickNEnterNewsNSubmit(){
        typeOnSearchField("covid-19");
        //clickOnSubmitButton();
    }
    public void clickOnSearchButton(){
        searchSubmitButtonWebElement.click();
    }
}
