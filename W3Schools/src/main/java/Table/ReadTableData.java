package Table;

import base.CommonAPI;
import org.openqa.selenium.By;

public class ReadTableData extends CommonAPI {
    public void readTableData(){
        //to get entire table using xpath and css selector
        //String readData = driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']")).getText();
        //String readData = driver.findElement(By.cssSelector(".ws-table-all.notranslate")).getText();

        //to get 1st row
        //String readData = driver.findElement(By.cssSelector(".ws-table-all.notranslate tr:nth-child(1)")).getText();

        //to target data by passing row tr and column td
        String readData = driver.findElement(By.cssSelector(".ws-table-all.notranslate tr:nth-child(4) td:nth-child(5)")).getText();

        System.out.println(readData);
    }


}
