package FB;


import FacebookPackage.Messenger;
import org.testng.annotations.Test;

public class TestMessenger extends Messenger {

    @Test
    public void testGoToMessenger() throws InterruptedException {
        goToMessenger();
    }
}
