package FB;

import FacebookPackage.FacebookLanguageSelection;
import org.testng.annotations.Test;

public class TestFBLanguage extends FacebookLanguageSelection {


        @Test
        public void languageSelect() throws InterruptedException {
        selectLanguageEspanol();
        selectLanguageEnglish();
        selectLanguageArabic();
        selectLanguageFrance();

    }
}
