package googlepackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearch extends CommonAPI{

        public void googleItemsSearch() throws Exception {
            GoogleDataSupply googleDataSupply = new GoogleDataSupply();
            List<String> products = googleDataSupply.getItemsFromDB();
            for(String product:products){
                typeOnSearchBox("//input[@class='gLFyf gsfi']", product);
                Thread.sleep(1000);
                clearSearchBox("//input[@class='gLFyf gsfi']");
            }
        }


        public void googleSearchSelection() throws InterruptedException {
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Testing");
            sleepFor(5);
            List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
            sleepFor(5);
            System.out.println("Total no of suggestions :" + list.size());

            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i).getText());
                if(list.get(i).getText().equalsIgnoreCase("testing sites nyc")){
                    list.get(i).click();
                    break;
                }
            }
        }
}
