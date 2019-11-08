package com.cybertek.tests.TestCaseAssignment;

import com.cybertek.Utilities.StringUtility;
import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase6 {
    /*
Test case #6 Step 1. Go to https://practice-cybertekschool.herokuapp.comStep
2. Click on “Registration Form”Step 3. Enter “user” into username input box.Step
4. Verify that warning message is displayed: “The username must be more than 6 and less than 30 characters long
     */
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get(" https://practice-cybertekschool.herokuapp.com");
        WebElement registf=driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        registf.click();
        WebElement lastname=driver.findElement(By.name("username"));
        lastname.sendKeys("user");
        WebElement expected=driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[3]/div/small[2]"));
        System.out.println(expected.getText());
        String warning="The username must be more than 6 and less than 30 characters long";

        StringUtility.verifyEquals(expected.getText(),warning);
        driver.quit();
    }
}
