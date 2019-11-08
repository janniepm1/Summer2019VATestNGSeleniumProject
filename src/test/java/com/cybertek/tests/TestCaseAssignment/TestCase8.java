package com.cybertek.tests.TestCaseAssignment;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase8 {
    /*
  Test case #8
   1. Go to https://practice-cybertekschool.herokuapp.com
   2. Click on “Registration Form”
   3. Enter “5711234354” into phone number input box.
   4. Verify that warning message is displayed:
      “Phone format is not correct”
   */
    public static void main(String[] args) throws Exception {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a")).click();
        Thread.sleep(2000);
        WebElement nameInput = driver.findElement(By.name("phone"));
        Thread.sleep(2000);
        nameInput.sendKeys("5711234354");
        String expected = "Phone format is not correct";
        System.out.println("Warning message displayed: "+expected);
        WebElement text = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[6]/div/small[2]"));
        String actual = text.getText();
        System.out.println(text.getText());
        if(expected.equals(actual)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        driver.quit();
    }
}

