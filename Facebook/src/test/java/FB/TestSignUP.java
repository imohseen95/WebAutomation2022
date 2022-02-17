package FB;

import FacebookPackage.SignUp;
import org.testng.annotations.Test;

public class TestSignUP extends SignUp {

    @Test
    public void signingUp() throws InterruptedException {
        fbSignUP();
    }
}
