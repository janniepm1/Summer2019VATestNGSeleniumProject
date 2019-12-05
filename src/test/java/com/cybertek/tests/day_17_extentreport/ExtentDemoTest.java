package com.cybertek.tests.day_17_extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentDemoTest {
protected String url;
Actions actions;

    // ExtentReports report; —> this class is used for starting and building the reports.
   protected ExtentReports report;
    // ExtentHtmlReporter htmlReporter; —> this class is used to create the HTML report file
   protected ExtentHtmlReporter htmlReporter;
    // ExtentTest extentLogger;—>  this will define a test, enables adding logs, authors, test info, etc
    protected ExtentTest extentLogger;
    @BeforeTest
    public void setUpTest(){
        report=new ExtentReports();
        String path=System.getProperty("user.dir"+"/test-output/report.html");
        htmlReporter =new ExtentHtmlReporter(path);
        report.attachReporter(htmlReporter);
        htmlReporter.config().setReportName("Regression Test");


    }

    @BeforeMethod
    public void setUp(){
        // initialize the classes
        report = new ExtentReports();

        // create report path
        // System.getProperty("user.dir")  --> returns the location/path of my project
        // "/test-output/report.html" --> report will be in test output folder, name --> report.html
        String path = System.getProperty("user.dir") + "/test-output/report.html";

        // initialize the html reporter with the report path
        htmlReporter = new ExtentHtmlReporter(path);

        // attach the html report to the report object
        report.attachReporter(htmlReporter);

        // set the title of the report
        htmlReporter.config().setReportName("Vytrack smoke tests");

        // set environment information
        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("browser", "chrome");
        report.setSystemInfo("whats my name", "John B Goodenough");

    }
    @Test
    public void test1(){
        // give name to the current test
        extentLogger = report.createTest("TC001 Login as driver test");
        // test steps
        extentLogger.info("Open chrome");
        extentLogger.info("go to url");
        extentLogger.info("enter driver login info");
        extentLogger.info("click submit");
        extentLogger.info("click verify logged in");
        extentLogger.pass("TC001 passed");
    }







    @AfterMethod
    public void close(){
        // this is when the report is actually created
        report.flush();
    }

}