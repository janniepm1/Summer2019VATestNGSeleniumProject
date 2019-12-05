package com.cybertek.tests.ExplicitWait;

import com.cybertek.Utilities.VyTrackUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.security.auth.login.Configuration;
import java.sql.Driver;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class TestBase {
    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setUpMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://qa3.vytrack.com/");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void storeManager() throws InterruptedException {
        VyTrackUtilities.login(driver,"storemanager51","UserUser123");

        Thread.sleep(2000);
        String xpath = "//span[@class='title title-level-1'and contains(text(), 'Sales')]";
        Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
        driver.quit();
    }
    @Test
    public void driverTest(){
        VyTrackUtilities.login(driver,"user15","UserUser123");
        String xpath = "//span[@class='title title-level-1'and contains(text(), 'Sales')]";
       try{
           Assert.assertFalse(driver.findElement(By.xpath(xpath)).isDisplayed());

       }catch(NoSuchElementException e){//do not leave empty exemption
         e.printStackTrace();
       }



    }
    }

