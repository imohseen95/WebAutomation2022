package datasupply;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import reporting.TestLogger;

import java.util.List;
public class SearchItems extends CommonAPI {
    /*public void itemsSearch() throws InterruptedException {
        List <String> products = SupplyData.getTestData();
        for(String product:products){
          //  driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(product,Keys.ENTER);
            typeOnSearchBox("twotabsearchtextbox", product);
            Thread.sleep(1000);
            clearSearchBox("twotabsearchtextbox");
           // driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
        }
    }
}*/
    public void itemsSearch() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SupplyData supplyData = new SupplyData();
        List<String> products = supplyData.getItemListFromDB();
        for(String product:products){
            typeOnSearchBox("twotabsearchtextbox", product);
            Thread.sleep(1000);
            clearSearchBox("twotabsearchtextbox");
        }
    }
}