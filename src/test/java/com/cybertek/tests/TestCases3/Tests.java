package com.cybertek.tests.TestCases3;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import com.cybertek.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Tests {
    protected WebDriver driver;
    protected String url;
    Actions actions;

    @BeforeMethod
    public void setupMethod() {
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        url= ConfigurationReader.get("url");
        driver.get(url);

    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        Driver.closeDriver();
    }
    @Test
    public void Test1(){
driver.get(url);
        LoginPage loginpage=new LoginPage();
        loginpage.userName.sendKeys("storemanager85");
        loginpage.password.sendKeys("UserUser123");
        loginpage.submit.click();




    }
}
