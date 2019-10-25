package com.cybertek.tests.day3_webelement_class;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

/*
    open browser
go to http://practice.cybertekschool.com/forgot_password
enter any email
click on Retrieve password
verify that url changed to http://practice.cybertekschool.com/email_sent
     */
    public class VerifyUrlChanged {
        public static void main(String[] args) throws Exception{

            //open browser
            WebDriver driver= WebDriverFactory.getDriver("chrome");
            //go to http://practice.cybertekschool.com/forgot_password
            driver.get("http://practice.cybertekschool.com/forgot_password");
            //enter any mail
            WebElement emailInput=driver.findElement(By.name("email"));

            emailInput.sendKeys("janniepm258@gmail.com");
//click on retrieve password
            WebElement retievepassword=driver.findElement(By.id("form_submit"));
            retievepassword.click();
            Thread.sleep(3000);

            //verify that url changed to http://practice.cybertekschool.com/email_sent
            String expected="http://practice.cybertekschool.com/email_sent";
            String actual=driver.getCurrentUrl();
            if(expected.equals(actual)){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
            }
            //close browser
            driver.quit();
        }
}
