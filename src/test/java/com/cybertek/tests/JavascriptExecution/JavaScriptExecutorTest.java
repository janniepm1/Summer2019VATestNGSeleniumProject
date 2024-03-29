package com.cybertek.tests.JavascriptExecution;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest {
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
    public void jset1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com");
        Thread.sleep(2000);
        //this is how you create javascript executor object
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //jse will execute the command we passing in string
        jse.executeScript("alert('Welcome to Cybertek');");

    }

    @Test
    public void scroll() throws InterruptedException {//when you want to go from top to botton ot otherwise
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        Thread.sleep(2000);

        //loop so it can scroll down 5 or any number you want to scroll down

        for (int i = 0; i < 5; i++) {
            jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");

            Thread.sleep(1000);

        }
    }
    @Test
    public void scrollToElement() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("http://practice.cybertekschool.com/large");

        WebElement link =driver.findElement(By.linkText("Cybertek School"));
        Thread.sleep(1000);
        //executeScript is overloaded method and can take string and Webelement params
        jse.executeScript("arguments[0].scrollIntoView(true)",link);
    }
    @Test
    public void click() throws InterruptedException {//will click on element in this case link
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("http://practice.cybertekschool.com/large");

        WebElement link =driver.findElement(By.linkText("Cybertek School"));
        Thread.sleep(1000);
        //executeScript is overloaded method and can take string and Webelement params
        jse.executeScript("arguments[0].click()",link);

    }
    @Test
    public void type() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        Thread.sleep(1000);
            WebElement input=driver.findElement(By.cssSelector("#input-example>input"));
String string="blah blah blah";
input.findElement(By.xpath("(//button[@type='button'])[2]")).click();

Thread.sleep(1000);
//you can also assign it to a string and call it in attribute

           jse.executeScript("arguments[0].setAttribute('value','blah blah blah')",input);



    }

}