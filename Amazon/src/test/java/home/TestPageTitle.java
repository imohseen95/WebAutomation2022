package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestPageTitle extends CommonAPI {
    @Test
    public void pageTitle() throws InterruptedException {
        String pageTitle = "Amazon.com. Spend less. Smile more.";
        String expectedTitle = driver.getTitle();
        System.out.println(expectedTitle);
    }
}
