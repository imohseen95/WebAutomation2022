package Ghome;

import googlepackage.GoogleTitle;
import org.testng.annotations.Test;

public class TestGoogleTitle extends GoogleTitle {
    @Test
    public void googlePageTitle(){
        fetchGoogleTitle();
    }
}
