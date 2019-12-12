package com.cybertek.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import com.cybertek.Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected WebDriver driver;

    protected String url;
    Actions actions;

    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest extentLogger;

    @BeforeTest
    public void setUpTest() {
        report = new ExtentReports();
        String path = System.getProperty("user.dir") + "/test-output/report.html";
        htmlReporter = new ExtentHtmlReporter(path);
        report.attachReporter(htmlReporter);

        htmlReporter.config().setReportName("Regression tests");

        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS", System.getProperty("os.name"));

    }

    @AfterTest
    public void tearDownTest(){
        report.flush();
    }


    @BeforeMethod
    @Parameters("env")
    public void setupMethod(@Optional String env) {
        System.out.println("env = " + env);
        // ENV IS null use default url,
        // if ENV is not null, get the url based on env
        if (env == null) {
            url = ConfigurationReader.get("url");
        } else {
            url = ConfigurationReader.get(env+"_url");
        }

        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterMethod
    public void teardown(ITestResult result) throws InterruptedException, IOException {
        // IF FAILED TAKE SCREENSHOT
        if(result.getStatus() == ITestResult.FAILURE){
            // record the name of the failed testcase
            extentLogger.fail(result.getName());
            // take screenshot and return location of the screenshot
            String screenshot = BrowserUtils.getScreenshot(result.getName());
            extentLogger.addScreenCaptureFromPath(screenshot);
            // capture the exception
            extentLogger.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            // sometime tests are skipped, this is how we log skipped tests
            extentLogger.skip("Test Skipped: " + result.getName());
        }


        // CLOSE BROWSER
        Thread.sleep(1000);
        Driver.closeDriver();
    }


    public static class titleVerification {
        public static void main(String[] args) {
            ArrayList list = new ArrayList();
            list.add("http://practice.cybertekschool.com/");
            list.add("http://practice.cybertekschool.com/dropdown");
            list.add("http://practice.cybertekschool.com/login");
    //set up webdriver
            WebDriverManager.chromedriver().setup();
            //go to chrome
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/");
           // Thread.sleep(2000);
            String title1 = driver.getTitle();
            driver.close();
            driver.get("http://practice.cybertekschool.com/dropdown");
            String title2 = driver.getTitle();
            driver.close();
            driver.get("http://practice.cybertekschool.com/login");
            String title3 = driver.getTitle();
            driver.quit();


            if (title1.contains("http://practice.cybertekschool.com.") && title2.contains("http://practice.cybertekschool.com. ") &&
                    title3.contains("http://practice.cybertekschool.com. ")) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }


        }
    }

    public static class VyTrackUtilities {
        public static void login(WebDriver driver, String username, String password){
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager75");
            driver.findElement(By.id("prependedInput2")).sendKeys(password +
                    Keys.ENTER);

            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

    }
    }
}