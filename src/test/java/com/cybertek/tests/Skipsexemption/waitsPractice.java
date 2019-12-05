package com.cybertek.tests.Skipsexemption;


import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class waitsPractice {

    WebDriver driver;
    @BeforeMethod
    public void setup() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

    }

    @Test
    public void test1() {
        String locator = "#checkbox > input";
        WebDriverWait wait = new WebDriverWait(driver, (20));
//        wait.until(ExpectedConditions.visibilityOf());
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(locator)));
//    }
    }
}
