package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.description.type.TypeList;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    // public WebDriver driver = null;

   /* @Parameters({"url"})
    @BeforeMethod
    public void launchBrowserInstance(String url) {
        System.setProperty("webdriver.chrome.driver", "/Users/rejuanaahmed/IdeaProjects/WebAutomation2022/Generic/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }*/

    public String browserStackUserName = "mohseenahmed_VLHSsn";
    public String browserStackAccessKey = "KZ7tp3PHAaDzbLyX7VPH";
    public String sauceLabsUserName = "your sauce lab user name";
    public String sauceLabsAccessKey = "your sauce lab access key";

    public static WebDriver driver = null;


    @Parameters({"useCloudEnv", "envName", "os", "osVersion", "browserName", "browserVersion", "url"})
    @BeforeMethod
    public void setUp(String useCloudEnv, String envName, String OS, String osVersion, String browserName,
                      String browserVersion, String url) throws MalformedURLException {

        if (useCloudEnv.equalsIgnoreCase("true")) {
            //get cloud driver
            getCloudDriver(envName, OS, osVersion, browserName, browserVersion);
        } else {
            //get local driver
            getLocalDriver(OS, browserName);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        driver.manage().window().maximize();
    }


    public WebDriver getLocalDriver(String OS, String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            if (OS.equalsIgnoreCase("OS X")) {
               // System.setProperty("webdriver.chrome.driver", "/Users/rejuanaahmed/IdeaProjects/WebAutomation2022/Generic/Driver/chromedriver");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (OS.equalsIgnoreCase("Windows")) {
                //System.setProperty("webdriver.chrome.driver", "Generic/driver/chromedriver.exe");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (OS.equalsIgnoreCase("OS X")) {
               // System.setProperty("webdriver.gecko.driver", "Generic/driver/geckodriver");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (OS.equalsIgnoreCase("Windows")) {
                //System.setProperty("webdriver.gecko.driver", "Generic/driver/geckodriver.exe");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        } else if (browserName.equalsIgnoreCase("ie")) {
            if (OS.equalsIgnoreCase("Windows")) {
                //System.setProperty("webdriver.ie.driver", "Generic/driver/internetexplorerdriver.exe");
                WebDriverManager.iedriver();
                driver = new InternetExplorerDriver();
            }

        } else if (browserName.equalsIgnoreCase("safari")) {
            if (OS.equalsIgnoreCase("OS X"))
                //System.setProperty("webdriver.safari.driver", "Generic/driver/safaridriver");
                WebDriverManager.safaridriver();
                driver = new SafariDriver();
        }
        return driver;
    }


    public WebDriver getCloudDriver(String envName, String OS, String osVersion,
                                    String browserName, String browserVersion) throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", browserName);
        cap.setCapability("browserVersion", browserVersion);
        cap.setCapability("os", OS);
        cap.setCapability("osVersion", osVersion);


        if (envName.equalsIgnoreCase("browserstack")) {
            driver = new RemoteWebDriver(new URL("http://" + browserStackUserName + ":" + browserStackAccessKey +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        } else if (envName.equalsIgnoreCase("Saucelabs")) {
            driver = new RemoteWebDriver(new URL("http://" + sauceLabsUserName + ":" + sauceLabsAccessKey +
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        }

        return driver;
    }

    //executes at the last 
    @AfterMethod
    public void cleanUP() {
        driver.close();
    }


    public void sleepFor(int seconds) throws InterruptedException {
        Thread.sleep(1000 * seconds);
    }


    public void typeOnSearchBox(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            try {
                driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                }
            }
        }
    }


    public void clearSearchBox(String locator) {
        try {
            driver.findElement(By.cssSelector(locator)).clear();
        } catch (Exception ex1) {
            try {
                driver.findElement(By.xpath(locator)).clear();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(locator)).clear();
                } catch (Exception ex3) {
                }
            }
        }
    }

    public List<String> getListOfText(String locator) {
        List<WebElement> webElementList = driver.findElements(By.cssSelector(locator));
        List<String> listOfText = new ArrayList<>();
        for (WebElement element : webElementList) {
            listOfText.add(element.getText());
        }
        return listOfText;
    }

    public void clickOnSignIn(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void clickOnAddAnotherAccount(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void sendCredentials(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);

    }

    public void selectLanguages(String locator) throws InterruptedException {
        driver.findElement(By.xpath(locator)).click();
    }

    public void clickOnWebElement(String locator){
        try {
            driver.findElement(By.cssSelector(locator)).click();
        }catch (Exception ex1){
            try{
                driver.findElement(By.className(locator)).click();
            }catch (Exception ex2){
                try{
                    driver.findElement(By.id(locator)).click();
                }catch (Exception ex3){
                    driver.findElement(By.xpath(locator)).click();
                }
            }
        }
    }

    public void typeOnWebElementNHitEnter(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        }catch (Exception ex1){
            try{
                driver.findElement(By.className(locator)).sendKeys(value, Keys.ENTER);
            }catch (Exception ex2){
                try{
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }catch (Exception ex3){
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }

    public String getWebText(String locator){
        String text = "";
        try {
            text =  driver.findElement(By.cssSelector(locator)).getText();
        }catch (Exception ex1){
            try{
                text = driver.findElement(By.className(locator)).getText();
            }catch (Exception ex2){
                try{
                    text = driver.findElement(By.id(locator)).getText();
                }catch (Exception ex3){
                    text =  driver.findElement(By.xpath(locator)).getText();
                }
            }
        }
        return text;
    }
    public List<WebElement> getListOfWebElements(String locator){
        List<WebElement> elementList = driver.findElements(By.cssSelector(locator));
        return elementList;
    }
    public List<String> getListOfText(List<WebElement> elements){
        List<String> listOfText = new ArrayList<String>();
        for(WebElement element:elements){
            listOfText.add(element.getText());
        }
        return listOfText;
    }
    public void printText(List<String> list){
        for(String st:list){
            System.out.println(st);
        }
    }


    //Synchronization
    public static void waitUntilClickAble(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitUntilVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitUntilSelectable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }

    public static void waitUntilClickAble(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        }catch(Exception ex){
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        }
    }

    public static void waitUntilVisible(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(locator));
    }

    public static void waitUntilSelectable(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }

    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            //FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/screenshots/" + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
            ;
        }
    }
//    public static String convertToString(String st) {
//        String splitString = "";
//        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
//        return splitString;
//    }
}



