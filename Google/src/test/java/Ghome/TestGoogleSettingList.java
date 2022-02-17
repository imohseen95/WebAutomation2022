package Ghome;

import googlepackage.GoogleSettingsList;
import org.testng.annotations.Test;

public class TestGoogleSettingList extends GoogleSettingsList {
    @Test
    public void settingListTest() throws InterruptedException {
        goToSearchSetting();
        goToAdvancedSetting();
        goToSearchHelp();
        darkThemeOnOff();
    }
}
