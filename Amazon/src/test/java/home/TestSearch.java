package home;

import base.CommonAPI;
import datasupply.SearchItems;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestSearch extends SearchItems {

    @Test
    public void testSearchAmazonProducts() throws Exception {
       itemsSearch();


    }
}
