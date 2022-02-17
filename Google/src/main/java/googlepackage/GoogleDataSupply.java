package googlepackage;

import database.ConnectToSqlDB;

import java.util.List;

public class GoogleDataSupply {


    public List<String> getItemsFromDB() throws Exception {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("Items","Items");

        return list;
    }
}
