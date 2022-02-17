package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TrackPackages {

    @FindBy(how = How.ID,using = "home-input")
    public static WebElement trackingPackagesWebElement;

    public void searchTrackPackage(){
        trackingPackagesWebElement.sendKeys("420112089261290210334700469716", Keys.ENTER);
    }

}
