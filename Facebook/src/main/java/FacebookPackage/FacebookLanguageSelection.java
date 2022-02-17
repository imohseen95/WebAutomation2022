package FacebookPackage;

import base.CommonAPI;
import org.openqa.selenium.By;

public class FacebookLanguageSelection extends CommonAPI {
    public void selectLanguageEspanol() throws InterruptedException {
        selectLanguages("//a[text()='Español']");
        sleepFor(5);
    }

    public void selectLanguageEnglish() throws InterruptedException {
        selectLanguages("//a[text()='English (US)']");
        sleepFor(5);
    }

    public void selectLanguageFrance() throws InterruptedException {
        selectLanguages("//a[text()='Français (France)']");
        sleepFor(5);
    }

    public void selectLanguageArabic() throws InterruptedException {
        selectLanguages("//a[text()='العربية']");
        sleepFor(5);
    }












}
