package datasupply;

import database.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.List;

public class SupplyData{
    public static List<String> getTestData(){
        ArrayList <String> listOfItems = new ArrayList<String>();
        listOfItems.add("Macbook");
        listOfItems.add("Iphone");
        listOfItems.add("tennis");
        listOfItems.add("ball");
        listOfItems.add("shampoo");

        return listOfItems;

    }

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public  List<String> getItemListFromDB() throws Exception {
        List<String> list = connectToSqlDB.readDataBase("Items","Items");

        return list;
    }

}