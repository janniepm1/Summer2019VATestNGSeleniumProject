package com.cybertek.tests.JavascriptExecution;

import com.cybertek.Utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTest {
    WebDriver driver;

    @BeforeMethod
    public void setUpTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterMethod
    public void TearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }
    @Test
    public void hover() throws InterruptedException {
        Actions actions =new Actions(driver);
        driver.get("http://practice.cybertekschool.com/hovers");
        Thread.sleep(1000);
        WebElement element =driver.findElement(By.tagName("img"));
        //moveto element ===move the mouse to given target
        //perform==triggers the action
        actions.moveToElement(element).perform();//will move the mouse to element

    }

}
