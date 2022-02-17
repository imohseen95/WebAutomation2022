package home;

import datasupply.DropDownMenu;
import org.testng.annotations.Test;

public class TestDropDownMenu extends DropDownMenu {
     @Test
    public void dropDown(){
        fetchDropDownMenu();
    }
}
