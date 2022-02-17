package Ghome;

import googlepackage.SignIn;
import org.testng.annotations.Test;

public class TestSignIn extends SignIn {
    @Test
    public void signIn() throws InterruptedException {
        signInto();
    }
}
