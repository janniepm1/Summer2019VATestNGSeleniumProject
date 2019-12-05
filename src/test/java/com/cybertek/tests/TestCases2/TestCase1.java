package com.cybertek.tests.TestCases2;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void Test1() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com");
driver.findElement(By.linkText("Registration Form")).click();
driver.findElement(By.name("birthday")).sendKeys("wrong_dob");
Thread.sleep(2000);
String expected="The date of birth is not valid";
WebElement errorMsg=driver.findElement(By.xpath("(//div[@class='col-sm-5'])[8]/small[@data-bv-result='INVALID']"));

String actual =errorMsg.getText();
Assert.assertEquals(actual,expected);



    }
    @Test
    public void Test2(){

    }
    @Test
    public void Test3(){

    }
    @Test
    public void Test4(){

    }
    @Test
    public void Test5(){

    }
}
