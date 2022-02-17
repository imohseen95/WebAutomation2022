package UspsTest;

import Pages.TrackPackages;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestTrackPackagesSearchBar extends CommonAPI {

    @Test
    public void searchTrackPackage() throws InterruptedException {
        TrackPackages trackPackages = PageFactory.initElements(driver, TrackPackages.class);
        trackPackages.searchTrackPackage();
        sleepFor(8);

    }
}
