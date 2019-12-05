package com.cybertek.tests.SleniumHW2;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class vyTrackTest {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
         driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }

    @Test
    public void Test1()throws InterruptedException{
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
    }
}
