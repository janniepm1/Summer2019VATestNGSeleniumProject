package com.cybertek.tests.TestCaseAssignment;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase7 {
    /*
    Step 1. Go to https://practice-cybertekschool.herokuapp.comStep 2. Click on “Registration Form”
    Step 3. Enter “testers@email” into email input box.Step 4. Verify that warning message is displayed:
     “email address is not a valid Email format is not correct”
     */
    public static void main(String[] args) throws Exception{
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get(" https://practice-cybertekschool.herokuapp.com");
        WebElement registf=driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        registf.click();
       WebElement email= driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[3]/div/small[2]"));
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a")).click();
        Thread.sleep(2000);
        WebElement nameInput = driver.findElement(By.name("email"));
        Thread.sleep(2000);
        nameInput.sendKeys("testers@email");
        String expected = "email address is not a valid\n" +
                "Email format is not correct";
        System.out.println("Warning message displayed: "+"\n"+expected);
        WebElement text1 = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[4]/div/small[2]"));
        String actual = text1.getText();
        System.out.println(text1.getText());
        WebElement text2 = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[4]/div/small[3]"));
        String actual1 = text2.getText();
        System.out.println(text2.getText());
        String Error = actual+"\n"+actual1;
        if(expected.equals(Error)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        driver.quit();
    }


    }

