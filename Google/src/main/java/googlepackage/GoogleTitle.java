package googlepackage;

import base.CommonAPI;
import org.testng.Assert;

public class GoogleTitle extends CommonAPI {

    public void fetchGoogleTitle(){
        String actualTitle = "Google";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
