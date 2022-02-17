package datasupply;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DropDownMenu extends CommonAPI {
    public void fetchDropDownMenu(){
        List<String> menuItems = getListOfText(".nav-search-dropdown option");
        for(String item:menuItems){
            System.out.println(item);
        }
    }
}
