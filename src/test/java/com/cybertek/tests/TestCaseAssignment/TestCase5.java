package com.cybertek.tests.TestCaseAssignment;

import com.cybertek.Utilities.StringUtility;
import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase5 {
    /*
    Step 1. Go to https://practice-cybertekschool.herokuapp.comStep 2
    . Click on “Registration Form”Step 3. Enter “123” into last name input box.Step 4
    . Verify that warning message is displayed: “The last name can only consist of alphabetical letters and dash
     */
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get(" https://practice-cybertekschool.herokuapp.com");
        WebElement registf=driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        registf.click();
        WebElement lastname=driver.findElement(By.name("lastname"));
        lastname.sendKeys("123");
        WebElement expected=driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/small[3]"));
        System.out.println(expected.getText());
        String warning="The last name can only consist of alphabetical letters and dash";

        StringUtility.verifyEquals(expected.getText(),warning);
driver.quit();
    }
}
